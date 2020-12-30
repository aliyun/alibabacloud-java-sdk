// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListInstancesOfUserResponseBody extends TeaModel {
    @NameInMap("Instances")
    public ListInstancesOfUserResponseBodyInstances instances;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListInstancesOfUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesOfUserResponseBody self = new ListInstancesOfUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesOfUserResponseBody setInstances(ListInstancesOfUserResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public ListInstancesOfUserResponseBodyInstances getInstances() {
        return this.instances;
    }

    public ListInstancesOfUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstancesOfUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesOfUserResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInstancesOfUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstancesOfUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbersPhoneNumber extends TeaModel {
        @NameInMap("TestOnly")
        public Boolean testOnly;

        @NameInMap("Trunks")
        public Integer trunks;

        @NameInMap("RemainingTime")
        public Integer remainingTime;

        @NameInMap("Number")
        public String number;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Usage")
        public String usage;

        @NameInMap("AllowOutbound")
        public Boolean allowOutbound;

        @NameInMap("PhoneNumberDescription")
        public String phoneNumberDescription;

        @NameInMap("PhoneNumberId")
        public String phoneNumberId;

        public static ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbersPhoneNumber build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbersPhoneNumber self = new ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbersPhoneNumber();
            return TeaModel.build(map, self);
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbersPhoneNumber setTestOnly(Boolean testOnly) {
            this.testOnly = testOnly;
            return this;
        }
        public Boolean getTestOnly() {
            return this.testOnly;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbersPhoneNumber setTrunks(Integer trunks) {
            this.trunks = trunks;
            return this;
        }
        public Integer getTrunks() {
            return this.trunks;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbersPhoneNumber setRemainingTime(Integer remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }
        public Integer getRemainingTime() {
            return this.remainingTime;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbersPhoneNumber setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbersPhoneNumber setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbersPhoneNumber setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbersPhoneNumber setAllowOutbound(Boolean allowOutbound) {
            this.allowOutbound = allowOutbound;
            return this;
        }
        public Boolean getAllowOutbound() {
            return this.allowOutbound;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbersPhoneNumber setPhoneNumberDescription(String phoneNumberDescription) {
            this.phoneNumberDescription = phoneNumberDescription;
            return this;
        }
        public String getPhoneNumberDescription() {
            return this.phoneNumberDescription;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbersPhoneNumber setPhoneNumberId(String phoneNumberId) {
            this.phoneNumberId = phoneNumberId;
            return this;
        }
        public String getPhoneNumberId() {
            return this.phoneNumberId;
        }

    }

    public static class ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbers extends TeaModel {
        @NameInMap("PhoneNumber")
        public java.util.List<ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbersPhoneNumber> phoneNumber;

        public static ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbers self = new ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbers();
            return TeaModel.build(map, self);
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbers setPhoneNumber(java.util.List<ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbersPhoneNumber> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public java.util.List<ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbersPhoneNumber> getPhoneNumber() {
            return this.phoneNumber;
        }

    }

    public static class ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUserDetail extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Email")
        public String email;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Department")
        public String department;

        @NameInMap("Phone")
        public String phone;

        public static ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUserDetail build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUserDetail self = new ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUserDetail();
            return TeaModel.build(map, self);
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUserDetail setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUserDetail setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUserDetail setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUserDetail setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUserDetail setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUser extends TeaModel {
        @NameInMap("UserId")
        public String userId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RamId")
        public String ramId;

        @NameInMap("Detail")
        public ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUserDetail detail;

        public static ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUser build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUser self = new ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUser();
            return TeaModel.build(map, self);
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUser setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUser setRamId(String ramId) {
            this.ramId = ramId;
            return this;
        }
        public String getRamId() {
            return this.ramId;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUser setDetail(ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUserDetail detail) {
            this.detail = detail;
            return this;
        }
        public ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUserDetail getDetail() {
            return this.detail;
        }

    }

    public static class ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdmin extends TeaModel {
        @NameInMap("User")
        public java.util.List<ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUser> user;

        public static ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdmin build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdmin self = new ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdmin();
            return TeaModel.build(map, self);
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdmin setUser(java.util.List<ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdminUser> getUser() {
            return this.user;
        }

    }

    public static class ListInstancesOfUserResponseBodyInstancesCallCenterInstance extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("StorageMaxSize")
        public Integer storageMaxSize;

        @NameInMap("StorageMaxDays")
        public Integer storageMaxDays;

        @NameInMap("MaxOnlineAgents")
        public Integer maxOnlineAgents;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("InstanceDescription")
        public String instanceDescription;

        @NameInMap("PhoneNumbers")
        public ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbers phoneNumbers;

        @NameInMap("ConsoleUrl")
        public String consoleUrl;

        @NameInMap("StorageBucket")
        public String storageBucket;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("Admin")
        public ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdmin admin;

        @NameInMap("TenantId")
        public String tenantId;

        public static ListInstancesOfUserResponseBodyInstancesCallCenterInstance build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesOfUserResponseBodyInstancesCallCenterInstance self = new ListInstancesOfUserResponseBodyInstancesCallCenterInstance();
            return TeaModel.build(map, self);
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstance setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstance setStorageMaxSize(Integer storageMaxSize) {
            this.storageMaxSize = storageMaxSize;
            return this;
        }
        public Integer getStorageMaxSize() {
            return this.storageMaxSize;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstance setStorageMaxDays(Integer storageMaxDays) {
            this.storageMaxDays = storageMaxDays;
            return this;
        }
        public Integer getStorageMaxDays() {
            return this.storageMaxDays;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstance setMaxOnlineAgents(Integer maxOnlineAgents) {
            this.maxOnlineAgents = maxOnlineAgents;
            return this;
        }
        public Integer getMaxOnlineAgents() {
            return this.maxOnlineAgents;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstance setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstance setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstance setPhoneNumbers(ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbers phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }
        public ListInstancesOfUserResponseBodyInstancesCallCenterInstancePhoneNumbers getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstance setConsoleUrl(String consoleUrl) {
            this.consoleUrl = consoleUrl;
            return this;
        }
        public String getConsoleUrl() {
            return this.consoleUrl;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstance setStorageBucket(String storageBucket) {
            this.storageBucket = storageBucket;
            return this;
        }
        public String getStorageBucket() {
            return this.storageBucket;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstance setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstance setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstance setAdmin(ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdmin admin) {
            this.admin = admin;
            return this;
        }
        public ListInstancesOfUserResponseBodyInstancesCallCenterInstanceAdmin getAdmin() {
            return this.admin;
        }

        public ListInstancesOfUserResponseBodyInstancesCallCenterInstance setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListInstancesOfUserResponseBodyInstances extends TeaModel {
        @NameInMap("CallCenterInstance")
        public java.util.List<ListInstancesOfUserResponseBodyInstancesCallCenterInstance> callCenterInstance;

        public static ListInstancesOfUserResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesOfUserResponseBodyInstances self = new ListInstancesOfUserResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListInstancesOfUserResponseBodyInstances setCallCenterInstance(java.util.List<ListInstancesOfUserResponseBodyInstancesCallCenterInstance> callCenterInstance) {
            this.callCenterInstance = callCenterInstance;
            return this;
        }
        public java.util.List<ListInstancesOfUserResponseBodyInstancesCallCenterInstance> getCallCenterInstance() {
            return this.callCenterInstance;
        }

    }

}

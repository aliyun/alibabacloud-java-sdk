// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Instance")
    public GetInstanceResponseBodyInstance instance;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceResponseBody setInstance(GetInstanceResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public GetInstanceResponseBodyInstance getInstance() {
        return this.instance;
    }

    public GetInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceResponseBodyInstanceAdminUserDetail extends TeaModel {
        @NameInMap("Department")
        public String department;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Email")
        public String email;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Phone")
        public String phone;

        public static GetInstanceResponseBodyInstanceAdminUserDetail build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstanceAdminUserDetail self = new GetInstanceResponseBodyInstanceAdminUserDetail();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstanceAdminUserDetail setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public GetInstanceResponseBodyInstanceAdminUserDetail setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetInstanceResponseBodyInstanceAdminUserDetail setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetInstanceResponseBodyInstanceAdminUserDetail setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetInstanceResponseBodyInstanceAdminUserDetail setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class GetInstanceResponseBodyInstanceAdminUser extends TeaModel {
        @NameInMap("Detail")
        public GetInstanceResponseBodyInstanceAdminUserDetail detail;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RamId")
        public String ramId;

        @NameInMap("UserId")
        public String userId;

        public static GetInstanceResponseBodyInstanceAdminUser build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstanceAdminUser self = new GetInstanceResponseBodyInstanceAdminUser();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstanceAdminUser setDetail(GetInstanceResponseBodyInstanceAdminUserDetail detail) {
            this.detail = detail;
            return this;
        }
        public GetInstanceResponseBodyInstanceAdminUserDetail getDetail() {
            return this.detail;
        }

        public GetInstanceResponseBodyInstanceAdminUser setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyInstanceAdminUser setRamId(String ramId) {
            this.ramId = ramId;
            return this;
        }
        public String getRamId() {
            return this.ramId;
        }

        public GetInstanceResponseBodyInstanceAdminUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetInstanceResponseBodyInstanceAdmin extends TeaModel {
        @NameInMap("User")
        public java.util.List<GetInstanceResponseBodyInstanceAdminUser> user;

        public static GetInstanceResponseBodyInstanceAdmin build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstanceAdmin self = new GetInstanceResponseBodyInstanceAdmin();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstanceAdmin setUser(java.util.List<GetInstanceResponseBodyInstanceAdminUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<GetInstanceResponseBodyInstanceAdminUser> getUser() {
            return this.user;
        }

    }

    public static class GetInstanceResponseBodyInstancePhoneNumbersPhoneNumber extends TeaModel {
        @NameInMap("AllowOutbound")
        public Boolean allowOutbound;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Number")
        public String number;

        @NameInMap("PhoneNumberDescription")
        public String phoneNumberDescription;

        @NameInMap("PhoneNumberId")
        public String phoneNumberId;

        @NameInMap("RemainingTime")
        public Integer remainingTime;

        @NameInMap("TestOnly")
        public Boolean testOnly;

        @NameInMap("Trunks")
        public Integer trunks;

        @NameInMap("Usage")
        public String usage;

        public static GetInstanceResponseBodyInstancePhoneNumbersPhoneNumber build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstancePhoneNumbersPhoneNumber self = new GetInstanceResponseBodyInstancePhoneNumbersPhoneNumber();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstancePhoneNumbersPhoneNumber setAllowOutbound(Boolean allowOutbound) {
            this.allowOutbound = allowOutbound;
            return this;
        }
        public Boolean getAllowOutbound() {
            return this.allowOutbound;
        }

        public GetInstanceResponseBodyInstancePhoneNumbersPhoneNumber setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyInstancePhoneNumbersPhoneNumber setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public GetInstanceResponseBodyInstancePhoneNumbersPhoneNumber setPhoneNumberDescription(String phoneNumberDescription) {
            this.phoneNumberDescription = phoneNumberDescription;
            return this;
        }
        public String getPhoneNumberDescription() {
            return this.phoneNumberDescription;
        }

        public GetInstanceResponseBodyInstancePhoneNumbersPhoneNumber setPhoneNumberId(String phoneNumberId) {
            this.phoneNumberId = phoneNumberId;
            return this;
        }
        public String getPhoneNumberId() {
            return this.phoneNumberId;
        }

        public GetInstanceResponseBodyInstancePhoneNumbersPhoneNumber setRemainingTime(Integer remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }
        public Integer getRemainingTime() {
            return this.remainingTime;
        }

        public GetInstanceResponseBodyInstancePhoneNumbersPhoneNumber setTestOnly(Boolean testOnly) {
            this.testOnly = testOnly;
            return this;
        }
        public Boolean getTestOnly() {
            return this.testOnly;
        }

        public GetInstanceResponseBodyInstancePhoneNumbersPhoneNumber setTrunks(Integer trunks) {
            this.trunks = trunks;
            return this;
        }
        public Integer getTrunks() {
            return this.trunks;
        }

        public GetInstanceResponseBodyInstancePhoneNumbersPhoneNumber setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

    public static class GetInstanceResponseBodyInstancePhoneNumbers extends TeaModel {
        @NameInMap("PhoneNumber")
        public java.util.List<GetInstanceResponseBodyInstancePhoneNumbersPhoneNumber> phoneNumber;

        public static GetInstanceResponseBodyInstancePhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstancePhoneNumbers self = new GetInstanceResponseBodyInstancePhoneNumbers();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstancePhoneNumbers setPhoneNumber(java.util.List<GetInstanceResponseBodyInstancePhoneNumbersPhoneNumber> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public java.util.List<GetInstanceResponseBodyInstancePhoneNumbersPhoneNumber> getPhoneNumber() {
            return this.phoneNumber;
        }

    }

    public static class GetInstanceResponseBodyInstance extends TeaModel {
        @NameInMap("Admin")
        public GetInstanceResponseBodyInstanceAdmin admin;

        @NameInMap("ConsoleUrl")
        public String consoleUrl;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("InstanceDescription")
        public String instanceDescription;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("MaxOnlineAgents")
        public Integer maxOnlineAgents;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("PhoneNumbers")
        public GetInstanceResponseBodyInstancePhoneNumbers phoneNumbers;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageBucket")
        public String storageBucket;

        @NameInMap("StorageMaxDays")
        public Integer storageMaxDays;

        @NameInMap("StorageMaxSize")
        public Integer storageMaxSize;

        @NameInMap("TenantId")
        public String tenantId;

        public static GetInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstance self = new GetInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstance setAdmin(GetInstanceResponseBodyInstanceAdmin admin) {
            this.admin = admin;
            return this;
        }
        public GetInstanceResponseBodyInstanceAdmin getAdmin() {
            return this.admin;
        }

        public GetInstanceResponseBodyInstance setConsoleUrl(String consoleUrl) {
            this.consoleUrl = consoleUrl;
            return this;
        }
        public String getConsoleUrl() {
            return this.consoleUrl;
        }

        public GetInstanceResponseBodyInstance setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public GetInstanceResponseBodyInstance setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public GetInstanceResponseBodyInstance setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public GetInstanceResponseBodyInstance setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public GetInstanceResponseBodyInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetInstanceResponseBodyInstance setMaxOnlineAgents(Integer maxOnlineAgents) {
            this.maxOnlineAgents = maxOnlineAgents;
            return this;
        }
        public Integer getMaxOnlineAgents() {
            return this.maxOnlineAgents;
        }

        public GetInstanceResponseBodyInstance setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetInstanceResponseBodyInstance setPhoneNumbers(GetInstanceResponseBodyInstancePhoneNumbers phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }
        public GetInstanceResponseBodyInstancePhoneNumbers getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public GetInstanceResponseBodyInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetInstanceResponseBodyInstance setStorageBucket(String storageBucket) {
            this.storageBucket = storageBucket;
            return this;
        }
        public String getStorageBucket() {
            return this.storageBucket;
        }

        public GetInstanceResponseBodyInstance setStorageMaxDays(Integer storageMaxDays) {
            this.storageMaxDays = storageMaxDays;
            return this;
        }
        public Integer getStorageMaxDays() {
            return this.storageMaxDays;
        }

        public GetInstanceResponseBodyInstance setStorageMaxSize(Integer storageMaxSize) {
            this.storageMaxSize = storageMaxSize;
            return this;
        }
        public Integer getStorageMaxSize() {
            return this.storageMaxSize;
        }

        public GetInstanceResponseBodyInstance setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Instance")
    public CreateInstanceResponseBodyInstance instance;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceResponseBody self = new CreateInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateInstanceResponseBody setInstance(CreateInstanceResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public CreateInstanceResponseBodyInstance getInstance() {
        return this.instance;
    }

    public CreateInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateInstanceResponseBodyInstanceAdminUserDetail extends TeaModel {
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

        public static CreateInstanceResponseBodyInstanceAdminUserDetail build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceResponseBodyInstanceAdminUserDetail self = new CreateInstanceResponseBodyInstanceAdminUserDetail();
            return TeaModel.build(map, self);
        }

        public CreateInstanceResponseBodyInstanceAdminUserDetail setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public CreateInstanceResponseBodyInstanceAdminUserDetail setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateInstanceResponseBodyInstanceAdminUserDetail setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateInstanceResponseBodyInstanceAdminUserDetail setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public CreateInstanceResponseBodyInstanceAdminUserDetail setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class CreateInstanceResponseBodyInstanceAdminUser extends TeaModel {
        @NameInMap("Detail")
        public CreateInstanceResponseBodyInstanceAdminUserDetail detail;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RamId")
        public String ramId;

        @NameInMap("UserId")
        public String userId;

        public static CreateInstanceResponseBodyInstanceAdminUser build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceResponseBodyInstanceAdminUser self = new CreateInstanceResponseBodyInstanceAdminUser();
            return TeaModel.build(map, self);
        }

        public CreateInstanceResponseBodyInstanceAdminUser setDetail(CreateInstanceResponseBodyInstanceAdminUserDetail detail) {
            this.detail = detail;
            return this;
        }
        public CreateInstanceResponseBodyInstanceAdminUserDetail getDetail() {
            return this.detail;
        }

        public CreateInstanceResponseBodyInstanceAdminUser setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateInstanceResponseBodyInstanceAdminUser setRamId(String ramId) {
            this.ramId = ramId;
            return this;
        }
        public String getRamId() {
            return this.ramId;
        }

        public CreateInstanceResponseBodyInstanceAdminUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class CreateInstanceResponseBodyInstanceAdmin extends TeaModel {
        @NameInMap("User")
        public java.util.List<CreateInstanceResponseBodyInstanceAdminUser> user;

        public static CreateInstanceResponseBodyInstanceAdmin build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceResponseBodyInstanceAdmin self = new CreateInstanceResponseBodyInstanceAdmin();
            return TeaModel.build(map, self);
        }

        public CreateInstanceResponseBodyInstanceAdmin setUser(java.util.List<CreateInstanceResponseBodyInstanceAdminUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<CreateInstanceResponseBodyInstanceAdminUser> getUser() {
            return this.user;
        }

    }

    public static class CreateInstanceResponseBodyInstanceFailLoginNames extends TeaModel {
        @NameInMap("FailLoginName")
        public java.util.List<String> failLoginName;

        public static CreateInstanceResponseBodyInstanceFailLoginNames build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceResponseBodyInstanceFailLoginNames self = new CreateInstanceResponseBodyInstanceFailLoginNames();
            return TeaModel.build(map, self);
        }

        public CreateInstanceResponseBodyInstanceFailLoginNames setFailLoginName(java.util.List<String> failLoginName) {
            this.failLoginName = failLoginName;
            return this;
        }
        public java.util.List<String> getFailLoginName() {
            return this.failLoginName;
        }

    }

    public static class CreateInstanceResponseBodyInstanceFailPhoneNumbers extends TeaModel {
        @NameInMap("FailPhoneNumber")
        public java.util.List<String> failPhoneNumber;

        public static CreateInstanceResponseBodyInstanceFailPhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceResponseBodyInstanceFailPhoneNumbers self = new CreateInstanceResponseBodyInstanceFailPhoneNumbers();
            return TeaModel.build(map, self);
        }

        public CreateInstanceResponseBodyInstanceFailPhoneNumbers setFailPhoneNumber(java.util.List<String> failPhoneNumber) {
            this.failPhoneNumber = failPhoneNumber;
            return this;
        }
        public java.util.List<String> getFailPhoneNumber() {
            return this.failPhoneNumber;
        }

    }

    public static class CreateInstanceResponseBodyInstancePhoneNumbersPhoneNumber extends TeaModel {
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

        public static CreateInstanceResponseBodyInstancePhoneNumbersPhoneNumber build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceResponseBodyInstancePhoneNumbersPhoneNumber self = new CreateInstanceResponseBodyInstancePhoneNumbersPhoneNumber();
            return TeaModel.build(map, self);
        }

        public CreateInstanceResponseBodyInstancePhoneNumbersPhoneNumber setAllowOutbound(Boolean allowOutbound) {
            this.allowOutbound = allowOutbound;
            return this;
        }
        public Boolean getAllowOutbound() {
            return this.allowOutbound;
        }

        public CreateInstanceResponseBodyInstancePhoneNumbersPhoneNumber setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateInstanceResponseBodyInstancePhoneNumbersPhoneNumber setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public CreateInstanceResponseBodyInstancePhoneNumbersPhoneNumber setPhoneNumberDescription(String phoneNumberDescription) {
            this.phoneNumberDescription = phoneNumberDescription;
            return this;
        }
        public String getPhoneNumberDescription() {
            return this.phoneNumberDescription;
        }

        public CreateInstanceResponseBodyInstancePhoneNumbersPhoneNumber setPhoneNumberId(String phoneNumberId) {
            this.phoneNumberId = phoneNumberId;
            return this;
        }
        public String getPhoneNumberId() {
            return this.phoneNumberId;
        }

        public CreateInstanceResponseBodyInstancePhoneNumbersPhoneNumber setRemainingTime(Integer remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }
        public Integer getRemainingTime() {
            return this.remainingTime;
        }

        public CreateInstanceResponseBodyInstancePhoneNumbersPhoneNumber setTestOnly(Boolean testOnly) {
            this.testOnly = testOnly;
            return this;
        }
        public Boolean getTestOnly() {
            return this.testOnly;
        }

        public CreateInstanceResponseBodyInstancePhoneNumbersPhoneNumber setTrunks(Integer trunks) {
            this.trunks = trunks;
            return this;
        }
        public Integer getTrunks() {
            return this.trunks;
        }

        public CreateInstanceResponseBodyInstancePhoneNumbersPhoneNumber setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

    public static class CreateInstanceResponseBodyInstancePhoneNumbers extends TeaModel {
        @NameInMap("PhoneNumber")
        public java.util.List<CreateInstanceResponseBodyInstancePhoneNumbersPhoneNumber> phoneNumber;

        public static CreateInstanceResponseBodyInstancePhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceResponseBodyInstancePhoneNumbers self = new CreateInstanceResponseBodyInstancePhoneNumbers();
            return TeaModel.build(map, self);
        }

        public CreateInstanceResponseBodyInstancePhoneNumbers setPhoneNumber(java.util.List<CreateInstanceResponseBodyInstancePhoneNumbersPhoneNumber> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public java.util.List<CreateInstanceResponseBodyInstancePhoneNumbersPhoneNumber> getPhoneNumber() {
            return this.phoneNumber;
        }

    }

    public static class CreateInstanceResponseBodyInstanceSuccessLoginNames extends TeaModel {
        @NameInMap("SuccessLoginName")
        public java.util.List<String> successLoginName;

        public static CreateInstanceResponseBodyInstanceSuccessLoginNames build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceResponseBodyInstanceSuccessLoginNames self = new CreateInstanceResponseBodyInstanceSuccessLoginNames();
            return TeaModel.build(map, self);
        }

        public CreateInstanceResponseBodyInstanceSuccessLoginNames setSuccessLoginName(java.util.List<String> successLoginName) {
            this.successLoginName = successLoginName;
            return this;
        }
        public java.util.List<String> getSuccessLoginName() {
            return this.successLoginName;
        }

    }

    public static class CreateInstanceResponseBodyInstanceSuccessPhoneNumbers extends TeaModel {
        @NameInMap("SuccessPhoneNumber")
        public java.util.List<String> successPhoneNumber;

        public static CreateInstanceResponseBodyInstanceSuccessPhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceResponseBodyInstanceSuccessPhoneNumbers self = new CreateInstanceResponseBodyInstanceSuccessPhoneNumbers();
            return TeaModel.build(map, self);
        }

        public CreateInstanceResponseBodyInstanceSuccessPhoneNumbers setSuccessPhoneNumber(java.util.List<String> successPhoneNumber) {
            this.successPhoneNumber = successPhoneNumber;
            return this;
        }
        public java.util.List<String> getSuccessPhoneNumber() {
            return this.successPhoneNumber;
        }

    }

    public static class CreateInstanceResponseBodyInstance extends TeaModel {
        @NameInMap("Admin")
        public CreateInstanceResponseBodyInstanceAdmin admin;

        @NameInMap("ConsoleUrl")
        public String consoleUrl;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("FailLoginNames")
        public CreateInstanceResponseBodyInstanceFailLoginNames failLoginNames;

        @NameInMap("FailPhoneNumbers")
        public CreateInstanceResponseBodyInstanceFailPhoneNumbers failPhoneNumbers;

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
        public CreateInstanceResponseBodyInstancePhoneNumbers phoneNumbers;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageBucket")
        public String storageBucket;

        @NameInMap("StorageMaxDays")
        public Integer storageMaxDays;

        @NameInMap("StorageMaxSize")
        public Integer storageMaxSize;

        @NameInMap("SuccessLoginNames")
        public CreateInstanceResponseBodyInstanceSuccessLoginNames successLoginNames;

        @NameInMap("SuccessPhoneNumbers")
        public CreateInstanceResponseBodyInstanceSuccessPhoneNumbers successPhoneNumbers;

        @NameInMap("TenantId")
        public String tenantId;

        public static CreateInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceResponseBodyInstance self = new CreateInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public CreateInstanceResponseBodyInstance setAdmin(CreateInstanceResponseBodyInstanceAdmin admin) {
            this.admin = admin;
            return this;
        }
        public CreateInstanceResponseBodyInstanceAdmin getAdmin() {
            return this.admin;
        }

        public CreateInstanceResponseBodyInstance setConsoleUrl(String consoleUrl) {
            this.consoleUrl = consoleUrl;
            return this;
        }
        public String getConsoleUrl() {
            return this.consoleUrl;
        }

        public CreateInstanceResponseBodyInstance setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public CreateInstanceResponseBodyInstance setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public CreateInstanceResponseBodyInstance setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public CreateInstanceResponseBodyInstance setFailLoginNames(CreateInstanceResponseBodyInstanceFailLoginNames failLoginNames) {
            this.failLoginNames = failLoginNames;
            return this;
        }
        public CreateInstanceResponseBodyInstanceFailLoginNames getFailLoginNames() {
            return this.failLoginNames;
        }

        public CreateInstanceResponseBodyInstance setFailPhoneNumbers(CreateInstanceResponseBodyInstanceFailPhoneNumbers failPhoneNumbers) {
            this.failPhoneNumbers = failPhoneNumbers;
            return this;
        }
        public CreateInstanceResponseBodyInstanceFailPhoneNumbers getFailPhoneNumbers() {
            return this.failPhoneNumbers;
        }

        public CreateInstanceResponseBodyInstance setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public CreateInstanceResponseBodyInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateInstanceResponseBodyInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public CreateInstanceResponseBodyInstance setMaxOnlineAgents(Integer maxOnlineAgents) {
            this.maxOnlineAgents = maxOnlineAgents;
            return this;
        }
        public Integer getMaxOnlineAgents() {
            return this.maxOnlineAgents;
        }

        public CreateInstanceResponseBodyInstance setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public CreateInstanceResponseBodyInstance setPhoneNumbers(CreateInstanceResponseBodyInstancePhoneNumbers phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }
        public CreateInstanceResponseBodyInstancePhoneNumbers getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public CreateInstanceResponseBodyInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateInstanceResponseBodyInstance setStorageBucket(String storageBucket) {
            this.storageBucket = storageBucket;
            return this;
        }
        public String getStorageBucket() {
            return this.storageBucket;
        }

        public CreateInstanceResponseBodyInstance setStorageMaxDays(Integer storageMaxDays) {
            this.storageMaxDays = storageMaxDays;
            return this;
        }
        public Integer getStorageMaxDays() {
            return this.storageMaxDays;
        }

        public CreateInstanceResponseBodyInstance setStorageMaxSize(Integer storageMaxSize) {
            this.storageMaxSize = storageMaxSize;
            return this;
        }
        public Integer getStorageMaxSize() {
            return this.storageMaxSize;
        }

        public CreateInstanceResponseBodyInstance setSuccessLoginNames(CreateInstanceResponseBodyInstanceSuccessLoginNames successLoginNames) {
            this.successLoginNames = successLoginNames;
            return this;
        }
        public CreateInstanceResponseBodyInstanceSuccessLoginNames getSuccessLoginNames() {
            return this.successLoginNames;
        }

        public CreateInstanceResponseBodyInstance setSuccessPhoneNumbers(CreateInstanceResponseBodyInstanceSuccessPhoneNumbers successPhoneNumbers) {
            this.successPhoneNumbers = successPhoneNumbers;
            return this;
        }
        public CreateInstanceResponseBodyInstanceSuccessPhoneNumbers getSuccessPhoneNumbers() {
            return this.successPhoneNumbers;
        }

        public CreateInstanceResponseBodyInstance setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}

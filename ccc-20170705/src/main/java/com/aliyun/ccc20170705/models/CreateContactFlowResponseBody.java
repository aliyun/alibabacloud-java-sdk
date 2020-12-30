// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateContactFlowResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("ContactFlow")
    public CreateContactFlowResponseBodyContactFlow contactFlow;

    @NameInMap("Success")
    public Boolean success;

    public static CreateContactFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateContactFlowResponseBody self = new CreateContactFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateContactFlowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateContactFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateContactFlowResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateContactFlowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateContactFlowResponseBody setContactFlow(CreateContactFlowResponseBodyContactFlow contactFlow) {
        this.contactFlow = contactFlow;
        return this;
    }
    public CreateContactFlowResponseBodyContactFlow getContactFlow() {
        return this.contactFlow;
    }

    public CreateContactFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateContactFlowResponseBodyContactFlowPhoneNumbersPhoneNumber extends TeaModel {
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

        public static CreateContactFlowResponseBodyContactFlowPhoneNumbersPhoneNumber build(java.util.Map<String, ?> map) throws Exception {
            CreateContactFlowResponseBodyContactFlowPhoneNumbersPhoneNumber self = new CreateContactFlowResponseBodyContactFlowPhoneNumbersPhoneNumber();
            return TeaModel.build(map, self);
        }

        public CreateContactFlowResponseBodyContactFlowPhoneNumbersPhoneNumber setTestOnly(Boolean testOnly) {
            this.testOnly = testOnly;
            return this;
        }
        public Boolean getTestOnly() {
            return this.testOnly;
        }

        public CreateContactFlowResponseBodyContactFlowPhoneNumbersPhoneNumber setTrunks(Integer trunks) {
            this.trunks = trunks;
            return this;
        }
        public Integer getTrunks() {
            return this.trunks;
        }

        public CreateContactFlowResponseBodyContactFlowPhoneNumbersPhoneNumber setRemainingTime(Integer remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }
        public Integer getRemainingTime() {
            return this.remainingTime;
        }

        public CreateContactFlowResponseBodyContactFlowPhoneNumbersPhoneNumber setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public CreateContactFlowResponseBodyContactFlowPhoneNumbersPhoneNumber setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateContactFlowResponseBodyContactFlowPhoneNumbersPhoneNumber setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public CreateContactFlowResponseBodyContactFlowPhoneNumbersPhoneNumber setAllowOutbound(Boolean allowOutbound) {
            this.allowOutbound = allowOutbound;
            return this;
        }
        public Boolean getAllowOutbound() {
            return this.allowOutbound;
        }

        public CreateContactFlowResponseBodyContactFlowPhoneNumbersPhoneNumber setPhoneNumberDescription(String phoneNumberDescription) {
            this.phoneNumberDescription = phoneNumberDescription;
            return this;
        }
        public String getPhoneNumberDescription() {
            return this.phoneNumberDescription;
        }

        public CreateContactFlowResponseBodyContactFlowPhoneNumbersPhoneNumber setPhoneNumberId(String phoneNumberId) {
            this.phoneNumberId = phoneNumberId;
            return this;
        }
        public String getPhoneNumberId() {
            return this.phoneNumberId;
        }

    }

    public static class CreateContactFlowResponseBodyContactFlowPhoneNumbers extends TeaModel {
        @NameInMap("PhoneNumber")
        public java.util.List<CreateContactFlowResponseBodyContactFlowPhoneNumbersPhoneNumber> phoneNumber;

        public static CreateContactFlowResponseBodyContactFlowPhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            CreateContactFlowResponseBodyContactFlowPhoneNumbers self = new CreateContactFlowResponseBodyContactFlowPhoneNumbers();
            return TeaModel.build(map, self);
        }

        public CreateContactFlowResponseBodyContactFlowPhoneNumbers setPhoneNumber(java.util.List<CreateContactFlowResponseBodyContactFlowPhoneNumbersPhoneNumber> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public java.util.List<CreateContactFlowResponseBodyContactFlowPhoneNumbersPhoneNumber> getPhoneNumber() {
            return this.phoneNumber;
        }

    }

    public static class CreateContactFlowResponseBodyContactFlowVersionsContactFlowVersion extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("LastModified")
        public String lastModified;

        @NameInMap("Canvas")
        public String canvas;

        @NameInMap("LockedBy")
        public String lockedBy;

        @NameInMap("Version")
        public String version;

        @NameInMap("ContactFlowVersionId")
        public String contactFlowVersionId;

        @NameInMap("LastModifiedBy")
        public String lastModifiedBy;

        @NameInMap("ContactFlowVersionDescription")
        public String contactFlowVersionDescription;

        @NameInMap("Content")
        public String content;

        public static CreateContactFlowResponseBodyContactFlowVersionsContactFlowVersion build(java.util.Map<String, ?> map) throws Exception {
            CreateContactFlowResponseBodyContactFlowVersionsContactFlowVersion self = new CreateContactFlowResponseBodyContactFlowVersionsContactFlowVersion();
            return TeaModel.build(map, self);
        }

        public CreateContactFlowResponseBodyContactFlowVersionsContactFlowVersion setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateContactFlowResponseBodyContactFlowVersionsContactFlowVersion setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public CreateContactFlowResponseBodyContactFlowVersionsContactFlowVersion setCanvas(String canvas) {
            this.canvas = canvas;
            return this;
        }
        public String getCanvas() {
            return this.canvas;
        }

        public CreateContactFlowResponseBodyContactFlowVersionsContactFlowVersion setLockedBy(String lockedBy) {
            this.lockedBy = lockedBy;
            return this;
        }
        public String getLockedBy() {
            return this.lockedBy;
        }

        public CreateContactFlowResponseBodyContactFlowVersionsContactFlowVersion setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateContactFlowResponseBodyContactFlowVersionsContactFlowVersion setContactFlowVersionId(String contactFlowVersionId) {
            this.contactFlowVersionId = contactFlowVersionId;
            return this;
        }
        public String getContactFlowVersionId() {
            return this.contactFlowVersionId;
        }

        public CreateContactFlowResponseBodyContactFlowVersionsContactFlowVersion setLastModifiedBy(String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }
        public String getLastModifiedBy() {
            return this.lastModifiedBy;
        }

        public CreateContactFlowResponseBodyContactFlowVersionsContactFlowVersion setContactFlowVersionDescription(String contactFlowVersionDescription) {
            this.contactFlowVersionDescription = contactFlowVersionDescription;
            return this;
        }
        public String getContactFlowVersionDescription() {
            return this.contactFlowVersionDescription;
        }

        public CreateContactFlowResponseBodyContactFlowVersionsContactFlowVersion setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CreateContactFlowResponseBodyContactFlowVersions extends TeaModel {
        @NameInMap("ContactFlowVersion")
        public java.util.List<CreateContactFlowResponseBodyContactFlowVersionsContactFlowVersion> contactFlowVersion;

        public static CreateContactFlowResponseBodyContactFlowVersions build(java.util.Map<String, ?> map) throws Exception {
            CreateContactFlowResponseBodyContactFlowVersions self = new CreateContactFlowResponseBodyContactFlowVersions();
            return TeaModel.build(map, self);
        }

        public CreateContactFlowResponseBodyContactFlowVersions setContactFlowVersion(java.util.List<CreateContactFlowResponseBodyContactFlowVersionsContactFlowVersion> contactFlowVersion) {
            this.contactFlowVersion = contactFlowVersion;
            return this;
        }
        public java.util.List<CreateContactFlowResponseBodyContactFlowVersionsContactFlowVersion> getContactFlowVersion() {
            return this.contactFlowVersion;
        }

    }

    public static class CreateContactFlowResponseBodyContactFlow extends TeaModel {
        @NameInMap("ContactFlowDescription")
        public String contactFlowDescription;

        @NameInMap("Type")
        public String type;

        @NameInMap("PhoneNumbers")
        public CreateContactFlowResponseBodyContactFlowPhoneNumbers phoneNumbers;

        @NameInMap("ContactFlowName")
        public String contactFlowName;

        @NameInMap("Versions")
        public CreateContactFlowResponseBodyContactFlowVersions versions;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ContactFlowId")
        public String contactFlowId;

        @NameInMap("AppliedVersion")
        public String appliedVersion;

        public static CreateContactFlowResponseBodyContactFlow build(java.util.Map<String, ?> map) throws Exception {
            CreateContactFlowResponseBodyContactFlow self = new CreateContactFlowResponseBodyContactFlow();
            return TeaModel.build(map, self);
        }

        public CreateContactFlowResponseBodyContactFlow setContactFlowDescription(String contactFlowDescription) {
            this.contactFlowDescription = contactFlowDescription;
            return this;
        }
        public String getContactFlowDescription() {
            return this.contactFlowDescription;
        }

        public CreateContactFlowResponseBodyContactFlow setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateContactFlowResponseBodyContactFlow setPhoneNumbers(CreateContactFlowResponseBodyContactFlowPhoneNumbers phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }
        public CreateContactFlowResponseBodyContactFlowPhoneNumbers getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public CreateContactFlowResponseBodyContactFlow setContactFlowName(String contactFlowName) {
            this.contactFlowName = contactFlowName;
            return this;
        }
        public String getContactFlowName() {
            return this.contactFlowName;
        }

        public CreateContactFlowResponseBodyContactFlow setVersions(CreateContactFlowResponseBodyContactFlowVersions versions) {
            this.versions = versions;
            return this;
        }
        public CreateContactFlowResponseBodyContactFlowVersions getVersions() {
            return this.versions;
        }

        public CreateContactFlowResponseBodyContactFlow setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateContactFlowResponseBodyContactFlow setContactFlowId(String contactFlowId) {
            this.contactFlowId = contactFlowId;
            return this;
        }
        public String getContactFlowId() {
            return this.contactFlowId;
        }

        public CreateContactFlowResponseBodyContactFlow setAppliedVersion(String appliedVersion) {
            this.appliedVersion = appliedVersion;
            return this;
        }
        public String getAppliedVersion() {
            return this.appliedVersion;
        }

    }

}

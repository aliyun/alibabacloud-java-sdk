// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListContactFlowsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ContactFlows")
    public ListContactFlowsResponseBodyContactFlows contactFlows;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListContactFlowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContactFlowsResponseBody self = new ListContactFlowsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContactFlowsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListContactFlowsResponseBody setContactFlows(ListContactFlowsResponseBodyContactFlows contactFlows) {
        this.contactFlows = contactFlows;
        return this;
    }
    public ListContactFlowsResponseBodyContactFlows getContactFlows() {
        return this.contactFlows;
    }

    public ListContactFlowsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListContactFlowsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListContactFlowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContactFlowsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbersPhoneNumber extends TeaModel {
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

        public static ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbersPhoneNumber build(java.util.Map<String, ?> map) throws Exception {
            ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbersPhoneNumber self = new ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbersPhoneNumber();
            return TeaModel.build(map, self);
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbersPhoneNumber setAllowOutbound(Boolean allowOutbound) {
            this.allowOutbound = allowOutbound;
            return this;
        }
        public Boolean getAllowOutbound() {
            return this.allowOutbound;
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbersPhoneNumber setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbersPhoneNumber setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbersPhoneNumber setPhoneNumberDescription(String phoneNumberDescription) {
            this.phoneNumberDescription = phoneNumberDescription;
            return this;
        }
        public String getPhoneNumberDescription() {
            return this.phoneNumberDescription;
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbersPhoneNumber setPhoneNumberId(String phoneNumberId) {
            this.phoneNumberId = phoneNumberId;
            return this;
        }
        public String getPhoneNumberId() {
            return this.phoneNumberId;
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbersPhoneNumber setRemainingTime(Integer remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }
        public Integer getRemainingTime() {
            return this.remainingTime;
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbersPhoneNumber setTestOnly(Boolean testOnly) {
            this.testOnly = testOnly;
            return this;
        }
        public Boolean getTestOnly() {
            return this.testOnly;
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbersPhoneNumber setTrunks(Integer trunks) {
            this.trunks = trunks;
            return this;
        }
        public Integer getTrunks() {
            return this.trunks;
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbersPhoneNumber setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

    public static class ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbers extends TeaModel {
        @NameInMap("PhoneNumber")
        public java.util.List<ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbersPhoneNumber> phoneNumber;

        public static ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbers self = new ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbers();
            return TeaModel.build(map, self);
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbers setPhoneNumber(java.util.List<ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbersPhoneNumber> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public java.util.List<ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbersPhoneNumber> getPhoneNumber() {
            return this.phoneNumber;
        }

    }

    public static class ListContactFlowsResponseBodyContactFlowsContactFlowVersionsContactFlowVersion extends TeaModel {
        @NameInMap("ContactFlowVersionDescription")
        public String contactFlowVersionDescription;

        @NameInMap("ContactFlowVersionId")
        public String contactFlowVersionId;

        @NameInMap("LastModified")
        public String lastModified;

        @NameInMap("LastModifiedBy")
        public String lastModifiedBy;

        @NameInMap("LockedBy")
        public String lockedBy;

        @NameInMap("Status")
        public String status;

        @NameInMap("Version")
        public String version;

        public static ListContactFlowsResponseBodyContactFlowsContactFlowVersionsContactFlowVersion build(java.util.Map<String, ?> map) throws Exception {
            ListContactFlowsResponseBodyContactFlowsContactFlowVersionsContactFlowVersion self = new ListContactFlowsResponseBodyContactFlowsContactFlowVersionsContactFlowVersion();
            return TeaModel.build(map, self);
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlowVersionsContactFlowVersion setContactFlowVersionDescription(String contactFlowVersionDescription) {
            this.contactFlowVersionDescription = contactFlowVersionDescription;
            return this;
        }
        public String getContactFlowVersionDescription() {
            return this.contactFlowVersionDescription;
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlowVersionsContactFlowVersion setContactFlowVersionId(String contactFlowVersionId) {
            this.contactFlowVersionId = contactFlowVersionId;
            return this;
        }
        public String getContactFlowVersionId() {
            return this.contactFlowVersionId;
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlowVersionsContactFlowVersion setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlowVersionsContactFlowVersion setLastModifiedBy(String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }
        public String getLastModifiedBy() {
            return this.lastModifiedBy;
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlowVersionsContactFlowVersion setLockedBy(String lockedBy) {
            this.lockedBy = lockedBy;
            return this;
        }
        public String getLockedBy() {
            return this.lockedBy;
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlowVersionsContactFlowVersion setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlowVersionsContactFlowVersion setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListContactFlowsResponseBodyContactFlowsContactFlowVersions extends TeaModel {
        @NameInMap("ContactFlowVersion")
        public java.util.List<ListContactFlowsResponseBodyContactFlowsContactFlowVersionsContactFlowVersion> contactFlowVersion;

        public static ListContactFlowsResponseBodyContactFlowsContactFlowVersions build(java.util.Map<String, ?> map) throws Exception {
            ListContactFlowsResponseBodyContactFlowsContactFlowVersions self = new ListContactFlowsResponseBodyContactFlowsContactFlowVersions();
            return TeaModel.build(map, self);
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlowVersions setContactFlowVersion(java.util.List<ListContactFlowsResponseBodyContactFlowsContactFlowVersionsContactFlowVersion> contactFlowVersion) {
            this.contactFlowVersion = contactFlowVersion;
            return this;
        }
        public java.util.List<ListContactFlowsResponseBodyContactFlowsContactFlowVersionsContactFlowVersion> getContactFlowVersion() {
            return this.contactFlowVersion;
        }

    }

    public static class ListContactFlowsResponseBodyContactFlowsContactFlow extends TeaModel {
        @NameInMap("AppliedVersion")
        public String appliedVersion;

        @NameInMap("ContactFlowDescription")
        public String contactFlowDescription;

        @NameInMap("ContactFlowId")
        public String contactFlowId;

        @NameInMap("ContactFlowName")
        public String contactFlowName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PhoneNumbers")
        public ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbers phoneNumbers;

        @NameInMap("Type")
        public String type;

        @NameInMap("Versions")
        public ListContactFlowsResponseBodyContactFlowsContactFlowVersions versions;

        public static ListContactFlowsResponseBodyContactFlowsContactFlow build(java.util.Map<String, ?> map) throws Exception {
            ListContactFlowsResponseBodyContactFlowsContactFlow self = new ListContactFlowsResponseBodyContactFlowsContactFlow();
            return TeaModel.build(map, self);
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlow setAppliedVersion(String appliedVersion) {
            this.appliedVersion = appliedVersion;
            return this;
        }
        public String getAppliedVersion() {
            return this.appliedVersion;
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlow setContactFlowDescription(String contactFlowDescription) {
            this.contactFlowDescription = contactFlowDescription;
            return this;
        }
        public String getContactFlowDescription() {
            return this.contactFlowDescription;
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlow setContactFlowId(String contactFlowId) {
            this.contactFlowId = contactFlowId;
            return this;
        }
        public String getContactFlowId() {
            return this.contactFlowId;
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlow setContactFlowName(String contactFlowName) {
            this.contactFlowName = contactFlowName;
            return this;
        }
        public String getContactFlowName() {
            return this.contactFlowName;
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlow setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlow setPhoneNumbers(ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbers phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }
        public ListContactFlowsResponseBodyContactFlowsContactFlowPhoneNumbers getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlow setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListContactFlowsResponseBodyContactFlowsContactFlow setVersions(ListContactFlowsResponseBodyContactFlowsContactFlowVersions versions) {
            this.versions = versions;
            return this;
        }
        public ListContactFlowsResponseBodyContactFlowsContactFlowVersions getVersions() {
            return this.versions;
        }

    }

    public static class ListContactFlowsResponseBodyContactFlows extends TeaModel {
        @NameInMap("ContactFlow")
        public java.util.List<ListContactFlowsResponseBodyContactFlowsContactFlow> contactFlow;

        public static ListContactFlowsResponseBodyContactFlows build(java.util.Map<String, ?> map) throws Exception {
            ListContactFlowsResponseBodyContactFlows self = new ListContactFlowsResponseBodyContactFlows();
            return TeaModel.build(map, self);
        }

        public ListContactFlowsResponseBodyContactFlows setContactFlow(java.util.List<ListContactFlowsResponseBodyContactFlowsContactFlow> contactFlow) {
            this.contactFlow = contactFlow;
            return this;
        }
        public java.util.List<ListContactFlowsResponseBodyContactFlowsContactFlow> getContactFlow() {
            return this.contactFlow;
        }

    }

}

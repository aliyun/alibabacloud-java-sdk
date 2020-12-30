// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListVoiceAppraiseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Notice")
    public String notice;

    @NameInMap("Message")
    public String message;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("ContactFlow")
    public ListVoiceAppraiseResponseBodyContactFlow contactFlow;

    @NameInMap("Success")
    public Boolean success;

    public static ListVoiceAppraiseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceAppraiseResponseBody self = new ListVoiceAppraiseResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVoiceAppraiseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVoiceAppraiseResponseBody setNotice(String notice) {
        this.notice = notice;
        return this;
    }
    public String getNotice() {
        return this.notice;
    }

    public ListVoiceAppraiseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVoiceAppraiseResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListVoiceAppraiseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVoiceAppraiseResponseBody setContactFlow(ListVoiceAppraiseResponseBodyContactFlow contactFlow) {
        this.contactFlow = contactFlow;
        return this;
    }
    public ListVoiceAppraiseResponseBodyContactFlow getContactFlow() {
        return this.contactFlow;
    }

    public ListVoiceAppraiseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListVoiceAppraiseResponseBodyContactFlowPhoneNumbersPhoneNumber extends TeaModel {
        @NameInMap("Trunks")
        public Integer trunks;

        @NameInMap("Number")
        public String number;

        @NameInMap("RemainingTime")
        public Integer remainingTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PhoneNumberDescription")
        public String phoneNumberDescription;

        @NameInMap("PhoneNumberId")
        public String phoneNumberId;

        public static ListVoiceAppraiseResponseBodyContactFlowPhoneNumbersPhoneNumber build(java.util.Map<String, ?> map) throws Exception {
            ListVoiceAppraiseResponseBodyContactFlowPhoneNumbersPhoneNumber self = new ListVoiceAppraiseResponseBodyContactFlowPhoneNumbersPhoneNumber();
            return TeaModel.build(map, self);
        }

        public ListVoiceAppraiseResponseBodyContactFlowPhoneNumbersPhoneNumber setTrunks(Integer trunks) {
            this.trunks = trunks;
            return this;
        }
        public Integer getTrunks() {
            return this.trunks;
        }

        public ListVoiceAppraiseResponseBodyContactFlowPhoneNumbersPhoneNumber setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListVoiceAppraiseResponseBodyContactFlowPhoneNumbersPhoneNumber setRemainingTime(Integer remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }
        public Integer getRemainingTime() {
            return this.remainingTime;
        }

        public ListVoiceAppraiseResponseBodyContactFlowPhoneNumbersPhoneNumber setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListVoiceAppraiseResponseBodyContactFlowPhoneNumbersPhoneNumber setPhoneNumberDescription(String phoneNumberDescription) {
            this.phoneNumberDescription = phoneNumberDescription;
            return this;
        }
        public String getPhoneNumberDescription() {
            return this.phoneNumberDescription;
        }

        public ListVoiceAppraiseResponseBodyContactFlowPhoneNumbersPhoneNumber setPhoneNumberId(String phoneNumberId) {
            this.phoneNumberId = phoneNumberId;
            return this;
        }
        public String getPhoneNumberId() {
            return this.phoneNumberId;
        }

    }

    public static class ListVoiceAppraiseResponseBodyContactFlowPhoneNumbers extends TeaModel {
        @NameInMap("PhoneNumber")
        public java.util.List<ListVoiceAppraiseResponseBodyContactFlowPhoneNumbersPhoneNumber> phoneNumber;

        public static ListVoiceAppraiseResponseBodyContactFlowPhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            ListVoiceAppraiseResponseBodyContactFlowPhoneNumbers self = new ListVoiceAppraiseResponseBodyContactFlowPhoneNumbers();
            return TeaModel.build(map, self);
        }

        public ListVoiceAppraiseResponseBodyContactFlowPhoneNumbers setPhoneNumber(java.util.List<ListVoiceAppraiseResponseBodyContactFlowPhoneNumbersPhoneNumber> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public java.util.List<ListVoiceAppraiseResponseBodyContactFlowPhoneNumbersPhoneNumber> getPhoneNumber() {
            return this.phoneNumber;
        }

    }

    public static class ListVoiceAppraiseResponseBodyContactFlowVersionsContactFlowVersion extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("LastModified")
        public String lastModified;

        @NameInMap("Version")
        public String version;

        @NameInMap("ContactFlowVersionId")
        public String contactFlowVersionId;

        @NameInMap("ContactFlowVersionDescription")
        public String contactFlowVersionDescription;

        @NameInMap("LastModifiedBy")
        public String lastModifiedBy;

        @NameInMap("Content")
        public String content;

        public static ListVoiceAppraiseResponseBodyContactFlowVersionsContactFlowVersion build(java.util.Map<String, ?> map) throws Exception {
            ListVoiceAppraiseResponseBodyContactFlowVersionsContactFlowVersion self = new ListVoiceAppraiseResponseBodyContactFlowVersionsContactFlowVersion();
            return TeaModel.build(map, self);
        }

        public ListVoiceAppraiseResponseBodyContactFlowVersionsContactFlowVersion setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVoiceAppraiseResponseBodyContactFlowVersionsContactFlowVersion setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public ListVoiceAppraiseResponseBodyContactFlowVersionsContactFlowVersion setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListVoiceAppraiseResponseBodyContactFlowVersionsContactFlowVersion setContactFlowVersionId(String contactFlowVersionId) {
            this.contactFlowVersionId = contactFlowVersionId;
            return this;
        }
        public String getContactFlowVersionId() {
            return this.contactFlowVersionId;
        }

        public ListVoiceAppraiseResponseBodyContactFlowVersionsContactFlowVersion setContactFlowVersionDescription(String contactFlowVersionDescription) {
            this.contactFlowVersionDescription = contactFlowVersionDescription;
            return this;
        }
        public String getContactFlowVersionDescription() {
            return this.contactFlowVersionDescription;
        }

        public ListVoiceAppraiseResponseBodyContactFlowVersionsContactFlowVersion setLastModifiedBy(String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }
        public String getLastModifiedBy() {
            return this.lastModifiedBy;
        }

        public ListVoiceAppraiseResponseBodyContactFlowVersionsContactFlowVersion setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ListVoiceAppraiseResponseBodyContactFlowVersions extends TeaModel {
        @NameInMap("ContactFlowVersion")
        public java.util.List<ListVoiceAppraiseResponseBodyContactFlowVersionsContactFlowVersion> contactFlowVersion;

        public static ListVoiceAppraiseResponseBodyContactFlowVersions build(java.util.Map<String, ?> map) throws Exception {
            ListVoiceAppraiseResponseBodyContactFlowVersions self = new ListVoiceAppraiseResponseBodyContactFlowVersions();
            return TeaModel.build(map, self);
        }

        public ListVoiceAppraiseResponseBodyContactFlowVersions setContactFlowVersion(java.util.List<ListVoiceAppraiseResponseBodyContactFlowVersionsContactFlowVersion> contactFlowVersion) {
            this.contactFlowVersion = contactFlowVersion;
            return this;
        }
        public java.util.List<ListVoiceAppraiseResponseBodyContactFlowVersionsContactFlowVersion> getContactFlowVersion() {
            return this.contactFlowVersion;
        }

    }

    public static class ListVoiceAppraiseResponseBodyContactFlow extends TeaModel {
        @NameInMap("ContactFlowDescription")
        public String contactFlowDescription;

        @NameInMap("Type")
        public String type;

        @NameInMap("PhoneNumbers")
        public ListVoiceAppraiseResponseBodyContactFlowPhoneNumbers phoneNumbers;

        @NameInMap("ContactFlowName")
        public String contactFlowName;

        @NameInMap("Versions")
        public ListVoiceAppraiseResponseBodyContactFlowVersions versions;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ContactFlowId")
        public String contactFlowId;

        @NameInMap("AppliedVersion")
        public String appliedVersion;

        public static ListVoiceAppraiseResponseBodyContactFlow build(java.util.Map<String, ?> map) throws Exception {
            ListVoiceAppraiseResponseBodyContactFlow self = new ListVoiceAppraiseResponseBodyContactFlow();
            return TeaModel.build(map, self);
        }

        public ListVoiceAppraiseResponseBodyContactFlow setContactFlowDescription(String contactFlowDescription) {
            this.contactFlowDescription = contactFlowDescription;
            return this;
        }
        public String getContactFlowDescription() {
            return this.contactFlowDescription;
        }

        public ListVoiceAppraiseResponseBodyContactFlow setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListVoiceAppraiseResponseBodyContactFlow setPhoneNumbers(ListVoiceAppraiseResponseBodyContactFlowPhoneNumbers phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }
        public ListVoiceAppraiseResponseBodyContactFlowPhoneNumbers getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public ListVoiceAppraiseResponseBodyContactFlow setContactFlowName(String contactFlowName) {
            this.contactFlowName = contactFlowName;
            return this;
        }
        public String getContactFlowName() {
            return this.contactFlowName;
        }

        public ListVoiceAppraiseResponseBodyContactFlow setVersions(ListVoiceAppraiseResponseBodyContactFlowVersions versions) {
            this.versions = versions;
            return this;
        }
        public ListVoiceAppraiseResponseBodyContactFlowVersions getVersions() {
            return this.versions;
        }

        public ListVoiceAppraiseResponseBodyContactFlow setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListVoiceAppraiseResponseBodyContactFlow setContactFlowId(String contactFlowId) {
            this.contactFlowId = contactFlowId;
            return this;
        }
        public String getContactFlowId() {
            return this.contactFlowId;
        }

        public ListVoiceAppraiseResponseBodyContactFlow setAppliedVersion(String appliedVersion) {
            this.appliedVersion = appliedVersion;
            return this;
        }
        public String getAppliedVersion() {
            return this.appliedVersion;
        }

    }

}

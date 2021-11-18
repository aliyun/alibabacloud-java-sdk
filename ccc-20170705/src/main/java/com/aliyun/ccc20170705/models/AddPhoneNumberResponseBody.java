// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class AddPhoneNumberResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PhoneNumber")
    public AddPhoneNumberResponseBodyPhoneNumber phoneNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddPhoneNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPhoneNumberResponseBody self = new AddPhoneNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPhoneNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddPhoneNumberResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddPhoneNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddPhoneNumberResponseBody setPhoneNumber(AddPhoneNumberResponseBodyPhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public AddPhoneNumberResponseBodyPhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public AddPhoneNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddPhoneNumberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddPhoneNumberResponseBodyPhoneNumberContactFlow extends TeaModel {
        @NameInMap("ContactFlowDescription")
        public String contactFlowDescription;

        @NameInMap("ContactFlowId")
        public String contactFlowId;

        @NameInMap("ContactFlowName")
        public String contactFlowName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Type")
        public String type;

        public static AddPhoneNumberResponseBodyPhoneNumberContactFlow build(java.util.Map<String, ?> map) throws Exception {
            AddPhoneNumberResponseBodyPhoneNumberContactFlow self = new AddPhoneNumberResponseBodyPhoneNumberContactFlow();
            return TeaModel.build(map, self);
        }

        public AddPhoneNumberResponseBodyPhoneNumberContactFlow setContactFlowDescription(String contactFlowDescription) {
            this.contactFlowDescription = contactFlowDescription;
            return this;
        }
        public String getContactFlowDescription() {
            return this.contactFlowDescription;
        }

        public AddPhoneNumberResponseBodyPhoneNumberContactFlow setContactFlowId(String contactFlowId) {
            this.contactFlowId = contactFlowId;
            return this;
        }
        public String getContactFlowId() {
            return this.contactFlowId;
        }

        public AddPhoneNumberResponseBodyPhoneNumberContactFlow setContactFlowName(String contactFlowName) {
            this.contactFlowName = contactFlowName;
            return this;
        }
        public String getContactFlowName() {
            return this.contactFlowName;
        }

        public AddPhoneNumberResponseBodyPhoneNumberContactFlow setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AddPhoneNumberResponseBodyPhoneNumberContactFlow setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AddPhoneNumberResponseBodyPhoneNumber extends TeaModel {
        @NameInMap("AllowOutbound")
        public Boolean allowOutbound;

        @NameInMap("ContactFlow")
        public AddPhoneNumberResponseBodyPhoneNumberContactFlow contactFlow;

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

        public static AddPhoneNumberResponseBodyPhoneNumber build(java.util.Map<String, ?> map) throws Exception {
            AddPhoneNumberResponseBodyPhoneNumber self = new AddPhoneNumberResponseBodyPhoneNumber();
            return TeaModel.build(map, self);
        }

        public AddPhoneNumberResponseBodyPhoneNumber setAllowOutbound(Boolean allowOutbound) {
            this.allowOutbound = allowOutbound;
            return this;
        }
        public Boolean getAllowOutbound() {
            return this.allowOutbound;
        }

        public AddPhoneNumberResponseBodyPhoneNumber setContactFlow(AddPhoneNumberResponseBodyPhoneNumberContactFlow contactFlow) {
            this.contactFlow = contactFlow;
            return this;
        }
        public AddPhoneNumberResponseBodyPhoneNumberContactFlow getContactFlow() {
            return this.contactFlow;
        }

        public AddPhoneNumberResponseBodyPhoneNumber setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AddPhoneNumberResponseBodyPhoneNumber setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public AddPhoneNumberResponseBodyPhoneNumber setPhoneNumberDescription(String phoneNumberDescription) {
            this.phoneNumberDescription = phoneNumberDescription;
            return this;
        }
        public String getPhoneNumberDescription() {
            return this.phoneNumberDescription;
        }

        public AddPhoneNumberResponseBodyPhoneNumber setPhoneNumberId(String phoneNumberId) {
            this.phoneNumberId = phoneNumberId;
            return this;
        }
        public String getPhoneNumberId() {
            return this.phoneNumberId;
        }

        public AddPhoneNumberResponseBodyPhoneNumber setRemainingTime(Integer remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }
        public Integer getRemainingTime() {
            return this.remainingTime;
        }

        public AddPhoneNumberResponseBodyPhoneNumber setTestOnly(Boolean testOnly) {
            this.testOnly = testOnly;
            return this;
        }
        public Boolean getTestOnly() {
            return this.testOnly;
        }

        public AddPhoneNumberResponseBodyPhoneNumber setTrunks(Integer trunks) {
            this.trunks = trunks;
            return this;
        }
        public Integer getTrunks() {
            return this.trunks;
        }

        public AddPhoneNumberResponseBodyPhoneNumber setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class AddBulkPhoneNumbersResponseBody extends TeaModel {
    @NameInMap("ArrearagePhoneNumbers")
    public AddBulkPhoneNumbersResponseBodyArrearagePhoneNumbers arrearagePhoneNumbers;

    @NameInMap("PhoneNumbers")
    public AddBulkPhoneNumbersResponseBodyPhoneNumbers phoneNumbers;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("FailedPhoneNumbers")
    public AddBulkPhoneNumbersResponseBodyFailedPhoneNumbers failedPhoneNumbers;

    @NameInMap("UserdPhoneNumbers")
    public AddBulkPhoneNumbersResponseBodyUserdPhoneNumbers userdPhoneNumbers;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static AddBulkPhoneNumbersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddBulkPhoneNumbersResponseBody self = new AddBulkPhoneNumbersResponseBody();
        return TeaModel.build(map, self);
    }

    public AddBulkPhoneNumbersResponseBody setArrearagePhoneNumbers(AddBulkPhoneNumbersResponseBodyArrearagePhoneNumbers arrearagePhoneNumbers) {
        this.arrearagePhoneNumbers = arrearagePhoneNumbers;
        return this;
    }
    public AddBulkPhoneNumbersResponseBodyArrearagePhoneNumbers getArrearagePhoneNumbers() {
        return this.arrearagePhoneNumbers;
    }

    public AddBulkPhoneNumbersResponseBody setPhoneNumbers(AddBulkPhoneNumbersResponseBodyPhoneNumbers phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public AddBulkPhoneNumbersResponseBodyPhoneNumbers getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public AddBulkPhoneNumbersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddBulkPhoneNumbersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddBulkPhoneNumbersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddBulkPhoneNumbersResponseBody setFailedPhoneNumbers(AddBulkPhoneNumbersResponseBodyFailedPhoneNumbers failedPhoneNumbers) {
        this.failedPhoneNumbers = failedPhoneNumbers;
        return this;
    }
    public AddBulkPhoneNumbersResponseBodyFailedPhoneNumbers getFailedPhoneNumbers() {
        return this.failedPhoneNumbers;
    }

    public AddBulkPhoneNumbersResponseBody setUserdPhoneNumbers(AddBulkPhoneNumbersResponseBodyUserdPhoneNumbers userdPhoneNumbers) {
        this.userdPhoneNumbers = userdPhoneNumbers;
        return this;
    }
    public AddBulkPhoneNumbersResponseBodyUserdPhoneNumbers getUserdPhoneNumbers() {
        return this.userdPhoneNumbers;
    }

    public AddBulkPhoneNumbersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddBulkPhoneNumbersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddBulkPhoneNumbersResponseBodyArrearagePhoneNumbers extends TeaModel {
        @NameInMap("ArrearagePhoneNumber")
        public java.util.List<String> arrearagePhoneNumber;

        public static AddBulkPhoneNumbersResponseBodyArrearagePhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            AddBulkPhoneNumbersResponseBodyArrearagePhoneNumbers self = new AddBulkPhoneNumbersResponseBodyArrearagePhoneNumbers();
            return TeaModel.build(map, self);
        }

        public AddBulkPhoneNumbersResponseBodyArrearagePhoneNumbers setArrearagePhoneNumber(java.util.List<String> arrearagePhoneNumber) {
            this.arrearagePhoneNumber = arrearagePhoneNumber;
            return this;
        }
        public java.util.List<String> getArrearagePhoneNumber() {
            return this.arrearagePhoneNumber;
        }

    }

    public static class AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroupsSkillGroup extends TeaModel {
        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        public static AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroupsSkillGroup build(java.util.Map<String, ?> map) throws Exception {
            AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroupsSkillGroup self = new AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroupsSkillGroup();
            return TeaModel.build(map, self);
        }

        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroupsSkillGroup setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroupsSkillGroup setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

    }

    public static class AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroups extends TeaModel {
        @NameInMap("SkillGroup")
        public java.util.List<AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroupsSkillGroup> skillGroup;

        public static AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroups build(java.util.Map<String, ?> map) throws Exception {
            AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroups self = new AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroups();
            return TeaModel.build(map, self);
        }

        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroups setSkillGroup(java.util.List<AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroupsSkillGroup> skillGroup) {
            this.skillGroup = skillGroup;
            return this;
        }
        public java.util.List<AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroupsSkillGroup> getSkillGroup() {
            return this.skillGroup;
        }

    }

    public static class AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("ContactFlowDescription")
        public String contactFlowDescription;

        @NameInMap("ContactFlowName")
        public String contactFlowName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ContactFlowId")
        public String contactFlowId;

        public static AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow build(java.util.Map<String, ?> map) throws Exception {
            AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow self = new AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow();
            return TeaModel.build(map, self);
        }

        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow setContactFlowDescription(String contactFlowDescription) {
            this.contactFlowDescription = contactFlowDescription;
            return this;
        }
        public String getContactFlowDescription() {
            return this.contactFlowDescription;
        }

        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow setContactFlowName(String contactFlowName) {
            this.contactFlowName = contactFlowName;
            return this;
        }
        public String getContactFlowName() {
            return this.contactFlowName;
        }

        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow setContactFlowId(String contactFlowId) {
            this.contactFlowId = contactFlowId;
            return this;
        }
        public String getContactFlowId() {
            return this.contactFlowId;
        }

    }

    public static class AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumber extends TeaModel {
        @NameInMap("SkillGroups")
        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroups skillGroups;

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

        @NameInMap("ContactFlow")
        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow contactFlow;

        @NameInMap("PhoneNumberId")
        public String phoneNumberId;

        public static AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumber build(java.util.Map<String, ?> map) throws Exception {
            AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumber self = new AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumber();
            return TeaModel.build(map, self);
        }

        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setSkillGroups(AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroups skillGroups) {
            this.skillGroups = skillGroups;
            return this;
        }
        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroups getSkillGroups() {
            return this.skillGroups;
        }

        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setTestOnly(Boolean testOnly) {
            this.testOnly = testOnly;
            return this;
        }
        public Boolean getTestOnly() {
            return this.testOnly;
        }

        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setTrunks(Integer trunks) {
            this.trunks = trunks;
            return this;
        }
        public Integer getTrunks() {
            return this.trunks;
        }

        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setRemainingTime(Integer remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }
        public Integer getRemainingTime() {
            return this.remainingTime;
        }

        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setAllowOutbound(Boolean allowOutbound) {
            this.allowOutbound = allowOutbound;
            return this;
        }
        public Boolean getAllowOutbound() {
            return this.allowOutbound;
        }

        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setPhoneNumberDescription(String phoneNumberDescription) {
            this.phoneNumberDescription = phoneNumberDescription;
            return this;
        }
        public String getPhoneNumberDescription() {
            return this.phoneNumberDescription;
        }

        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setContactFlow(AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow contactFlow) {
            this.contactFlow = contactFlow;
            return this;
        }
        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow getContactFlow() {
            return this.contactFlow;
        }

        public AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setPhoneNumberId(String phoneNumberId) {
            this.phoneNumberId = phoneNumberId;
            return this;
        }
        public String getPhoneNumberId() {
            return this.phoneNumberId;
        }

    }

    public static class AddBulkPhoneNumbersResponseBodyPhoneNumbers extends TeaModel {
        @NameInMap("PhoneNumber")
        public java.util.List<AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumber> phoneNumber;

        public static AddBulkPhoneNumbersResponseBodyPhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            AddBulkPhoneNumbersResponseBodyPhoneNumbers self = new AddBulkPhoneNumbersResponseBodyPhoneNumbers();
            return TeaModel.build(map, self);
        }

        public AddBulkPhoneNumbersResponseBodyPhoneNumbers setPhoneNumber(java.util.List<AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumber> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public java.util.List<AddBulkPhoneNumbersResponseBodyPhoneNumbersPhoneNumber> getPhoneNumber() {
            return this.phoneNumber;
        }

    }

    public static class AddBulkPhoneNumbersResponseBodyFailedPhoneNumbers extends TeaModel {
        @NameInMap("FailedPhoneNumber")
        public java.util.List<String> failedPhoneNumber;

        public static AddBulkPhoneNumbersResponseBodyFailedPhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            AddBulkPhoneNumbersResponseBodyFailedPhoneNumbers self = new AddBulkPhoneNumbersResponseBodyFailedPhoneNumbers();
            return TeaModel.build(map, self);
        }

        public AddBulkPhoneNumbersResponseBodyFailedPhoneNumbers setFailedPhoneNumber(java.util.List<String> failedPhoneNumber) {
            this.failedPhoneNumber = failedPhoneNumber;
            return this;
        }
        public java.util.List<String> getFailedPhoneNumber() {
            return this.failedPhoneNumber;
        }

    }

    public static class AddBulkPhoneNumbersResponseBodyUserdPhoneNumbers extends TeaModel {
        @NameInMap("UserdPhoneNumber")
        public java.util.List<String> userdPhoneNumber;

        public static AddBulkPhoneNumbersResponseBodyUserdPhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            AddBulkPhoneNumbersResponseBodyUserdPhoneNumbers self = new AddBulkPhoneNumbersResponseBodyUserdPhoneNumbers();
            return TeaModel.build(map, self);
        }

        public AddBulkPhoneNumbersResponseBodyUserdPhoneNumbers setUserdPhoneNumber(java.util.List<String> userdPhoneNumber) {
            this.userdPhoneNumber = userdPhoneNumber;
            return this;
        }
        public java.util.List<String> getUserdPhoneNumber() {
            return this.userdPhoneNumber;
        }

    }

}

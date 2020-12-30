// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifyPhoneNumberResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("PhoneNumber")
    public ModifyPhoneNumberResponseBodyPhoneNumber phoneNumber;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyPhoneNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPhoneNumberResponseBody self = new ModifyPhoneNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPhoneNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyPhoneNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyPhoneNumberResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyPhoneNumberResponseBody setPhoneNumber(ModifyPhoneNumberResponseBodyPhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public ModifyPhoneNumberResponseBodyPhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public ModifyPhoneNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyPhoneNumberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyPhoneNumberResponseBodyPhoneNumberSkillGroupsSkillGroup extends TeaModel {
        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        public static ModifyPhoneNumberResponseBodyPhoneNumberSkillGroupsSkillGroup build(java.util.Map<String, ?> map) throws Exception {
            ModifyPhoneNumberResponseBodyPhoneNumberSkillGroupsSkillGroup self = new ModifyPhoneNumberResponseBodyPhoneNumberSkillGroupsSkillGroup();
            return TeaModel.build(map, self);
        }

        public ModifyPhoneNumberResponseBodyPhoneNumberSkillGroupsSkillGroup setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public ModifyPhoneNumberResponseBodyPhoneNumberSkillGroupsSkillGroup setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

    }

    public static class ModifyPhoneNumberResponseBodyPhoneNumberSkillGroups extends TeaModel {
        @NameInMap("SkillGroup")
        public java.util.List<ModifyPhoneNumberResponseBodyPhoneNumberSkillGroupsSkillGroup> skillGroup;

        public static ModifyPhoneNumberResponseBodyPhoneNumberSkillGroups build(java.util.Map<String, ?> map) throws Exception {
            ModifyPhoneNumberResponseBodyPhoneNumberSkillGroups self = new ModifyPhoneNumberResponseBodyPhoneNumberSkillGroups();
            return TeaModel.build(map, self);
        }

        public ModifyPhoneNumberResponseBodyPhoneNumberSkillGroups setSkillGroup(java.util.List<ModifyPhoneNumberResponseBodyPhoneNumberSkillGroupsSkillGroup> skillGroup) {
            this.skillGroup = skillGroup;
            return this;
        }
        public java.util.List<ModifyPhoneNumberResponseBodyPhoneNumberSkillGroupsSkillGroup> getSkillGroup() {
            return this.skillGroup;
        }

    }

    public static class ModifyPhoneNumberResponseBodyPhoneNumberContactFlow extends TeaModel {
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

        public static ModifyPhoneNumberResponseBodyPhoneNumberContactFlow build(java.util.Map<String, ?> map) throws Exception {
            ModifyPhoneNumberResponseBodyPhoneNumberContactFlow self = new ModifyPhoneNumberResponseBodyPhoneNumberContactFlow();
            return TeaModel.build(map, self);
        }

        public ModifyPhoneNumberResponseBodyPhoneNumberContactFlow setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyPhoneNumberResponseBodyPhoneNumberContactFlow setContactFlowDescription(String contactFlowDescription) {
            this.contactFlowDescription = contactFlowDescription;
            return this;
        }
        public String getContactFlowDescription() {
            return this.contactFlowDescription;
        }

        public ModifyPhoneNumberResponseBodyPhoneNumberContactFlow setContactFlowName(String contactFlowName) {
            this.contactFlowName = contactFlowName;
            return this;
        }
        public String getContactFlowName() {
            return this.contactFlowName;
        }

        public ModifyPhoneNumberResponseBodyPhoneNumberContactFlow setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyPhoneNumberResponseBodyPhoneNumberContactFlow setContactFlowId(String contactFlowId) {
            this.contactFlowId = contactFlowId;
            return this;
        }
        public String getContactFlowId() {
            return this.contactFlowId;
        }

    }

    public static class ModifyPhoneNumberResponseBodyPhoneNumber extends TeaModel {
        @NameInMap("SkillGroups")
        public ModifyPhoneNumberResponseBodyPhoneNumberSkillGroups skillGroups;

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
        public ModifyPhoneNumberResponseBodyPhoneNumberContactFlow contactFlow;

        @NameInMap("PhoneNumberId")
        public String phoneNumberId;

        public static ModifyPhoneNumberResponseBodyPhoneNumber build(java.util.Map<String, ?> map) throws Exception {
            ModifyPhoneNumberResponseBodyPhoneNumber self = new ModifyPhoneNumberResponseBodyPhoneNumber();
            return TeaModel.build(map, self);
        }

        public ModifyPhoneNumberResponseBodyPhoneNumber setSkillGroups(ModifyPhoneNumberResponseBodyPhoneNumberSkillGroups skillGroups) {
            this.skillGroups = skillGroups;
            return this;
        }
        public ModifyPhoneNumberResponseBodyPhoneNumberSkillGroups getSkillGroups() {
            return this.skillGroups;
        }

        public ModifyPhoneNumberResponseBodyPhoneNumber setTestOnly(Boolean testOnly) {
            this.testOnly = testOnly;
            return this;
        }
        public Boolean getTestOnly() {
            return this.testOnly;
        }

        public ModifyPhoneNumberResponseBodyPhoneNumber setTrunks(Integer trunks) {
            this.trunks = trunks;
            return this;
        }
        public Integer getTrunks() {
            return this.trunks;
        }

        public ModifyPhoneNumberResponseBodyPhoneNumber setRemainingTime(Integer remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }
        public Integer getRemainingTime() {
            return this.remainingTime;
        }

        public ModifyPhoneNumberResponseBodyPhoneNumber setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ModifyPhoneNumberResponseBodyPhoneNumber setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyPhoneNumberResponseBodyPhoneNumber setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public ModifyPhoneNumberResponseBodyPhoneNumber setAllowOutbound(Boolean allowOutbound) {
            this.allowOutbound = allowOutbound;
            return this;
        }
        public Boolean getAllowOutbound() {
            return this.allowOutbound;
        }

        public ModifyPhoneNumberResponseBodyPhoneNumber setPhoneNumberDescription(String phoneNumberDescription) {
            this.phoneNumberDescription = phoneNumberDescription;
            return this;
        }
        public String getPhoneNumberDescription() {
            return this.phoneNumberDescription;
        }

        public ModifyPhoneNumberResponseBodyPhoneNumber setContactFlow(ModifyPhoneNumberResponseBodyPhoneNumberContactFlow contactFlow) {
            this.contactFlow = contactFlow;
            return this;
        }
        public ModifyPhoneNumberResponseBodyPhoneNumberContactFlow getContactFlow() {
            return this.contactFlow;
        }

        public ModifyPhoneNumberResponseBodyPhoneNumber setPhoneNumberId(String phoneNumberId) {
            this.phoneNumberId = phoneNumberId;
            return this;
        }
        public String getPhoneNumberId() {
            return this.phoneNumberId;
        }

    }

}

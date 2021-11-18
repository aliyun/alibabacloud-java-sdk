// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListSkillGroupsOfUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SkillLevels")
    public ListSkillGroupsOfUserResponseBodySkillLevels skillLevels;

    @NameInMap("Success")
    public Boolean success;

    public static ListSkillGroupsOfUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupsOfUserResponseBody self = new ListSkillGroupsOfUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupsOfUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSkillGroupsOfUserResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSkillGroupsOfUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSkillGroupsOfUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSkillGroupsOfUserResponseBody setSkillLevels(ListSkillGroupsOfUserResponseBodySkillLevels skillLevels) {
        this.skillLevels = skillLevels;
        return this;
    }
    public ListSkillGroupsOfUserResponseBodySkillLevels getSkillLevels() {
        return this.skillLevels;
    }

    public ListSkillGroupsOfUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbersPhoneNumber extends TeaModel {
        @NameInMap("AllowOutbound")
        public Boolean allowOutbound;

        @NameInMap("City")
        public String city;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Number")
        public String number;

        @NameInMap("PhoneNumberDescription")
        public String phoneNumberDescription;

        @NameInMap("PhoneNumberId")
        public String phoneNumberId;

        @NameInMap("Province")
        public String province;

        @NameInMap("RemainingTime")
        public Integer remainingTime;

        @NameInMap("TestOnly")
        public Boolean testOnly;

        @NameInMap("Trunks")
        public Integer trunks;

        @NameInMap("Usage")
        public String usage;

        public static ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbersPhoneNumber build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbersPhoneNumber self = new ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbersPhoneNumber();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbersPhoneNumber setAllowOutbound(Boolean allowOutbound) {
            this.allowOutbound = allowOutbound;
            return this;
        }
        public Boolean getAllowOutbound() {
            return this.allowOutbound;
        }

        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbersPhoneNumber setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbersPhoneNumber setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbersPhoneNumber setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbersPhoneNumber setPhoneNumberDescription(String phoneNumberDescription) {
            this.phoneNumberDescription = phoneNumberDescription;
            return this;
        }
        public String getPhoneNumberDescription() {
            return this.phoneNumberDescription;
        }

        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbersPhoneNumber setPhoneNumberId(String phoneNumberId) {
            this.phoneNumberId = phoneNumberId;
            return this;
        }
        public String getPhoneNumberId() {
            return this.phoneNumberId;
        }

        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbersPhoneNumber setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbersPhoneNumber setRemainingTime(Integer remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }
        public Integer getRemainingTime() {
            return this.remainingTime;
        }

        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbersPhoneNumber setTestOnly(Boolean testOnly) {
            this.testOnly = testOnly;
            return this;
        }
        public Boolean getTestOnly() {
            return this.testOnly;
        }

        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbersPhoneNumber setTrunks(Integer trunks) {
            this.trunks = trunks;
            return this;
        }
        public Integer getTrunks() {
            return this.trunks;
        }

        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbersPhoneNumber setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

    public static class ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbers extends TeaModel {
        @NameInMap("PhoneNumber")
        public java.util.List<ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbersPhoneNumber> phoneNumber;

        public static ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbers self = new ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbers();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbers setPhoneNumber(java.util.List<ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbersPhoneNumber> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public java.util.List<ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbersPhoneNumber> getPhoneNumber() {
            return this.phoneNumber;
        }

    }

    public static class ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkill extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OutboundPhoneNumbers")
        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbers outboundPhoneNumbers;

        @NameInMap("RoutingStrategy")
        public String routingStrategy;

        @NameInMap("SkillGroupDescription")
        public String skillGroupDescription;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        public static ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkill build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkill self = new ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkill();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkill setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkill setOutboundPhoneNumbers(ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbers outboundPhoneNumbers) {
            this.outboundPhoneNumbers = outboundPhoneNumbers;
            return this;
        }
        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkillOutboundPhoneNumbers getOutboundPhoneNumbers() {
            return this.outboundPhoneNumbers;
        }

        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkill setRoutingStrategy(String routingStrategy) {
            this.routingStrategy = routingStrategy;
            return this;
        }
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkill setSkillGroupDescription(String skillGroupDescription) {
            this.skillGroupDescription = skillGroupDescription;
            return this;
        }
        public String getSkillGroupDescription() {
            return this.skillGroupDescription;
        }

        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkill setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkill setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

    }

    public static class ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevel extends TeaModel {
        @NameInMap("Level")
        public Integer level;

        @NameInMap("Skill")
        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkill skill;

        @NameInMap("SkillLevelId")
        public String skillLevelId;

        public static ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevel build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevel self = new ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevel();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevel setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevel setSkill(ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkill skill) {
            this.skill = skill;
            return this;
        }
        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevelSkill getSkill() {
            return this.skill;
        }

        public ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevel setSkillLevelId(String skillLevelId) {
            this.skillLevelId = skillLevelId;
            return this;
        }
        public String getSkillLevelId() {
            return this.skillLevelId;
        }

    }

    public static class ListSkillGroupsOfUserResponseBodySkillLevels extends TeaModel {
        @NameInMap("SkillLevel")
        public java.util.List<ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevel> skillLevel;

        public static ListSkillGroupsOfUserResponseBodySkillLevels build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupsOfUserResponseBodySkillLevels self = new ListSkillGroupsOfUserResponseBodySkillLevels();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupsOfUserResponseBodySkillLevels setSkillLevel(java.util.List<ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevel> skillLevel) {
            this.skillLevel = skillLevel;
            return this;
        }
        public java.util.List<ListSkillGroupsOfUserResponseBodySkillLevelsSkillLevel> getSkillLevel() {
            return this.skillLevel;
        }

    }

}

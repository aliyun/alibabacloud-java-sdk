// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListSkillGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SkillGroups")
    public ListSkillGroupsResponseBodySkillGroups skillGroups;

    @NameInMap("Success")
    public Boolean success;

    public static ListSkillGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupsResponseBody self = new ListSkillGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSkillGroupsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSkillGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSkillGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSkillGroupsResponseBody setSkillGroups(ListSkillGroupsResponseBodySkillGroups skillGroups) {
        this.skillGroups = skillGroups;
        return this;
    }
    public ListSkillGroupsResponseBodySkillGroups getSkillGroups() {
        return this.skillGroups;
    }

    public ListSkillGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbersPhoneNumber extends TeaModel {
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

        public static ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbersPhoneNumber build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbersPhoneNumber self = new ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbersPhoneNumber();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbersPhoneNumber setAllowOutbound(Boolean allowOutbound) {
            this.allowOutbound = allowOutbound;
            return this;
        }
        public Boolean getAllowOutbound() {
            return this.allowOutbound;
        }

        public ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbersPhoneNumber setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbersPhoneNumber setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbersPhoneNumber setPhoneNumberDescription(String phoneNumberDescription) {
            this.phoneNumberDescription = phoneNumberDescription;
            return this;
        }
        public String getPhoneNumberDescription() {
            return this.phoneNumberDescription;
        }

        public ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbersPhoneNumber setPhoneNumberId(String phoneNumberId) {
            this.phoneNumberId = phoneNumberId;
            return this;
        }
        public String getPhoneNumberId() {
            return this.phoneNumberId;
        }

        public ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbersPhoneNumber setRemainingTime(Integer remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }
        public Integer getRemainingTime() {
            return this.remainingTime;
        }

        public ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbersPhoneNumber setTestOnly(Boolean testOnly) {
            this.testOnly = testOnly;
            return this;
        }
        public Boolean getTestOnly() {
            return this.testOnly;
        }

        public ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbersPhoneNumber setTrunks(Integer trunks) {
            this.trunks = trunks;
            return this;
        }
        public Integer getTrunks() {
            return this.trunks;
        }

        public ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbersPhoneNumber setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

    public static class ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbers extends TeaModel {
        @NameInMap("PhoneNumber")
        public java.util.List<ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbersPhoneNumber> phoneNumber;

        public static ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbers self = new ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbers();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbers setPhoneNumber(java.util.List<ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbersPhoneNumber> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public java.util.List<ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbersPhoneNumber> getPhoneNumber() {
            return this.phoneNumber;
        }

    }

    public static class ListSkillGroupsResponseBodySkillGroupsSkillGroup extends TeaModel {
        @NameInMap("AccQueueName")
        public String accQueueName;

        @NameInMap("AccSkillGroupName")
        public String accSkillGroupName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OutboundPhoneNumbers")
        public ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbers outboundPhoneNumbers;

        @NameInMap("RoutingStrategy")
        public String routingStrategy;

        @NameInMap("SkillGroupDescription")
        public String skillGroupDescription;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("UserCount")
        public Integer userCount;

        public static ListSkillGroupsResponseBodySkillGroupsSkillGroup build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupsResponseBodySkillGroupsSkillGroup self = new ListSkillGroupsResponseBodySkillGroupsSkillGroup();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupsResponseBodySkillGroupsSkillGroup setAccQueueName(String accQueueName) {
            this.accQueueName = accQueueName;
            return this;
        }
        public String getAccQueueName() {
            return this.accQueueName;
        }

        public ListSkillGroupsResponseBodySkillGroupsSkillGroup setAccSkillGroupName(String accSkillGroupName) {
            this.accSkillGroupName = accSkillGroupName;
            return this;
        }
        public String getAccSkillGroupName() {
            return this.accSkillGroupName;
        }

        public ListSkillGroupsResponseBodySkillGroupsSkillGroup setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSkillGroupsResponseBodySkillGroupsSkillGroup setOutboundPhoneNumbers(ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbers outboundPhoneNumbers) {
            this.outboundPhoneNumbers = outboundPhoneNumbers;
            return this;
        }
        public ListSkillGroupsResponseBodySkillGroupsSkillGroupOutboundPhoneNumbers getOutboundPhoneNumbers() {
            return this.outboundPhoneNumbers;
        }

        public ListSkillGroupsResponseBodySkillGroupsSkillGroup setRoutingStrategy(String routingStrategy) {
            this.routingStrategy = routingStrategy;
            return this;
        }
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        public ListSkillGroupsResponseBodySkillGroupsSkillGroup setSkillGroupDescription(String skillGroupDescription) {
            this.skillGroupDescription = skillGroupDescription;
            return this;
        }
        public String getSkillGroupDescription() {
            return this.skillGroupDescription;
        }

        public ListSkillGroupsResponseBodySkillGroupsSkillGroup setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListSkillGroupsResponseBodySkillGroupsSkillGroup setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public ListSkillGroupsResponseBodySkillGroupsSkillGroup setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

    }

    public static class ListSkillGroupsResponseBodySkillGroups extends TeaModel {
        @NameInMap("SkillGroup")
        public java.util.List<ListSkillGroupsResponseBodySkillGroupsSkillGroup> skillGroup;

        public static ListSkillGroupsResponseBodySkillGroups build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupsResponseBodySkillGroups self = new ListSkillGroupsResponseBodySkillGroups();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupsResponseBodySkillGroups setSkillGroup(java.util.List<ListSkillGroupsResponseBodySkillGroupsSkillGroup> skillGroup) {
            this.skillGroup = skillGroup;
            return this;
        }
        public java.util.List<ListSkillGroupsResponseBodySkillGroupsSkillGroup> getSkillGroup() {
            return this.skillGroup;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListTransferableSkillGroupsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("SkillGroups")
    public java.util.List<ListTransferableSkillGroupsResponseBodySkillGroups> skillGroups;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListTransferableSkillGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransferableSkillGroupsResponseBody self = new ListTransferableSkillGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransferableSkillGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTransferableSkillGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransferableSkillGroupsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTransferableSkillGroupsResponseBody setSkillGroups(java.util.List<ListTransferableSkillGroupsResponseBodySkillGroups> skillGroups) {
        this.skillGroups = skillGroups;
        return this;
    }
    public java.util.List<ListTransferableSkillGroupsResponseBodySkillGroups> getSkillGroups() {
        return this.skillGroups;
    }

    public ListTransferableSkillGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTransferableSkillGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTransferableSkillGroupsResponseBodySkillGroups extends TeaModel {
        @NameInMap("AllowPrivateOutboundNumber")
        public Boolean allowPrivateOutboundNumber;

        @NameInMap("RoutingStrategy")
        public String routingStrategy;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("UserCount")
        public Integer userCount;

        @NameInMap("AccQueueName")
        public String accQueueName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SkillGroupDescription")
        public String skillGroupDescription;

        @NameInMap("AccSkillGroupName")
        public String accSkillGroupName;

        public static ListTransferableSkillGroupsResponseBodySkillGroups build(java.util.Map<String, ?> map) throws Exception {
            ListTransferableSkillGroupsResponseBodySkillGroups self = new ListTransferableSkillGroupsResponseBodySkillGroups();
            return TeaModel.build(map, self);
        }

        public ListTransferableSkillGroupsResponseBodySkillGroups setAllowPrivateOutboundNumber(Boolean allowPrivateOutboundNumber) {
            this.allowPrivateOutboundNumber = allowPrivateOutboundNumber;
            return this;
        }
        public Boolean getAllowPrivateOutboundNumber() {
            return this.allowPrivateOutboundNumber;
        }

        public ListTransferableSkillGroupsResponseBodySkillGroups setRoutingStrategy(String routingStrategy) {
            this.routingStrategy = routingStrategy;
            return this;
        }
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        public ListTransferableSkillGroupsResponseBodySkillGroups setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public ListTransferableSkillGroupsResponseBodySkillGroups setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListTransferableSkillGroupsResponseBodySkillGroups setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

        public ListTransferableSkillGroupsResponseBodySkillGroups setAccQueueName(String accQueueName) {
            this.accQueueName = accQueueName;
            return this;
        }
        public String getAccQueueName() {
            return this.accQueueName;
        }

        public ListTransferableSkillGroupsResponseBodySkillGroups setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListTransferableSkillGroupsResponseBodySkillGroups setSkillGroupDescription(String skillGroupDescription) {
            this.skillGroupDescription = skillGroupDescription;
            return this;
        }
        public String getSkillGroupDescription() {
            return this.skillGroupDescription;
        }

        public ListTransferableSkillGroupsResponseBodySkillGroups setAccSkillGroupName(String accSkillGroupName) {
            this.accSkillGroupName = accSkillGroupName;
            return this;
        }
        public String getAccSkillGroupName() {
            return this.accSkillGroupName;
        }

    }

}

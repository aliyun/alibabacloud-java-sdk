// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListAgentEventsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AgentEventList")
    public ListAgentEventsResponseBodyAgentEventList agentEventList;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListAgentEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentEventsResponseBody self = new ListAgentEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAgentEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentEventsResponseBody setAgentEventList(ListAgentEventsResponseBodyAgentEventList agentEventList) {
        this.agentEventList = agentEventList;
        return this;
    }
    public ListAgentEventsResponseBodyAgentEventList getAgentEventList() {
        return this.agentEventList;
    }

    public ListAgentEventsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAgentEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgentEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAgentEventsResponseBodyAgentEventListAgentEventSkillGroupIdsSkillGroup extends TeaModel {
        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        public static ListAgentEventsResponseBodyAgentEventListAgentEventSkillGroupIdsSkillGroup build(java.util.Map<String, ?> map) throws Exception {
            ListAgentEventsResponseBodyAgentEventListAgentEventSkillGroupIdsSkillGroup self = new ListAgentEventsResponseBodyAgentEventListAgentEventSkillGroupIdsSkillGroup();
            return TeaModel.build(map, self);
        }

        public ListAgentEventsResponseBodyAgentEventListAgentEventSkillGroupIdsSkillGroup setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public ListAgentEventsResponseBodyAgentEventListAgentEventSkillGroupIdsSkillGroup setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

    }

    public static class ListAgentEventsResponseBodyAgentEventListAgentEventSkillGroupIds extends TeaModel {
        @NameInMap("SkillGroup")
        public java.util.List<ListAgentEventsResponseBodyAgentEventListAgentEventSkillGroupIdsSkillGroup> skillGroup;

        public static ListAgentEventsResponseBodyAgentEventListAgentEventSkillGroupIds build(java.util.Map<String, ?> map) throws Exception {
            ListAgentEventsResponseBodyAgentEventListAgentEventSkillGroupIds self = new ListAgentEventsResponseBodyAgentEventListAgentEventSkillGroupIds();
            return TeaModel.build(map, self);
        }

        public ListAgentEventsResponseBodyAgentEventListAgentEventSkillGroupIds setSkillGroup(java.util.List<ListAgentEventsResponseBodyAgentEventListAgentEventSkillGroupIdsSkillGroup> skillGroup) {
            this.skillGroup = skillGroup;
            return this;
        }
        public java.util.List<ListAgentEventsResponseBodyAgentEventListAgentEventSkillGroupIdsSkillGroup> getSkillGroup() {
            return this.skillGroup;
        }

    }

    public static class ListAgentEventsResponseBodyAgentEventListAgentEvent extends TeaModel {
        @NameInMap("EventTime")
        public Long eventTime;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Event")
        public String event;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RamId")
        public Long ramId;

        @NameInMap("SkillGroupIds")
        public ListAgentEventsResponseBodyAgentEventListAgentEventSkillGroupIds skillGroupIds;

        public static ListAgentEventsResponseBodyAgentEventListAgentEvent build(java.util.Map<String, ?> map) throws Exception {
            ListAgentEventsResponseBodyAgentEventListAgentEvent self = new ListAgentEventsResponseBodyAgentEventListAgentEvent();
            return TeaModel.build(map, self);
        }

        public ListAgentEventsResponseBodyAgentEventListAgentEvent setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

        public ListAgentEventsResponseBodyAgentEventListAgentEvent setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListAgentEventsResponseBodyAgentEventListAgentEvent setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public ListAgentEventsResponseBodyAgentEventListAgentEvent setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAgentEventsResponseBodyAgentEventListAgentEvent setRamId(Long ramId) {
            this.ramId = ramId;
            return this;
        }
        public Long getRamId() {
            return this.ramId;
        }

        public ListAgentEventsResponseBodyAgentEventListAgentEvent setSkillGroupIds(ListAgentEventsResponseBodyAgentEventListAgentEventSkillGroupIds skillGroupIds) {
            this.skillGroupIds = skillGroupIds;
            return this;
        }
        public ListAgentEventsResponseBodyAgentEventListAgentEventSkillGroupIds getSkillGroupIds() {
            return this.skillGroupIds;
        }

    }

    public static class ListAgentEventsResponseBodyAgentEventList extends TeaModel {
        @NameInMap("AgentEvent")
        public java.util.List<ListAgentEventsResponseBodyAgentEventListAgentEvent> agentEvent;

        public static ListAgentEventsResponseBodyAgentEventList build(java.util.Map<String, ?> map) throws Exception {
            ListAgentEventsResponseBodyAgentEventList self = new ListAgentEventsResponseBodyAgentEventList();
            return TeaModel.build(map, self);
        }

        public ListAgentEventsResponseBodyAgentEventList setAgentEvent(java.util.List<ListAgentEventsResponseBodyAgentEventListAgentEvent> agentEvent) {
            this.agentEvent = agentEvent;
            return this;
        }
        public java.util.List<ListAgentEventsResponseBodyAgentEventListAgentEvent> getAgentEvent() {
            return this.agentEvent;
        }

    }

}

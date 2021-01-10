// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ListFlowTriggersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Triggers")
    public java.util.List<ListFlowTriggersResponseBodyTriggers> triggers;

    public static ListFlowTriggersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowTriggersResponseBody self = new ListFlowTriggersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowTriggersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowTriggersResponseBody setTriggers(java.util.List<ListFlowTriggersResponseBodyTriggers> triggers) {
        this.triggers = triggers;
        return this;
    }
    public java.util.List<ListFlowTriggersResponseBodyTriggers> getTriggers() {
        return this.triggers;
    }

    public static class ListFlowTriggersResponseBodyTriggers extends TeaModel {
        @NameInMap("TriggerName")
        public String triggerName;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("ActionsCount")
        public Integer actionsCount;

        @NameInMap("TriggerActionName")
        public String triggerActionName;

        @NameInMap("TriggerDescription")
        public String triggerDescription;

        @NameInMap("TriggerActionDescription")
        public String triggerActionDescription;

        @NameInMap("TriggerType")
        public String triggerType;

        public static ListFlowTriggersResponseBodyTriggers build(java.util.Map<String, ?> map) throws Exception {
            ListFlowTriggersResponseBodyTriggers self = new ListFlowTriggersResponseBodyTriggers();
            return TeaModel.build(map, self);
        }

        public ListFlowTriggersResponseBodyTriggers setTriggerName(String triggerName) {
            this.triggerName = triggerName;
            return this;
        }
        public String getTriggerName() {
            return this.triggerName;
        }

        public ListFlowTriggersResponseBodyTriggers setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListFlowTriggersResponseBodyTriggers setActionsCount(Integer actionsCount) {
            this.actionsCount = actionsCount;
            return this;
        }
        public Integer getActionsCount() {
            return this.actionsCount;
        }

        public ListFlowTriggersResponseBodyTriggers setTriggerActionName(String triggerActionName) {
            this.triggerActionName = triggerActionName;
            return this;
        }
        public String getTriggerActionName() {
            return this.triggerActionName;
        }

        public ListFlowTriggersResponseBodyTriggers setTriggerDescription(String triggerDescription) {
            this.triggerDescription = triggerDescription;
            return this;
        }
        public String getTriggerDescription() {
            return this.triggerDescription;
        }

        public ListFlowTriggersResponseBodyTriggers setTriggerActionDescription(String triggerActionDescription) {
            this.triggerActionDescription = triggerActionDescription;
            return this;
        }
        public String getTriggerActionDescription() {
            return this.triggerActionDescription;
        }

        public ListFlowTriggersResponseBodyTriggers setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

}

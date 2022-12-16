// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListInstanceHistoryEventsShrinkRequest extends TeaModel {
    @NameInMap("body")
    public java.util.List<ListInstanceHistoryEventsShrinkRequestBody> body;

    @NameInMap("eventCreateEndTime")
    public String eventCreateEndTime;

    @NameInMap("eventCreateStartTime")
    public String eventCreateStartTime;

    @NameInMap("eventCycleStatus")
    public String eventCycleStatusShrink;

    @NameInMap("eventExecuteEndTime")
    public String eventExecuteEndTime;

    @NameInMap("eventExecuteStartTime")
    public String eventExecuteStartTime;

    @NameInMap("eventFinashEndTime")
    public String eventFinashEndTime;

    @NameInMap("eventFinashStartTime")
    public String eventFinashStartTime;

    @NameInMap("eventLevel")
    public String eventLevelShrink;

    @NameInMap("eventType")
    public String eventTypeShrink;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("nodeIP")
    public String nodeIP;

    @NameInMap("page")
    public Integer page;

    @NameInMap("size")
    public Integer size;

    public static ListInstanceHistoryEventsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceHistoryEventsShrinkRequest self = new ListInstanceHistoryEventsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceHistoryEventsShrinkRequest setBody(java.util.List<ListInstanceHistoryEventsShrinkRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<ListInstanceHistoryEventsShrinkRequestBody> getBody() {
        return this.body;
    }

    public ListInstanceHistoryEventsShrinkRequest setEventCreateEndTime(String eventCreateEndTime) {
        this.eventCreateEndTime = eventCreateEndTime;
        return this;
    }
    public String getEventCreateEndTime() {
        return this.eventCreateEndTime;
    }

    public ListInstanceHistoryEventsShrinkRequest setEventCreateStartTime(String eventCreateStartTime) {
        this.eventCreateStartTime = eventCreateStartTime;
        return this;
    }
    public String getEventCreateStartTime() {
        return this.eventCreateStartTime;
    }

    public ListInstanceHistoryEventsShrinkRequest setEventCycleStatusShrink(String eventCycleStatusShrink) {
        this.eventCycleStatusShrink = eventCycleStatusShrink;
        return this;
    }
    public String getEventCycleStatusShrink() {
        return this.eventCycleStatusShrink;
    }

    public ListInstanceHistoryEventsShrinkRequest setEventExecuteEndTime(String eventExecuteEndTime) {
        this.eventExecuteEndTime = eventExecuteEndTime;
        return this;
    }
    public String getEventExecuteEndTime() {
        return this.eventExecuteEndTime;
    }

    public ListInstanceHistoryEventsShrinkRequest setEventExecuteStartTime(String eventExecuteStartTime) {
        this.eventExecuteStartTime = eventExecuteStartTime;
        return this;
    }
    public String getEventExecuteStartTime() {
        return this.eventExecuteStartTime;
    }

    public ListInstanceHistoryEventsShrinkRequest setEventFinashEndTime(String eventFinashEndTime) {
        this.eventFinashEndTime = eventFinashEndTime;
        return this;
    }
    public String getEventFinashEndTime() {
        return this.eventFinashEndTime;
    }

    public ListInstanceHistoryEventsShrinkRequest setEventFinashStartTime(String eventFinashStartTime) {
        this.eventFinashStartTime = eventFinashStartTime;
        return this;
    }
    public String getEventFinashStartTime() {
        return this.eventFinashStartTime;
    }

    public ListInstanceHistoryEventsShrinkRequest setEventLevelShrink(String eventLevelShrink) {
        this.eventLevelShrink = eventLevelShrink;
        return this;
    }
    public String getEventLevelShrink() {
        return this.eventLevelShrink;
    }

    public ListInstanceHistoryEventsShrinkRequest setEventTypeShrink(String eventTypeShrink) {
        this.eventTypeShrink = eventTypeShrink;
        return this;
    }
    public String getEventTypeShrink() {
        return this.eventTypeShrink;
    }

    public ListInstanceHistoryEventsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstanceHistoryEventsShrinkRequest setNodeIP(String nodeIP) {
        this.nodeIP = nodeIP;
        return this;
    }
    public String getNodeIP() {
        return this.nodeIP;
    }

    public ListInstanceHistoryEventsShrinkRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListInstanceHistoryEventsShrinkRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public static class ListInstanceHistoryEventsShrinkRequestBody extends TeaModel {
        @NameInMap("desc")
        public Boolean desc;

        @NameInMap("sortField")
        public String sortField;

        public static ListInstanceHistoryEventsShrinkRequestBody build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceHistoryEventsShrinkRequestBody self = new ListInstanceHistoryEventsShrinkRequestBody();
            return TeaModel.build(map, self);
        }

        public ListInstanceHistoryEventsShrinkRequestBody setDesc(Boolean desc) {
            this.desc = desc;
            return this;
        }
        public Boolean getDesc() {
            return this.desc;
        }

        public ListInstanceHistoryEventsShrinkRequestBody setSortField(String sortField) {
            this.sortField = sortField;
            return this;
        }
        public String getSortField() {
            return this.sortField;
        }

    }

}

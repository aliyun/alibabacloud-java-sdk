// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListInstanceHistoryEventsRequest extends TeaModel {
    @NameInMap("body")
    public java.util.List<ListInstanceHistoryEventsRequestBody> body;

    @NameInMap("eventCreateEndTime")
    public String eventCreateEndTime;

    @NameInMap("eventCreateStartTime")
    public String eventCreateStartTime;

    @NameInMap("eventExecuteEndTime")
    public String eventExecuteEndTime;

    @NameInMap("eventExecuteStartTime")
    public String eventExecuteStartTime;

    @NameInMap("eventFinashEndTime")
    public String eventFinashEndTime;

    @NameInMap("eventFinashStartTime")
    public String eventFinashStartTime;

    @NameInMap("eventLevel")
    public String eventLevel;

    @NameInMap("eventType")
    public String eventType;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("nodeIP")
    public String nodeIP;

    public static ListInstanceHistoryEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceHistoryEventsRequest self = new ListInstanceHistoryEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceHistoryEventsRequest setBody(java.util.List<ListInstanceHistoryEventsRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<ListInstanceHistoryEventsRequestBody> getBody() {
        return this.body;
    }

    public ListInstanceHistoryEventsRequest setEventCreateEndTime(String eventCreateEndTime) {
        this.eventCreateEndTime = eventCreateEndTime;
        return this;
    }
    public String getEventCreateEndTime() {
        return this.eventCreateEndTime;
    }

    public ListInstanceHistoryEventsRequest setEventCreateStartTime(String eventCreateStartTime) {
        this.eventCreateStartTime = eventCreateStartTime;
        return this;
    }
    public String getEventCreateStartTime() {
        return this.eventCreateStartTime;
    }

    public ListInstanceHistoryEventsRequest setEventExecuteEndTime(String eventExecuteEndTime) {
        this.eventExecuteEndTime = eventExecuteEndTime;
        return this;
    }
    public String getEventExecuteEndTime() {
        return this.eventExecuteEndTime;
    }

    public ListInstanceHistoryEventsRequest setEventExecuteStartTime(String eventExecuteStartTime) {
        this.eventExecuteStartTime = eventExecuteStartTime;
        return this;
    }
    public String getEventExecuteStartTime() {
        return this.eventExecuteStartTime;
    }

    public ListInstanceHistoryEventsRequest setEventFinashEndTime(String eventFinashEndTime) {
        this.eventFinashEndTime = eventFinashEndTime;
        return this;
    }
    public String getEventFinashEndTime() {
        return this.eventFinashEndTime;
    }

    public ListInstanceHistoryEventsRequest setEventFinashStartTime(String eventFinashStartTime) {
        this.eventFinashStartTime = eventFinashStartTime;
        return this;
    }
    public String getEventFinashStartTime() {
        return this.eventFinashStartTime;
    }

    public ListInstanceHistoryEventsRequest setEventLevel(String eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }
    public String getEventLevel() {
        return this.eventLevel;
    }

    public ListInstanceHistoryEventsRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public ListInstanceHistoryEventsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstanceHistoryEventsRequest setNodeIP(String nodeIP) {
        this.nodeIP = nodeIP;
        return this;
    }
    public String getNodeIP() {
        return this.nodeIP;
    }

    public static class ListInstanceHistoryEventsRequestBody extends TeaModel {
        @NameInMap("desc")
        public Boolean desc;

        @NameInMap("sortField")
        public String sortField;

        public static ListInstanceHistoryEventsRequestBody build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceHistoryEventsRequestBody self = new ListInstanceHistoryEventsRequestBody();
            return TeaModel.build(map, self);
        }

        public ListInstanceHistoryEventsRequestBody setDesc(Boolean desc) {
            this.desc = desc;
            return this;
        }
        public Boolean getDesc() {
            return this.desc;
        }

        public ListInstanceHistoryEventsRequestBody setSortField(String sortField) {
            this.sortField = sortField;
            return this;
        }
        public String getSortField() {
            return this.sortField;
        }

    }

}

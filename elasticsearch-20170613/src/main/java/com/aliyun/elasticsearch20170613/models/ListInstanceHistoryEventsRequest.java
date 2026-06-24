// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListInstanceHistoryEventsRequest extends TeaModel {
    /**
     * <p>The request body parameters.</p>
     */
    @NameInMap("body")
    public java.util.List<ListInstanceHistoryEventsRequestBody> body;

    /**
     * <p>The end time for querying by event creation time. Specify a timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1645596516000</p>
     */
    @NameInMap("eventCreateEndTime")
    public String eventCreateEndTime;

    /**
     * <p>The start time for querying by event creation time. Specify a timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1645596516000</p>
     */
    @NameInMap("eventCreateStartTime")
    public String eventCreateStartTime;

    /**
     * <p>The lifecycle status of the event.</p>
     */
    @NameInMap("eventCycleStatus")
    public java.util.List<String> eventCycleStatus;

    /**
     * <p>The end time for querying by event execution time. Specify a timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1645596516000</p>
     */
    @NameInMap("eventExecuteEndTime")
    public String eventExecuteEndTime;

    /**
     * <p>The start time for querying by event execution time. Specify a timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1645596516000</p>
     */
    @NameInMap("eventExecuteStartTime")
    public String eventExecuteStartTime;

    /**
     * <p>The end time for querying by event completion time. Specify a timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1645596516000</p>
     */
    @NameInMap("eventFinashEndTime")
    public String eventFinashEndTime;

    /**
     * <p>The start time for querying by event completion time. Specify a timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1645596516000</p>
     */
    @NameInMap("eventFinashStartTime")
    public String eventFinashStartTime;

    /**
     * <p>The event level.</p>
     */
    @NameInMap("eventLevel")
    public java.util.List<String> eventLevel;

    /**
     * <p>The event type.</p>
     */
    @NameInMap("eventType")
    public java.util.List<String> eventType;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>es-cn-2r42l7a740005****</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The IP address of the node that triggered the event.</p>
     * 
     * <strong>example:</strong>
     * <p>10.1.xx.xx</p>
     */
    @NameInMap("nodeIP")
    public String nodeIP;

    /**
     * <p>The starting document offset. The value must be a non-negative integer. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The number of events to return. The value must be a non-negative integer. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Integer size;

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

    public ListInstanceHistoryEventsRequest setEventCycleStatus(java.util.List<String> eventCycleStatus) {
        this.eventCycleStatus = eventCycleStatus;
        return this;
    }
    public java.util.List<String> getEventCycleStatus() {
        return this.eventCycleStatus;
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

    public ListInstanceHistoryEventsRequest setEventLevel(java.util.List<String> eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }
    public java.util.List<String> getEventLevel() {
        return this.eventLevel;
    }

    public ListInstanceHistoryEventsRequest setEventType(java.util.List<String> eventType) {
        this.eventType = eventType;
        return this;
    }
    public java.util.List<String> getEventType() {
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

    public ListInstanceHistoryEventsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListInstanceHistoryEventsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public static class ListInstanceHistoryEventsRequestBody extends TeaModel {
        /**
         * <p>Specifies whether to sort in descending order. Valid values:</p>
         * <ul>
         * <li>true (default): Yes.</li>
         * <li>false: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("desc")
        public Boolean desc;

        /**
         * <p>The field by which the results are sorted. Valid values:</p>
         * <ul>
         * <li>event_time: event creation time</li>
         * <li>event_execute_start_time: event execution time</li>
         * <li>event_execute_finish_time: event completion time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>event_time</p>
         */
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

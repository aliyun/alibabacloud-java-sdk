// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListOperationEventsRequest extends TeaModel {
    /**
     * <p>Filters events by name.</p>
     * 
     * <strong>example:</strong>
     * <p>COLD_UPGRADE</p>
     */
    @NameInMap("eventName")
    public String eventName;

    /**
     * <p>Specifies whether to sort events by event name in descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("eventNameDesc")
    public Boolean eventNameDesc;

    /**
     * <p>Filters events by type.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_MAINTENANCE</p>
     */
    @NameInMap("eventType")
    public String eventType;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>hgpost-cn-xxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <p>The page size. Default value: 50. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>Specifies whether to sort events by schedule time in descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("scheduleTimeDesc")
    public Boolean scheduleTimeDesc;

    /**
     * <p>Filters events by state.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("state")
    public String state;

    public static ListOperationEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationEventsRequest self = new ListOperationEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationEventsRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public ListOperationEventsRequest setEventNameDesc(Boolean eventNameDesc) {
        this.eventNameDesc = eventNameDesc;
        return this;
    }
    public Boolean getEventNameDesc() {
        return this.eventNameDesc;
    }

    public ListOperationEventsRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public ListOperationEventsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListOperationEventsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListOperationEventsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListOperationEventsRequest setScheduleTimeDesc(Boolean scheduleTimeDesc) {
        this.scheduleTimeDesc = scheduleTimeDesc;
        return this;
    }
    public Boolean getScheduleTimeDesc() {
        return this.scheduleTimeDesc;
    }

    public ListOperationEventsRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}

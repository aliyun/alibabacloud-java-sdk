// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListOperationEventsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>COLD_UPGRADE</p>
     */
    @NameInMap("eventName")
    public String eventName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("eventNameDesc")
    public Boolean eventNameDesc;

    /**
     * <strong>example:</strong>
     * <p>SYSTEM_MAINTENANCE</p>
     */
    @NameInMap("eventType")
    public String eventType;

    /**
     * <strong>example:</strong>
     * <p>hgpost-cn-xxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("scheduleTimeDesc")
    public Boolean scheduleTimeDesc;

    /**
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

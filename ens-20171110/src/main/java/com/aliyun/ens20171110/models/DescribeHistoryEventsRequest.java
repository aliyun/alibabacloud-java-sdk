// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeHistoryEventsRequest extends TeaModel {
    /**
     * <p>The levels of the event-triggered alerts.</p>
     */
    @NameInMap("EventLevels")
    public java.util.List<String> eventLevels;

    /**
     * <p>Event status list.</p>
     */
    @NameInMap("EventStatus")
    public java.util.List<String> eventStatus;

    /**
     * <p>The list of event types.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventTypes")
    public java.util.List<String> eventTypes;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The IDs of resources.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    public static DescribeHistoryEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryEventsRequest self = new DescribeHistoryEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryEventsRequest setEventLevels(java.util.List<String> eventLevels) {
        this.eventLevels = eventLevels;
        return this;
    }
    public java.util.List<String> getEventLevels() {
        return this.eventLevels;
    }

    public DescribeHistoryEventsRequest setEventStatus(java.util.List<String> eventStatus) {
        this.eventStatus = eventStatus;
        return this;
    }
    public java.util.List<String> getEventStatus() {
        return this.eventStatus;
    }

    public DescribeHistoryEventsRequest setEventTypes(java.util.List<String> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }
    public java.util.List<String> getEventTypes() {
        return this.eventTypes;
    }

    public DescribeHistoryEventsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHistoryEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHistoryEventsRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeHistoryEventsShrinkRequest extends TeaModel {
    @NameInMap("EventLevels")
    public String eventLevelsShrink;

    @NameInMap("EventStatus")
    public String eventStatusShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventTypes")
    public String eventTypesShrink;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceIds")
    public String resourceIdsShrink;

    public static DescribeHistoryEventsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryEventsShrinkRequest self = new DescribeHistoryEventsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryEventsShrinkRequest setEventLevelsShrink(String eventLevelsShrink) {
        this.eventLevelsShrink = eventLevelsShrink;
        return this;
    }
    public String getEventLevelsShrink() {
        return this.eventLevelsShrink;
    }

    public DescribeHistoryEventsShrinkRequest setEventStatusShrink(String eventStatusShrink) {
        this.eventStatusShrink = eventStatusShrink;
        return this;
    }
    public String getEventStatusShrink() {
        return this.eventStatusShrink;
    }

    public DescribeHistoryEventsShrinkRequest setEventTypesShrink(String eventTypesShrink) {
        this.eventTypesShrink = eventTypesShrink;
        return this;
    }
    public String getEventTypesShrink() {
        return this.eventTypesShrink;
    }

    public DescribeHistoryEventsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHistoryEventsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHistoryEventsShrinkRequest setResourceIdsShrink(String resourceIdsShrink) {
        this.resourceIdsShrink = resourceIdsShrink;
        return this;
    }
    public String getResourceIdsShrink() {
        return this.resourceIdsShrink;
    }

}

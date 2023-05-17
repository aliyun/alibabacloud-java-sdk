// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceEventRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("PageNum")
    public String pageNum;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeServiceEventRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceEventRequest self = new DescribeServiceEventRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceEventRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeServiceEventRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeServiceEventRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeServiceEventRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public DescribeServiceEventRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeServiceEventRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRealtimeDeliveryAccRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("Project")
    public String project;

    @NameInMap("LogStore")
    public String logStore;

    public static DescribeRealtimeDeliveryAccRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRealtimeDeliveryAccRequest self = new DescribeRealtimeDeliveryAccRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRealtimeDeliveryAccRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRealtimeDeliveryAccRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeRealtimeDeliveryAccRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRealtimeDeliveryAccRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeRealtimeDeliveryAccRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DescribeRealtimeDeliveryAccRequest setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

}

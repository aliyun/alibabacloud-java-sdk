// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRealtimeDeliveryAccRequest extends TeaModel {
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

    public static DescribeLiveRealtimeDeliveryAccRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRealtimeDeliveryAccRequest self = new DescribeLiveRealtimeDeliveryAccRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRealtimeDeliveryAccRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveRealtimeDeliveryAccRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveRealtimeDeliveryAccRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveRealtimeDeliveryAccRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeLiveRealtimeDeliveryAccRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DescribeLiveRealtimeDeliveryAccRequest setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

}

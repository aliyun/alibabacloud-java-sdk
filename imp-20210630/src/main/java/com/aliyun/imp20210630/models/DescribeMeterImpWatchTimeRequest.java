// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DescribeMeterImpWatchTimeRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeMeterImpWatchTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImpWatchTimeRequest self = new DescribeMeterImpWatchTimeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImpWatchTimeRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeMeterImpWatchTimeRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeMeterImpWatchTimeRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeMeterImpWatchTimeRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}

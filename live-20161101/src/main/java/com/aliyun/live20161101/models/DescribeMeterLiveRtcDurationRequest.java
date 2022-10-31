// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeMeterLiveRtcDurationRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("ServiceArea")
    public String serviceArea;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("appId")
    public String appId;

    public static DescribeMeterLiveRtcDurationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterLiveRtcDurationRequest self = new DescribeMeterLiveRtcDurationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMeterLiveRtcDurationRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeMeterLiveRtcDurationRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeMeterLiveRtcDurationRequest setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }
    public String getServiceArea() {
        return this.serviceArea;
    }

    public DescribeMeterLiveRtcDurationRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeMeterLiveRtcDurationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

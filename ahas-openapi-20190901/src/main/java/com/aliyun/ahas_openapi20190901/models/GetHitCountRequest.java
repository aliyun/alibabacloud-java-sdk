// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetHitCountRequest extends TeaModel {
    @NameInMap("ActivityTaskId")
    public String activityTaskId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    public static GetHitCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHitCountRequest self = new GetHitCountRequest();
        return TeaModel.build(map, self);
    }

    public GetHitCountRequest setActivityTaskId(String activityTaskId) {
        this.activityTaskId = activityTaskId;
        return this;
    }
    public String getActivityTaskId() {
        return this.activityTaskId;
    }

    public GetHitCountRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetHitCountRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetHitCountRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

}

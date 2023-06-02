// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QuerySpaceUsageRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("StartTime")
    public String startTime;

    public static QuerySpaceUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySpaceUsageRequest self = new QuerySpaceUsageRequest();
        return TeaModel.build(map, self);
    }

    public QuerySpaceUsageRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QuerySpaceUsageRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public QuerySpaceUsageRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public QuerySpaceUsageRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}

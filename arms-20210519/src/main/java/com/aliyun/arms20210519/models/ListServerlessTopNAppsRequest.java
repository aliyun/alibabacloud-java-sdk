// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class ListServerlessTopNAppsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    public static ListServerlessTopNAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServerlessTopNAppsRequest self = new ListServerlessTopNAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListServerlessTopNAppsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListServerlessTopNAppsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListServerlessTopNAppsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListServerlessTopNAppsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListServerlessTopNAppsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}

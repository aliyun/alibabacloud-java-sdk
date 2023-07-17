// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ListServerlessTopNAppsRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartTime")
    public Long startTime;

    public static ListServerlessTopNAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServerlessTopNAppsRequest self = new ListServerlessTopNAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListServerlessTopNAppsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
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

    public ListServerlessTopNAppsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListServerlessTopNAppsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}

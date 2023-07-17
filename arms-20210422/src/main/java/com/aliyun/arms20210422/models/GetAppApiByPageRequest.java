// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class GetAppApiByPageRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("IntervalMills")
    public Integer intervalMills;

    @NameInMap("PId")
    public String PId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartTime")
    public Long startTime;

    public static GetAppApiByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppApiByPageRequest self = new GetAppApiByPageRequest();
        return TeaModel.build(map, self);
    }

    public GetAppApiByPageRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetAppApiByPageRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetAppApiByPageRequest setIntervalMills(Integer intervalMills) {
        this.intervalMills = intervalMills;
        return this;
    }
    public Integer getIntervalMills() {
        return this.intervalMills;
    }

    public GetAppApiByPageRequest setPId(String PId) {
        this.PId = PId;
        return this;
    }
    public String getPId() {
        return this.PId;
    }

    public GetAppApiByPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAppApiByPageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAppApiByPageRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}

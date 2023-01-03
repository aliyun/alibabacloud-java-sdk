// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAppApiByPageRequest extends TeaModel {
    // The number of the page to return.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The end of the time range to query. Unit: milliseconds.
    @NameInMap("EndTime")
    public Long endTime;

    // The time interval between the data shards to be queried. Unit: milliseconds. Minimum value: 60000.
    @NameInMap("IntervalMills")
    public Integer intervalMills;

    // The process identifier (PID) of the application. For more information about how to obtain the PID, see [Obtain the PID of an application](https://www.alibabacloud.com/help/zh/doc-detail/186100.htm?spm=a2cdw.13409063.0.0.7a72281f0bkTfx#title-imy-7gj-qhr).
    @NameInMap("PId")
    public String PId;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The beginning of the time range to query. Unit: milliseconds.
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

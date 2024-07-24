// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumOcuStatisticDataShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1687849260000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Filter")
    public String filterShrink;

    @NameInMap("Group")
    public String groupShrink;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>TIME_SERIES</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>1600063200000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static GetRumOcuStatisticDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRumOcuStatisticDataShrinkRequest self = new GetRumOcuStatisticDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetRumOcuStatisticDataShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetRumOcuStatisticDataShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public GetRumOcuStatisticDataShrinkRequest setGroupShrink(String groupShrink) {
        this.groupShrink = groupShrink;
        return this;
    }
    public String getGroupShrink() {
        return this.groupShrink;
    }

    public GetRumOcuStatisticDataShrinkRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public GetRumOcuStatisticDataShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetRumOcuStatisticDataShrinkRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public GetRumOcuStatisticDataShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetRumOcuStatisticDataShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}

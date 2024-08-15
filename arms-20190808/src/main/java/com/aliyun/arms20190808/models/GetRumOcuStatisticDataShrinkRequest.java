// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumOcuStatisticDataShrinkRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1687849260000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The filter condition. Three types of filter conditions are provided:</p>
     * <ul>
     * <li>Application name: pid (Note that the application name is displayed, but the application ID is actually specified)</li>
     * <li>Application type: siteType</li>
     * <li>Data type: dataType</li>
     * </ul>
     */
    @NameInMap("Filter")
    public String filterShrink;

    /**
     * <p>The grouping fields. Valid values:</p>
     * <ul>
     * <li>siteType: The total number of OCUs is grouped by application type.</li>
     * <li>dataType: The total number of OCUs is grouped by data type.</li>
     * <li>pid: The total number of OCUs is grouped by application ID.</li>
     * <li>appName: The total number of OCUs is grouped by application name.</li>
     * <li>startTime: The total number of OCUs is grouped by start time.</li>
     * </ul>
     */
    @NameInMap("Group")
    public String groupShrink;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the query. To query non-time series data, set the value to INSTANT. To query time series data, set the value to TIME_SERIES.</p>
     * 
     * <strong>example:</strong>
     * <p>TIME_SERIES</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Unit: milliseconds.</p>
     * 
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSessionStatisticRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>1677808889806</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai+dir-259382****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The query interval. Unit: seconds. Valid values:</p>
     * <ul>
     * <li>60</li>
     * <li>120</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies to search for session information by region ID. This parameter is used to filter desktop information of a specific region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SearchRegionId")
    public String searchRegionId;

    /**
     * <p>The beginning of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>1679449506572</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSessionStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSessionStatisticRequest self = new DescribeSessionStatisticRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSessionStatisticRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSessionStatisticRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeSessionStatisticRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeSessionStatisticRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSessionStatisticRequest setSearchRegionId(String searchRegionId) {
        this.searchRegionId = searchRegionId;
        return this;
    }
    public String getSearchRegionId() {
        return this.searchRegionId;
    }

    public DescribeSessionStatisticRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}

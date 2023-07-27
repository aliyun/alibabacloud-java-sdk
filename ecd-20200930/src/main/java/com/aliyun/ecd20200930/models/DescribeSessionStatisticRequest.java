// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSessionStatisticRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SearchRegionId")
    public String searchRegionId;

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

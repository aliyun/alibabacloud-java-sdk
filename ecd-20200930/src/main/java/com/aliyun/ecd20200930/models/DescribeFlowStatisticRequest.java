// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFlowStatisticRequest extends TeaModel {
    @NameInMap("DesktopId")
    public String desktopId;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeFlowStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowStatisticRequest self = new DescribeFlowStatisticRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlowStatisticRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public DescribeFlowStatisticRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeFlowStatisticRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFlowStatisticRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFlowStatisticRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeFlowStatisticRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

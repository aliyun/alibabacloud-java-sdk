// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDataPushResultRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("DataNames")
    public String dataNames;

    @NameInMap("DataVersions")
    public String dataVersions;

    @NameInMap("MinDate")
    public String minDate;

    @NameInMap("MaxDate")
    public String maxDate;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionIds")
    public String regionIds;

    public static DescribeDataPushResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataPushResultRequest self = new DescribeDataPushResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataPushResultRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeDataPushResultRequest setDataNames(String dataNames) {
        this.dataNames = dataNames;
        return this;
    }
    public String getDataNames() {
        return this.dataNames;
    }

    public DescribeDataPushResultRequest setDataVersions(String dataVersions) {
        this.dataVersions = dataVersions;
        return this;
    }
    public String getDataVersions() {
        return this.dataVersions;
    }

    public DescribeDataPushResultRequest setMinDate(String minDate) {
        this.minDate = minDate;
        return this;
    }
    public String getMinDate() {
        return this.minDate;
    }

    public DescribeDataPushResultRequest setMaxDate(String maxDate) {
        this.maxDate = maxDate;
        return this;
    }
    public String getMaxDate() {
        return this.maxDate;
    }

    public DescribeDataPushResultRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDataPushResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataPushResultRequest setRegionIds(String regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public String getRegionIds() {
        return this.regionIds;
    }

}

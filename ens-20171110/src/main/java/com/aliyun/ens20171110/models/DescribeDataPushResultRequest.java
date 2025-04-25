// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDataPushResultRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e76f8985-7965-41fc-925b-9648bb6bf650</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the data file. Separate multiple names with commas (,). By default, all data files are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>159828628258496/mirror_file/game-2553efe7-7bf8-40fb-a6e7-09c9c00a992a.tar</p>
     */
    @NameInMap("DataNames")
    public String dataNames;

    /**
     * <p>The version number of the data file. Separate multiple numbers with commas (,). By default, all versions of data files are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>90396</p>
     */
    @NameInMap("DataVersions")
    public String dataVersions;

    /**
     * <p>The end of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-20</p>
     */
    @NameInMap("MaxDate")
    public String maxDate;

    /**
     * <p>The beginning of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-15</p>
     */
    @NameInMap("MinDate")
    public String minDate;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. This parameter is optional if you want to return the push status of all data files.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The IDs of ENS nodes. Separate multiple IDs with commas (,). By default, all ENS nodes are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wuhan-telecom_unicom_cmcc-2,cn-jiaozuo-2</p>
     */
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

    public DescribeDataPushResultRequest setMaxDate(String maxDate) {
        this.maxDate = maxDate;
        return this;
    }
    public String getMaxDate() {
        return this.maxDate;
    }

    public DescribeDataPushResultRequest setMinDate(String minDate) {
        this.minDate = minDate;
        return this;
    }
    public String getMinDate() {
        return this.minDate;
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

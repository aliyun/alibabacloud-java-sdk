// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDataDistResultRequest extends TeaModel {
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
     * <p>cloudgame-shanghai/deploy_app/20220215/1644895216305ACG_M21B-ota-1.1.2-D-0215.0628_V1_0002-pre-weiduan.zip</p>
     */
    @NameInMap("DataNames")
    public String dataNames;

    /**
     * <p>The version number of the data file. Separate multiple numbers with commas (,). By default, all versions of data files are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>4885</p>
     */
    @NameInMap("DataVersions")
    public String dataVersions;

    /**
     * <p>The IDs of the ENS nodes.</p>
     */
    @NameInMap("EnsRegionIds")
    public java.util.List<String> ensRegionIds;

    /**
     * <p>The IDs of ENS instances. Separate multiple IDs with commas (,). By default, all instances are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>i-7ecpqvkicnchxccozrp,i-6ecpqvkicnchxccozrp</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The end of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-01</p>
     */
    @NameInMap("MaxDate")
    public String maxDate;

    /**
     * <p>The beginning of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-02</p>
     */
    @NameInMap("MinDate")
    public String minDate;

    /**
     * <p>The page number. Pages start from page 1. This parameter is optional if you want to return the push status of all data files.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. This parameter is optional if you want to return the distribution status of all data files.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeDataDistResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataDistResultRequest self = new DescribeDataDistResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataDistResultRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeDataDistResultRequest setDataNames(String dataNames) {
        this.dataNames = dataNames;
        return this;
    }
    public String getDataNames() {
        return this.dataNames;
    }

    public DescribeDataDistResultRequest setDataVersions(String dataVersions) {
        this.dataVersions = dataVersions;
        return this;
    }
    public String getDataVersions() {
        return this.dataVersions;
    }

    public DescribeDataDistResultRequest setEnsRegionIds(java.util.List<String> ensRegionIds) {
        this.ensRegionIds = ensRegionIds;
        return this;
    }
    public java.util.List<String> getEnsRegionIds() {
        return this.ensRegionIds;
    }

    public DescribeDataDistResultRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeDataDistResultRequest setMaxDate(String maxDate) {
        this.maxDate = maxDate;
        return this;
    }
    public String getMaxDate() {
        return this.maxDate;
    }

    public DescribeDataDistResultRequest setMinDate(String minDate) {
        this.minDate = minDate;
        return this;
    }
    public String getMinDate() {
        return this.minDate;
    }

    public DescribeDataDistResultRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDataDistResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}

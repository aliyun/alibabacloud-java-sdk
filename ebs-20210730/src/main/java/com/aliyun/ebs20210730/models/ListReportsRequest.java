// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ListReportsRequest extends TeaModel {
    /**
     * <p>App name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>App1</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Maximum number of items for Token-based pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Query token (Token), the value is the NextToken parameter value returned from the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>a6792e832ff0XXXXX</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Page number for paginated queries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Number of rows per page when performing paginated queries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Region ID. You can call <a href="https://help.aliyun.com/document_detail/354276.html">DescribeRegions</a> to query the list of regions supported by Block Storage Data Insights.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListReportsRequest self = new ListReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListReportsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListReportsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListReportsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListReportsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListReportsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListReportsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

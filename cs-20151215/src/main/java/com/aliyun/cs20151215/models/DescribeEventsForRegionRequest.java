// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEventsForRegionRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cf62854ac2130470897be7a27ed1f****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The maximum number of results to return for a single request.</p>
     */
    @NameInMap("max_results")
    public Integer maxResults;

    /**
     * <p>The query token. The value is the next_token parameter value returned by the previous API call.</p>
     */
    @NameInMap("next_token")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page_number")
    public Long pageNumber;

    /**
     * <p>The maximum number of results to return per page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("page_size")
    public Long pageSize;

    public static DescribeEventsForRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsForRegionRequest self = new DescribeEventsForRegionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventsForRegionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeEventsForRegionRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeEventsForRegionRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeEventsForRegionRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEventsForRegionRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}

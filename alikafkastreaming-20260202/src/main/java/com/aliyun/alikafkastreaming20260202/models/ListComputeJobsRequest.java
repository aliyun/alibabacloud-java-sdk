// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class ListComputeJobsRequest extends TeaModel {
    /**
     * <p>The compute instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_streaming-cn-a1b2c3d4</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of jobs to return in the current request. Default value: 10. Maximum value: 1000. If you set this parameter to 0, the default value is used.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Do not specify this parameter in the first request. For subsequent requests, use the <code>NextToken</code> value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwfQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The keyword used to search for jobs by name or remark.</p>
     * 
     * <strong>example:</strong>
     * <p>order</p>
     */
    @NameInMap("Search")
    public String search;

    /**
     * <p>The sort direction. The value is not case-sensitive. Valid values: <code>ASC</code> and <code>DESC</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("SortDirection")
    public String sortDirection;

    /**
     * <p>The sort field. Valid values: <code>createTime</code>, <code>cuReserved</code>, <code>cuLimit</code>, <code>cuUsed</code>, <code>status</code>, and <code>jobName</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>createTime</p>
     */
    @NameInMap("SortField")
    public String sortField;

    public static ListComputeJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListComputeJobsRequest self = new ListComputeJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListComputeJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListComputeJobsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListComputeJobsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListComputeJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListComputeJobsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListComputeJobsRequest setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
        return this;
    }
    public String getSortDirection() {
        return this.sortDirection;
    }

    public ListComputeJobsRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

}

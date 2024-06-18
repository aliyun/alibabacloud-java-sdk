// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListAsynJobsRequest extends TeaModel {
    /**
     * <p>The name of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateLoadBalancer</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The start time of the task. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-03T17:22Z</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The end time of the task. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-04T17:22Z</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The asynchronous task IDs.</p>
     */
    @NameInMap("JobIds")
    public java.util.List<String> jobIds;

    /**
     * <p>The number of entries per page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>You do not need to specify this parameter for the first request.</li>
     * <li>You must specify the token that is obtained from the previous query as the value of <strong>NextToken</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The resource IDs.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The type of the associated resource. Valid values:</p>
     * <ul>
     * <li><strong>loadbalancer</strong>: an Application Load Balancer (ALB) instance</li>
     * <li><strong>listener</strong>: a listener</li>
     * <li><strong>rule</strong>: a forwarding rule</li>
     * <li><strong>acl</strong>: an access control list (ACL)</li>
     * <li><strong>securitypolicy</strong>: a security policy</li>
     * <li><strong>servergroup</strong>: a server group</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>acl</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static ListAsynJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAsynJobsRequest self = new ListAsynJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListAsynJobsRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public ListAsynJobsRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public ListAsynJobsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListAsynJobsRequest setJobIds(java.util.List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public java.util.List<String> getJobIds() {
        return this.jobIds;
    }

    public ListAsynJobsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListAsynJobsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAsynJobsRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public ListAsynJobsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListAsynJobsRequest extends TeaModel {
    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("JobIds")
    public java.util.List<String> jobIds;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

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

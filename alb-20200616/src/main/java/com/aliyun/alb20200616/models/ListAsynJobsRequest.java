// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListAsynJobsRequest extends TeaModel {
    // 操作接口名
    @NameInMap("ApiName")
    public String apiName;

    // 任务过滤时间范围-开始时间
    @NameInMap("BeginTime")
    public Long beginTime;

    // 任务过滤时间范围-结束时间
    @NameInMap("EndTime")
    public Long endTime;

    // 任务ID列表
    @NameInMap("JobIds")
    public java.util.List<String> jobIds;

    // 本次读取的最大数据记录数量
    @NameInMap("MaxResults")
    public Long maxResults;

    // 下一个查询开始Token
    @NameInMap("NextToken")
    public String nextToken;

    // 资源实例ID列表
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    // 资源类型类型
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

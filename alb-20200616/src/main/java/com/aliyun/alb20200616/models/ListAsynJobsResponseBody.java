// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListAsynJobsResponseBody extends TeaModel {
    @NameInMap("Jobs")
    public java.util.List<ListAsynJobsResponseBodyJobs> jobs;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAsynJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAsynJobsResponseBody self = new ListAsynJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAsynJobsResponseBody setJobs(java.util.List<ListAsynJobsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListAsynJobsResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public ListAsynJobsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListAsynJobsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAsynJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAsynJobsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAsynJobsResponseBodyJobs extends TeaModel {
        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("OperateType")
        public String operateType;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Status")
        public String status;

        public static ListAsynJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListAsynJobsResponseBodyJobs self = new ListAsynJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListAsynJobsResponseBodyJobs setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListAsynJobsResponseBodyJobs setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListAsynJobsResponseBodyJobs setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListAsynJobsResponseBodyJobs setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListAsynJobsResponseBodyJobs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAsynJobsResponseBodyJobs setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListAsynJobsResponseBodyJobs setOperateType(String operateType) {
            this.operateType = operateType;
            return this;
        }
        public String getOperateType() {
            return this.operateType;
        }

        public ListAsynJobsResponseBodyJobs setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListAsynJobsResponseBodyJobs setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListAsynJobsResponseBodyJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

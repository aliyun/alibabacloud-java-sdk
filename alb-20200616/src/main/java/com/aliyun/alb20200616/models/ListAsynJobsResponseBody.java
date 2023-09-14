// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListAsynJobsResponseBody extends TeaModel {
    /**
     * <p>The tasks.</p>
     */
    @NameInMap("Jobs")
    public java.util.List<ListAsynJobsResponseBodyJobs> jobs;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** is empty, no next page exists.</p>
     * <p>*   If a value is returned for **NextToken**, the value is the token that determines the start point of the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The name of the operation.</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The timestamp that indicates the start time of the task. Unit: milliseconds.</p>
         * <br>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>If the value of **Status** is Failed, an error code is returned.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>If the value of **Status** is Failed, an error message is returned.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The task ID.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The timestamp that indicates the end time of the task. Unit: milliseconds.</p>
         * <br>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The type of the operation. Valid values:</p>
         * <br>
         * <p>*   **Create**</p>
         * <p>*   **Update**</p>
         * <p>*   **Delete**</p>
         */
        @NameInMap("OperateType")
        public String operateType;

        /**
         * <p>The associated resource ID.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the associated resource. Valid values:</p>
         * <br>
         * <p>*   **loadbalancer**: an ALB instance</p>
         * <p>*   **listener**: a listener</p>
         * <p>*   **rule**: a forwarding rule</p>
         * <p>*   **acl**: an ACL</p>
         * <p>*   **securitypolicy**: a security policy</p>
         * <p>*   **servergroup**: a server group</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The status of the task. Valid values:</p>
         * <br>
         * <p>*   **Succeeded**</p>
         * <p>*   **Failed**</p>
         * <p>*   **Processing**</p>
         */
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

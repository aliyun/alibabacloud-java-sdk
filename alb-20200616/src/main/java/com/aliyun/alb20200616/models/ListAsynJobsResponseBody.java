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
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value is returned for <strong>NextToken</strong>, the value is the token that determines the start point of the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
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
         * 
         * <strong>example:</strong>
         * <p>CreateLoadBalancer</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The timestamp that indicates the start time of the task. Unit: milliseconds.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2134663231234</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>If the value of <strong>Status</strong> is Failed, an error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>506</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>If the value of <strong>Status</strong> is Failed, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>AllocateEipAddress Failed</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B5****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The timestamp that indicates the end time of the task. Unit: milliseconds.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2144663233315</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The type of the operation. Valid values:</p>
         * <ul>
         * <li><strong>Create</strong></li>
         * <li><strong>Update</strong></li>
         * <li><strong>Delete</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Create</p>
         */
        @NameInMap("OperateType")
        public String operateType;

        /**
         * <p>The associated resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-o8mszt95oamfjy****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the associated resource. Valid values:</p>
         * <ul>
         * <li><strong>loadbalancer</strong>: an ALB instance</li>
         * <li><strong>listener</strong>: a listener</li>
         * <li><strong>rule</strong>: a forwarding rule</li>
         * <li><strong>acl</strong>: an ACL</li>
         * <li><strong>securitypolicy</strong>: a security policy</li>
         * <li><strong>servergroup</strong>: a server group</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acl</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><strong>Succeeded</strong></li>
         * <li><strong>Failed</strong></li>
         * <li><strong>Processing</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
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

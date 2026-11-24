// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactSubscriptionTaskResultResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Specifies whether the call was successful. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The call was successful.</p>
     * </li>
     * <li><p><code>false</code>: The call failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A8768F6-9B47-5127-A075-9CFB9F79181F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The image task results.</p>
     */
    @NameInMap("TaskResults")
    public java.util.List<GetArtifactSubscriptionTaskResultResponseBodyTaskResults> taskResults;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetArtifactSubscriptionTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactSubscriptionTaskResultResponseBody self = new GetArtifactSubscriptionTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetArtifactSubscriptionTaskResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetArtifactSubscriptionTaskResultResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetArtifactSubscriptionTaskResultResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetArtifactSubscriptionTaskResultResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetArtifactSubscriptionTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetArtifactSubscriptionTaskResultResponseBody setTaskResults(java.util.List<GetArtifactSubscriptionTaskResultResponseBodyTaskResults> taskResults) {
        this.taskResults = taskResults;
        return this;
    }
    public java.util.List<GetArtifactSubscriptionTaskResultResponseBodyTaskResults> getTaskResults() {
        return this.taskResults;
    }

    public GetArtifactSubscriptionTaskResultResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetArtifactSubscriptionTaskResultResponseBodyTaskResults extends TeaModel {
        /**
         * <p>The end time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1692756630000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-isj2wgaw4z9****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The error message returned when the task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Tag not found.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>test-ns</p>
         */
        @NameInMap("NamespaceName")
        public String namespaceName;

        /**
         * <p>The repository name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-reop</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The result.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The start time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1691719501000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The image tag.</p>
         * 
         * <strong>example:</strong>
         * <p>v2.0</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>crast-wkpfwqozjiq****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static GetArtifactSubscriptionTaskResultResponseBodyTaskResults build(java.util.Map<String, ?> map) throws Exception {
            GetArtifactSubscriptionTaskResultResponseBodyTaskResults self = new GetArtifactSubscriptionTaskResultResponseBodyTaskResults();
            return TeaModel.build(map, self);
        }

        public GetArtifactSubscriptionTaskResultResponseBodyTaskResults setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetArtifactSubscriptionTaskResultResponseBodyTaskResults setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetArtifactSubscriptionTaskResultResponseBodyTaskResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetArtifactSubscriptionTaskResultResponseBodyTaskResults setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public GetArtifactSubscriptionTaskResultResponseBodyTaskResults setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public GetArtifactSubscriptionTaskResultResponseBodyTaskResults setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetArtifactSubscriptionTaskResultResponseBodyTaskResults setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetArtifactSubscriptionTaskResultResponseBodyTaskResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetArtifactSubscriptionTaskResultResponseBodyTaskResults setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetArtifactSubscriptionTaskResultResponseBodyTaskResults setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}

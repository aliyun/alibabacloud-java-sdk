// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowsByPageResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The details of the returned task flows.</p>
     */
    @NameInMap("TaskFlowList")
    public ListTaskFlowsByPageResponseBodyTaskFlowList taskFlowList;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTaskFlowsByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowsByPageResponseBody self = new ListTaskFlowsByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowsByPageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTaskFlowsByPageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTaskFlowsByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskFlowsByPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTaskFlowsByPageResponseBody setTaskFlowList(ListTaskFlowsByPageResponseBodyTaskFlowList taskFlowList) {
        this.taskFlowList = taskFlowList;
        return this;
    }
    public ListTaskFlowsByPageResponseBodyTaskFlowList getTaskFlowList() {
        return this.taskFlowList;
    }

    public ListTaskFlowsByPageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow extends TeaModel {
        /**
         * <p>The ID of the user who created the task flow.</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The username of the user who created the task flow.</p>
         */
        @NameInMap("CreatorNickName")
        public String creatorNickName;

        /**
         * <p>The name of the task flow.</p>
         */
        @NameInMap("DagName")
        public String dagName;

        /**
         * <p>The username of the owner of the task flow.</p>
         */
        @NameInMap("DagOwnerNickName")
        public String dagOwnerNickName;

        /**
         * <p>The ID of the last deployment record of the task flow.</p>
         */
        @NameInMap("DeployId")
        public Long deployId;

        /**
         * <p>The description of the task flow.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the task flow.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The status of the last execution of the task flow. Valid values:</p>
         * <br>
         * <p>*   **0**: invalid</p>
         * <p>*   **1**: scheduling disabled</p>
         * <p>*   **2**: waiting to be scheduled</p>
         */
        @NameInMap("LatestInstanceStatus")
        public Integer latestInstanceStatus;

        /**
         * <p>The time when the last execution record was created.</p>
         */
        @NameInMap("LatestInstanceTime")
        public String latestInstanceTime;

        /**
         * <p>The status of the task flow. Valid values:</p>
         * <br>
         * <p>*   **0**: invalid</p>
         * <p>*   **1**: scheduling disabled</p>
         * <p>*   **2**: waiting to be scheduled</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow build(java.util.Map<String, ?> map) throws Exception {
            ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow self = new ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow();
            return TeaModel.build(map, self);
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setCreatorNickName(String creatorNickName) {
            this.creatorNickName = creatorNickName;
            return this;
        }
        public String getCreatorNickName() {
            return this.creatorNickName;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setDagName(String dagName) {
            this.dagName = dagName;
            return this;
        }
        public String getDagName() {
            return this.dagName;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setDagOwnerNickName(String dagOwnerNickName) {
            this.dagOwnerNickName = dagOwnerNickName;
            return this;
        }
        public String getDagOwnerNickName() {
            return this.dagOwnerNickName;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setDeployId(Long deployId) {
            this.deployId = deployId;
            return this;
        }
        public Long getDeployId() {
            return this.deployId;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setLatestInstanceStatus(Integer latestInstanceStatus) {
            this.latestInstanceStatus = latestInstanceStatus;
            return this;
        }
        public Integer getLatestInstanceStatus() {
            return this.latestInstanceStatus;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setLatestInstanceTime(String latestInstanceTime) {
            this.latestInstanceTime = latestInstanceTime;
            return this;
        }
        public String getLatestInstanceTime() {
            return this.latestInstanceTime;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class ListTaskFlowsByPageResponseBodyTaskFlowList extends TeaModel {
        @NameInMap("TaskFlow")
        public java.util.List<ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow> taskFlow;

        public static ListTaskFlowsByPageResponseBodyTaskFlowList build(java.util.Map<String, ?> map) throws Exception {
            ListTaskFlowsByPageResponseBodyTaskFlowList self = new ListTaskFlowsByPageResponseBodyTaskFlowList();
            return TeaModel.build(map, self);
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowList setTaskFlow(java.util.List<ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow> taskFlow) {
            this.taskFlow = taskFlow;
            return this;
        }
        public java.util.List<ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow> getTaskFlow() {
            return this.taskFlow;
        }

    }

}

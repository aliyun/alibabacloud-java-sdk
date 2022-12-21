// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowResponseBody extends TeaModel {
    // The error code.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   **true**: The request was successful.
    // *   **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    // The information about the task flows returned.
    @NameInMap("TaskFlowList")
    public ListTaskFlowResponseBodyTaskFlowList taskFlowList;

    public static ListTaskFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowResponseBody self = new ListTaskFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTaskFlowResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTaskFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTaskFlowResponseBody setTaskFlowList(ListTaskFlowResponseBodyTaskFlowList taskFlowList) {
        this.taskFlowList = taskFlowList;
        return this;
    }
    public ListTaskFlowResponseBodyTaskFlowList getTaskFlowList() {
        return this.taskFlowList;
    }

    public static class ListTaskFlowResponseBodyTaskFlowListTaskFlow extends TeaModel {
        // The ID of the user who creates the task flow.
        @NameInMap("CreatorId")
        public String creatorId;

        // The name of the user who creates the task flow.
        @NameInMap("CreatorNickName")
        public String creatorNickName;

        // The name of the task flow owner.
        @NameInMap("DagOwnerNickName")
        public String dagOwnerNickName;

        // The ID of the latest deployment record.
        @NameInMap("DeployId")
        public Long deployId;

        // The ID of the task flow.
        @NameInMap("Id")
        public Long id;

        // The status of the latest execution. Valid values:
        // 
        // *   **0**: invalid.
        // *   **1**: scheduling disabled.
        // *   **2**: waiting to be scheduled.
        @NameInMap("LatestInstanceStatus")
        public Integer latestInstanceStatus;

        // The time when the latest execution record was generated.
        @NameInMap("LatestInstanceTime")
        public String latestInstanceTime;

        // The status of the task flow. Valid values:
        // 
        // *   **0**: The task flow is invalid.
        // *   **1**: Scheduling is disabled for the task flow.
        // *   **2**: The task flow is waiting to be scheduled.
        @NameInMap("Status")
        public Integer status;

        public static ListTaskFlowResponseBodyTaskFlowListTaskFlow build(java.util.Map<String, ?> map) throws Exception {
            ListTaskFlowResponseBodyTaskFlowListTaskFlow self = new ListTaskFlowResponseBodyTaskFlowListTaskFlow();
            return TeaModel.build(map, self);
        }

        public ListTaskFlowResponseBodyTaskFlowListTaskFlow setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListTaskFlowResponseBodyTaskFlowListTaskFlow setCreatorNickName(String creatorNickName) {
            this.creatorNickName = creatorNickName;
            return this;
        }
        public String getCreatorNickName() {
            return this.creatorNickName;
        }

        public ListTaskFlowResponseBodyTaskFlowListTaskFlow setDagOwnerNickName(String dagOwnerNickName) {
            this.dagOwnerNickName = dagOwnerNickName;
            return this;
        }
        public String getDagOwnerNickName() {
            return this.dagOwnerNickName;
        }

        public ListTaskFlowResponseBodyTaskFlowListTaskFlow setDeployId(Long deployId) {
            this.deployId = deployId;
            return this;
        }
        public Long getDeployId() {
            return this.deployId;
        }

        public ListTaskFlowResponseBodyTaskFlowListTaskFlow setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListTaskFlowResponseBodyTaskFlowListTaskFlow setLatestInstanceStatus(Integer latestInstanceStatus) {
            this.latestInstanceStatus = latestInstanceStatus;
            return this;
        }
        public Integer getLatestInstanceStatus() {
            return this.latestInstanceStatus;
        }

        public ListTaskFlowResponseBodyTaskFlowListTaskFlow setLatestInstanceTime(String latestInstanceTime) {
            this.latestInstanceTime = latestInstanceTime;
            return this;
        }
        public String getLatestInstanceTime() {
            return this.latestInstanceTime;
        }

        public ListTaskFlowResponseBodyTaskFlowListTaskFlow setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class ListTaskFlowResponseBodyTaskFlowList extends TeaModel {
        @NameInMap("TaskFlow")
        public java.util.List<ListTaskFlowResponseBodyTaskFlowListTaskFlow> taskFlow;

        public static ListTaskFlowResponseBodyTaskFlowList build(java.util.Map<String, ?> map) throws Exception {
            ListTaskFlowResponseBodyTaskFlowList self = new ListTaskFlowResponseBodyTaskFlowList();
            return TeaModel.build(map, self);
        }

        public ListTaskFlowResponseBodyTaskFlowList setTaskFlow(java.util.List<ListTaskFlowResponseBodyTaskFlowListTaskFlow> taskFlow) {
            this.taskFlow = taskFlow;
            return this;
        }
        public java.util.List<ListTaskFlowResponseBodyTaskFlowListTaskFlow> getTaskFlow() {
            return this.taskFlow;
        }

    }

}

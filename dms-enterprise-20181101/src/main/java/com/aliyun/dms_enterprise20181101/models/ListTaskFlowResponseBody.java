// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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

    public static class ListTaskFlowResponseBodyTaskFlowListDAGInstance extends TeaModel {
        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("CreatorNickName")
        public String creatorNickName;

        @NameInMap("DagOwnerNickName")
        public String dagOwnerNickName;

        @NameInMap("DeployId")
        public Long deployId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LatestInstanceStatus")
        public Integer latestInstanceStatus;

        @NameInMap("LatestInstanceTime")
        public String latestInstanceTime;

        @NameInMap("Status")
        public Integer status;

        public static ListTaskFlowResponseBodyTaskFlowListDAGInstance build(java.util.Map<String, ?> map) throws Exception {
            ListTaskFlowResponseBodyTaskFlowListDAGInstance self = new ListTaskFlowResponseBodyTaskFlowListDAGInstance();
            return TeaModel.build(map, self);
        }

        public ListTaskFlowResponseBodyTaskFlowListDAGInstance setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListTaskFlowResponseBodyTaskFlowListDAGInstance setCreatorNickName(String creatorNickName) {
            this.creatorNickName = creatorNickName;
            return this;
        }
        public String getCreatorNickName() {
            return this.creatorNickName;
        }

        public ListTaskFlowResponseBodyTaskFlowListDAGInstance setDagOwnerNickName(String dagOwnerNickName) {
            this.dagOwnerNickName = dagOwnerNickName;
            return this;
        }
        public String getDagOwnerNickName() {
            return this.dagOwnerNickName;
        }

        public ListTaskFlowResponseBodyTaskFlowListDAGInstance setDeployId(Long deployId) {
            this.deployId = deployId;
            return this;
        }
        public Long getDeployId() {
            return this.deployId;
        }

        public ListTaskFlowResponseBodyTaskFlowListDAGInstance setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListTaskFlowResponseBodyTaskFlowListDAGInstance setLatestInstanceStatus(Integer latestInstanceStatus) {
            this.latestInstanceStatus = latestInstanceStatus;
            return this;
        }
        public Integer getLatestInstanceStatus() {
            return this.latestInstanceStatus;
        }

        public ListTaskFlowResponseBodyTaskFlowListDAGInstance setLatestInstanceTime(String latestInstanceTime) {
            this.latestInstanceTime = latestInstanceTime;
            return this;
        }
        public String getLatestInstanceTime() {
            return this.latestInstanceTime;
        }

        public ListTaskFlowResponseBodyTaskFlowListDAGInstance setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class ListTaskFlowResponseBodyTaskFlowList extends TeaModel {
        @NameInMap("DAGInstance")
        public java.util.List<ListTaskFlowResponseBodyTaskFlowListDAGInstance> DAGInstance;

        public static ListTaskFlowResponseBodyTaskFlowList build(java.util.Map<String, ?> map) throws Exception {
            ListTaskFlowResponseBodyTaskFlowList self = new ListTaskFlowResponseBodyTaskFlowList();
            return TeaModel.build(map, self);
        }

        public ListTaskFlowResponseBodyTaskFlowList setDAGInstance(java.util.List<ListTaskFlowResponseBodyTaskFlowListDAGInstance> DAGInstance) {
            this.DAGInstance = DAGInstance;
            return this;
        }
        public java.util.List<ListTaskFlowResponseBodyTaskFlowListDAGInstance> getDAGInstance() {
            return this.DAGInstance;
        }

    }

}

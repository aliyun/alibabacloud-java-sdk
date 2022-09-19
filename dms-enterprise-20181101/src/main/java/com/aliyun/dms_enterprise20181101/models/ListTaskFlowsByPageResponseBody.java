// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowsByPageResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskFlowList")
    public ListTaskFlowsByPageResponseBodyTaskFlowList taskFlowList;

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
        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("CreatorNickName")
        public String creatorNickName;

        @NameInMap("DagName")
        public String dagName;

        @NameInMap("DagOwnerNickName")
        public String dagOwnerNickName;

        @NameInMap("DeployId")
        public Long deployId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LatestInstanceStatus")
        public Integer latestInstanceStatus;

        @NameInMap("LatestInstanceTime")
        public String latestInstanceTime;

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

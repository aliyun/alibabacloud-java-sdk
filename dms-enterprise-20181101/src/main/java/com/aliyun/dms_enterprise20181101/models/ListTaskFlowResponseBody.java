// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4116147E-C628-5816-8779-8EEAF8E973F4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The information about the task flows returned.</p>
     */
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
        /**
         * <p>The ID of the user who creates the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>51****</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The name of the user who creates the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>Creator_NickName</p>
         */
        @NameInMap("CreatorNickName")
        public String creatorNickName;

        /**
         * <p>The name of the task flow owner.</p>
         * 
         * <strong>example:</strong>
         * <p>Owner_NickName</p>
         */
        @NameInMap("DagOwnerNickName")
        public String dagOwnerNickName;

        /**
         * <p>The ID of the latest deployment record.</p>
         * 
         * <strong>example:</strong>
         * <p>12**</p>
         */
        @NameInMap("DeployId")
        public Long deployId;

        /**
         * <p>The ID of the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>134137****</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The status of the latest execution. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: invalid.</li>
         * <li><strong>1</strong>: scheduling disabled.</li>
         * <li><strong>2</strong>: waiting to be scheduled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LatestInstanceStatus")
        public Integer latestInstanceStatus;

        /**
         * <p>The time when the latest execution record was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-13</p>
         */
        @NameInMap("LatestInstanceTime")
        public String latestInstanceTime;

        /**
         * <p>The status of the task flow. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The task flow is invalid.</li>
         * <li><strong>1</strong>: Scheduling is disabled for the task flow.</li>
         * <li><strong>2</strong>: The task flow is waiting to be scheduled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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

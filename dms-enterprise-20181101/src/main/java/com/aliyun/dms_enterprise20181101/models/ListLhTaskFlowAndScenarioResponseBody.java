// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListLhTaskFlowAndScenarioResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The task flows in the default business scenario.</p>
     */
    @NameInMap("RawDAGList")
    public ListLhTaskFlowAndScenarioResponseBodyRawDAGList rawDAGList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>48602B78-0DDF-414C-8688-70CAB6070115</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task flows in other business scenarios.</p>
     */
    @NameInMap("ScenarioDAGList")
    public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGList scenarioDAGList;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListLhTaskFlowAndScenarioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLhTaskFlowAndScenarioResponseBody self = new ListLhTaskFlowAndScenarioResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLhTaskFlowAndScenarioResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListLhTaskFlowAndScenarioResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLhTaskFlowAndScenarioResponseBody setRawDAGList(ListLhTaskFlowAndScenarioResponseBodyRawDAGList rawDAGList) {
        this.rawDAGList = rawDAGList;
        return this;
    }
    public ListLhTaskFlowAndScenarioResponseBodyRawDAGList getRawDAGList() {
        return this.rawDAGList;
    }

    public ListLhTaskFlowAndScenarioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLhTaskFlowAndScenarioResponseBody setScenarioDAGList(ListLhTaskFlowAndScenarioResponseBodyScenarioDAGList scenarioDAGList) {
        this.scenarioDAGList = scenarioDAGList;
        return this;
    }
    public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGList getScenarioDAGList() {
        return this.scenarioDAGList;
    }

    public ListLhTaskFlowAndScenarioResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag extends TeaModel {
        /**
         * <p>Indicates whether the task flow can be modified. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The task flow can be modified.</li>
         * <li><strong>false</strong>: The task flow cannot be modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanEdit")
        public Boolean canEdit;

        /**
         * <p>The ID of the user who creates the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>51****</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The name of the user who creates the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>Creator_Name</p>
         */
        @NameInMap("CreatorNickName")
        public String creatorNickName;

        /**
         * <p>The name of the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>Dag_Name</p>
         */
        @NameInMap("DagName")
        public String dagName;

        /**
         * <p>The user ID of the task flow owner.</p>
         * 
         * <strong>example:</strong>
         * <p>51****</p>
         */
        @NameInMap("DagOwnerId")
        public String dagOwnerId;

        /**
         * <p>The name of the task flow owner.</p>
         * 
         * <strong>example:</strong>
         * <p>Owner_Name</p>
         */
        @NameInMap("DagOwnerNickName")
        public String dagOwnerNickName;

        /**
         * <p>The extended field. No meaning is specified for this field.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("DataFlowId")
        public Long dataFlowId;

        /**
         * <p>The extended field. No meaning is specified for this field.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("DemoId")
        public String demoId;

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
         * <p>Indicates whether the task flow is deleted. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: deleted</li>
         * <li><strong>false</strong>: not deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        /**
         * <p>The status of the latest execution. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: invalid</li>
         * <li><strong>1</strong>: scheduling disabled</li>
         * <li><strong>2</strong>: waiting to be scheduled</li>
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
         * <p>2022-04-14</p>
         */
        @NameInMap("LatestInstanceTime")
        public Integer latestInstanceTime;

        /**
         * <p>The ID of the business scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>2**</p>
         */
        @NameInMap("ScenarioId")
        public Long scenarioId;

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SpaceId")
        public Long spaceId;

        /**
         * <p>The status of the task flow. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: invalid</li>
         * <li><strong>1</strong>: scheduling disabled</li>
         * <li><strong>2</strong>: waiting to be scheduled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag build(java.util.Map<String, ?> map) throws Exception {
            ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag self = new ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag();
            return TeaModel.build(map, self);
        }

        public ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag setCanEdit(Boolean canEdit) {
            this.canEdit = canEdit;
            return this;
        }
        public Boolean getCanEdit() {
            return this.canEdit;
        }

        public ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag setCreatorNickName(String creatorNickName) {
            this.creatorNickName = creatorNickName;
            return this;
        }
        public String getCreatorNickName() {
            return this.creatorNickName;
        }

        public ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag setDagName(String dagName) {
            this.dagName = dagName;
            return this;
        }
        public String getDagName() {
            return this.dagName;
        }

        public ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag setDagOwnerId(String dagOwnerId) {
            this.dagOwnerId = dagOwnerId;
            return this;
        }
        public String getDagOwnerId() {
            return this.dagOwnerId;
        }

        public ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag setDagOwnerNickName(String dagOwnerNickName) {
            this.dagOwnerNickName = dagOwnerNickName;
            return this;
        }
        public String getDagOwnerNickName() {
            return this.dagOwnerNickName;
        }

        public ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag setDataFlowId(Long dataFlowId) {
            this.dataFlowId = dataFlowId;
            return this;
        }
        public Long getDataFlowId() {
            return this.dataFlowId;
        }

        public ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag setDemoId(String demoId) {
            this.demoId = demoId;
            return this;
        }
        public String getDemoId() {
            return this.demoId;
        }

        public ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag setDeployId(Long deployId) {
            this.deployId = deployId;
            return this;
        }
        public Long getDeployId() {
            return this.deployId;
        }

        public ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag setLatestInstanceStatus(Integer latestInstanceStatus) {
            this.latestInstanceStatus = latestInstanceStatus;
            return this;
        }
        public Integer getLatestInstanceStatus() {
            return this.latestInstanceStatus;
        }

        public ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag setLatestInstanceTime(Integer latestInstanceTime) {
            this.latestInstanceTime = latestInstanceTime;
            return this;
        }
        public Integer getLatestInstanceTime() {
            return this.latestInstanceTime;
        }

        public ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag setScenarioId(Long scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public Long getScenarioId() {
            return this.scenarioId;
        }

        public ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag setSpaceId(Long spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public Long getSpaceId() {
            return this.spaceId;
        }

        public ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class ListLhTaskFlowAndScenarioResponseBodyRawDAGList extends TeaModel {
        @NameInMap("Dag")
        public java.util.List<ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag> dag;

        public static ListLhTaskFlowAndScenarioResponseBodyRawDAGList build(java.util.Map<String, ?> map) throws Exception {
            ListLhTaskFlowAndScenarioResponseBodyRawDAGList self = new ListLhTaskFlowAndScenarioResponseBodyRawDAGList();
            return TeaModel.build(map, self);
        }

        public ListLhTaskFlowAndScenarioResponseBodyRawDAGList setDag(java.util.List<ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag> dag) {
            this.dag = dag;
            return this;
        }
        public java.util.List<ListLhTaskFlowAndScenarioResponseBodyRawDAGListDag> getDag() {
            return this.dag;
        }

    }

    public static class ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag extends TeaModel {
        /**
         * <p>Indicates whether the task flow can be modified. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The task flow can be modified.</li>
         * <li><strong>false</strong>: The task flow cannot be modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanEdit")
        public Boolean canEdit;

        /**
         * <p>The ID of the user who creates the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>51****</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The name of the user who creates the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>Creator_Name</p>
         */
        @NameInMap("CreatorNickName")
        public String creatorNickName;

        /**
         * <p>The name of the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>Dag_Name</p>
         */
        @NameInMap("DagName")
        public String dagName;

        /**
         * <p>The user ID of the task flow owner.</p>
         * 
         * <strong>example:</strong>
         * <p>51****</p>
         */
        @NameInMap("DagOwnerId")
        public String dagOwnerId;

        /**
         * <p>The name of the task flow owner.</p>
         * 
         * <strong>example:</strong>
         * <p>Owner_Name</p>
         */
        @NameInMap("DagOwnerNickName")
        public String dagOwnerNickName;

        /**
         * <p>The extended field. No meaning is specified for this field.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("DataFlowId")
        public Long dataFlowId;

        /**
         * <p>The extended field. No meaning is specified for this field.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("DemoId")
        public String demoId;

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
         * <p>9***</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the task flow is deleted. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: deleted</li>
         * <li><strong>false</strong>: not deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        /**
         * <p>The status of the latest execution. Valid values:</p>
         * <ul>
         * <li>0: invalid</li>
         * <li>1: scheduling disabled</li>
         * <li>2: waiting to be scheduled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LatestInstanceStatus")
        public Integer latestInstanceStatus;

        /**
         * <p>The time when the latest execution record was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-14</p>
         */
        @NameInMap("LatestInstanceTime")
        public Integer latestInstanceTime;

        /**
         * <p>The ID of the business scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>2**</p>
         */
        @NameInMap("ScenarioId")
        public Long scenarioId;

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SpaceId")
        public Long spaceId;

        /**
         * <p>The status of the task flow. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: invalid</li>
         * <li><strong>1</strong>: scheduling disabled</li>
         * <li><strong>2</strong>: waiting to be scheduled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag build(java.util.Map<String, ?> map) throws Exception {
            ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag self = new ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag();
            return TeaModel.build(map, self);
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag setCanEdit(Boolean canEdit) {
            this.canEdit = canEdit;
            return this;
        }
        public Boolean getCanEdit() {
            return this.canEdit;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag setCreatorNickName(String creatorNickName) {
            this.creatorNickName = creatorNickName;
            return this;
        }
        public String getCreatorNickName() {
            return this.creatorNickName;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag setDagName(String dagName) {
            this.dagName = dagName;
            return this;
        }
        public String getDagName() {
            return this.dagName;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag setDagOwnerId(String dagOwnerId) {
            this.dagOwnerId = dagOwnerId;
            return this;
        }
        public String getDagOwnerId() {
            return this.dagOwnerId;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag setDagOwnerNickName(String dagOwnerNickName) {
            this.dagOwnerNickName = dagOwnerNickName;
            return this;
        }
        public String getDagOwnerNickName() {
            return this.dagOwnerNickName;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag setDataFlowId(Long dataFlowId) {
            this.dataFlowId = dataFlowId;
            return this;
        }
        public Long getDataFlowId() {
            return this.dataFlowId;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag setDemoId(String demoId) {
            this.demoId = demoId;
            return this;
        }
        public String getDemoId() {
            return this.demoId;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag setDeployId(Long deployId) {
            this.deployId = deployId;
            return this;
        }
        public Long getDeployId() {
            return this.deployId;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag setLatestInstanceStatus(Integer latestInstanceStatus) {
            this.latestInstanceStatus = latestInstanceStatus;
            return this;
        }
        public Integer getLatestInstanceStatus() {
            return this.latestInstanceStatus;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag setLatestInstanceTime(Integer latestInstanceTime) {
            this.latestInstanceTime = latestInstanceTime;
            return this;
        }
        public Integer getLatestInstanceTime() {
            return this.latestInstanceTime;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag setScenarioId(Long scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public Long getScenarioId() {
            return this.scenarioId;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag setSpaceId(Long spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public Long getSpaceId() {
            return this.spaceId;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagList extends TeaModel {
        @NameInMap("Dag")
        public java.util.List<ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag> dag;

        public static ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagList build(java.util.Map<String, ?> map) throws Exception {
            ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagList self = new ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagList();
            return TeaModel.build(map, self);
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagList setDag(java.util.List<ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag> dag) {
            this.dag = dag;
            return this;
        }
        public java.util.List<ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagListDag> getDag() {
            return this.dag;
        }

    }

    public static class ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGScenario extends TeaModel {
        /**
         * <p>The ID of the user who creates the business scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>51****</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The description of the business scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the business scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>Scenario_2</p>
         */
        @NameInMap("ScenarioName")
        public String scenarioName;

        public static ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGScenario build(java.util.Map<String, ?> map) throws Exception {
            ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGScenario self = new ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGScenario();
            return TeaModel.build(map, self);
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGScenario setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGScenario setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGScenario setScenarioName(String scenarioName) {
            this.scenarioName = scenarioName;
            return this;
        }
        public String getScenarioName() {
            return this.scenarioName;
        }

    }

    public static class ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAG extends TeaModel {
        /**
         * <p>The list of task flows.</p>
         */
        @NameInMap("DagList")
        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagList dagList;

        /**
         * <p>The information about the business scenario.</p>
         */
        @NameInMap("Scenario")
        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGScenario scenario;

        public static ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAG build(java.util.Map<String, ?> map) throws Exception {
            ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAG self = new ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAG();
            return TeaModel.build(map, self);
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAG setDagList(ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagList dagList) {
            this.dagList = dagList;
            return this;
        }
        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGDagList getDagList() {
            return this.dagList;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAG setScenario(ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGScenario scenario) {
            this.scenario = scenario;
            return this;
        }
        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAGScenario getScenario() {
            return this.scenario;
        }

    }

    public static class ListLhTaskFlowAndScenarioResponseBodyScenarioDAGList extends TeaModel {
        @NameInMap("ScenarioDAG")
        public java.util.List<ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAG> scenarioDAG;

        public static ListLhTaskFlowAndScenarioResponseBodyScenarioDAGList build(java.util.Map<String, ?> map) throws Exception {
            ListLhTaskFlowAndScenarioResponseBodyScenarioDAGList self = new ListLhTaskFlowAndScenarioResponseBodyScenarioDAGList();
            return TeaModel.build(map, self);
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGList setScenarioDAG(java.util.List<ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAG> scenarioDAG) {
            this.scenarioDAG = scenarioDAG;
            return this;
        }
        public java.util.List<ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenarioDAG> getScenarioDAG() {
            return this.scenarioDAG;
        }

    }

}

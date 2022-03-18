// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListLhTaskFlowAndScenarioResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RawDAGList")
    public ListLhTaskFlowAndScenarioResponseBodyRawDAGList rawDAGList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScenarioDAGList")
    public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGList scenarioDAGList;

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
        @NameInMap("CanEdit")
        public Boolean canEdit;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("CreatorNickName")
        public String creatorNickName;

        @NameInMap("DagOwnerNickName")
        public String dagOwnerNickName;

        @NameInMap("DataFlowId")
        public Long dataFlowId;

        @NameInMap("DemoId")
        public String demoId;

        @NameInMap("DeployId")
        public Long deployId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        @NameInMap("LatestInstanceStatus")
        public Integer latestInstanceStatus;

        @NameInMap("LatestInstanceTime")
        public Integer latestInstanceTime;

        @NameInMap("ScenarioId")
        public Long scenarioId;

        @NameInMap("SpaceId")
        public Long spaceId;

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
        @NameInMap("dag")
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

    public static class ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagListDag extends TeaModel {
        @NameInMap("CanEdit")
        public Boolean canEdit;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("CreatorNickName")
        public String creatorNickName;

        @NameInMap("DagOwnerNickName")
        public String dagOwnerNickName;

        @NameInMap("DataFlowId")
        public Long dataFlowId;

        @NameInMap("DemoId")
        public String demoId;

        @NameInMap("DeployId")
        public Long deployId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        @NameInMap("LatestInstanceStatus")
        public Integer latestInstanceStatus;

        @NameInMap("LatestInstanceTime")
        public Integer latestInstanceTime;

        @NameInMap("ScenarioId")
        public Long scenarioId;

        @NameInMap("SpaceId")
        public Long spaceId;

        @NameInMap("Status")
        public Integer status;

        public static ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagListDag build(java.util.Map<String, ?> map) throws Exception {
            ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagListDag self = new ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagListDag();
            return TeaModel.build(map, self);
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagListDag setCanEdit(Boolean canEdit) {
            this.canEdit = canEdit;
            return this;
        }
        public Boolean getCanEdit() {
            return this.canEdit;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagListDag setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagListDag setCreatorNickName(String creatorNickName) {
            this.creatorNickName = creatorNickName;
            return this;
        }
        public String getCreatorNickName() {
            return this.creatorNickName;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagListDag setDagOwnerNickName(String dagOwnerNickName) {
            this.dagOwnerNickName = dagOwnerNickName;
            return this;
        }
        public String getDagOwnerNickName() {
            return this.dagOwnerNickName;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagListDag setDataFlowId(Long dataFlowId) {
            this.dataFlowId = dataFlowId;
            return this;
        }
        public Long getDataFlowId() {
            return this.dataFlowId;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagListDag setDemoId(String demoId) {
            this.demoId = demoId;
            return this;
        }
        public String getDemoId() {
            return this.demoId;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagListDag setDeployId(Long deployId) {
            this.deployId = deployId;
            return this;
        }
        public Long getDeployId() {
            return this.deployId;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagListDag setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagListDag setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagListDag setLatestInstanceStatus(Integer latestInstanceStatus) {
            this.latestInstanceStatus = latestInstanceStatus;
            return this;
        }
        public Integer getLatestInstanceStatus() {
            return this.latestInstanceStatus;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagListDag setLatestInstanceTime(Integer latestInstanceTime) {
            this.latestInstanceTime = latestInstanceTime;
            return this;
        }
        public Integer getLatestInstanceTime() {
            return this.latestInstanceTime;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagListDag setScenarioId(Long scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public Long getScenarioId() {
            return this.scenarioId;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagListDag setSpaceId(Long spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public Long getSpaceId() {
            return this.spaceId;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagListDag setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagList extends TeaModel {
        @NameInMap("dag")
        public java.util.List<ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagListDag> dag;

        public static ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagList build(java.util.Map<String, ?> map) throws Exception {
            ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagList self = new ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagList();
            return TeaModel.build(map, self);
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagList setDag(java.util.List<ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagListDag> dag) {
            this.dag = dag;
            return this;
        }
        public java.util.List<ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagListDag> getDag() {
            return this.dag;
        }

    }

    public static class ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenario extends TeaModel {
        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("Description")
        public String description;

        @NameInMap("ScenarioName")
        public String scenarioName;

        public static ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenario build(java.util.Map<String, ?> map) throws Exception {
            ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenario self = new ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenario();
            return TeaModel.build(map, self);
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenario setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenario setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenario setScenarioName(String scenarioName) {
            this.scenarioName = scenarioName;
            return this;
        }
        public String getScenarioName() {
            return this.scenarioName;
        }

    }

    public static class ListLhTaskFlowAndScenarioResponseBodyScenarioDAGList extends TeaModel {
        @NameInMap("DagList")
        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagList dagList;

        @NameInMap("Scenario")
        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenario scenario;

        public static ListLhTaskFlowAndScenarioResponseBodyScenarioDAGList build(java.util.Map<String, ?> map) throws Exception {
            ListLhTaskFlowAndScenarioResponseBodyScenarioDAGList self = new ListLhTaskFlowAndScenarioResponseBodyScenarioDAGList();
            return TeaModel.build(map, self);
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGList setDagList(ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagList dagList) {
            this.dagList = dagList;
            return this;
        }
        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListDagList getDagList() {
            return this.dagList;
        }

        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGList setScenario(ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenario scenario) {
            this.scenario = scenario;
            return this;
        }
        public ListLhTaskFlowAndScenarioResponseBodyScenarioDAGListScenario getScenario() {
            return this.scenario;
        }

    }

}

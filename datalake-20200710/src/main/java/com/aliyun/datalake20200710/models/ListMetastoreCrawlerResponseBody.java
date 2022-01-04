// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListMetastoreCrawlerResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListMetastoreCrawlerResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListMetastoreCrawlerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetastoreCrawlerResponseBody self = new ListMetastoreCrawlerResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetastoreCrawlerResponseBody setData(java.util.List<ListMetastoreCrawlerResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMetastoreCrawlerResponseBodyData> getData() {
        return this.data;
    }

    public ListMetastoreCrawlerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetastoreCrawlerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMetastoreCrawlerResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListMetastoreCrawlerResponseBodyDataWorkflowLastRunInstance extends TeaModel {
        @NameInMap("BatchProgress")
        public Integer batchProgress;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("FailureInfo")
        public String failureInfo;

        @NameInMap("FlowExtendResult")
        public String flowExtendResult;

        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("FlowInstanceId")
        public String flowInstanceId;

        @NameInMap("FlowName")
        public String flowName;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        public static ListMetastoreCrawlerResponseBodyDataWorkflowLastRunInstance build(java.util.Map<String, ?> map) throws Exception {
            ListMetastoreCrawlerResponseBodyDataWorkflowLastRunInstance self = new ListMetastoreCrawlerResponseBodyDataWorkflowLastRunInstance();
            return TeaModel.build(map, self);
        }

        public ListMetastoreCrawlerResponseBodyDataWorkflowLastRunInstance setBatchProgress(Integer batchProgress) {
            this.batchProgress = batchProgress;
            return this;
        }
        public Integer getBatchProgress() {
            return this.batchProgress;
        }

        public ListMetastoreCrawlerResponseBodyDataWorkflowLastRunInstance setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListMetastoreCrawlerResponseBodyDataWorkflowLastRunInstance setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListMetastoreCrawlerResponseBodyDataWorkflowLastRunInstance setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListMetastoreCrawlerResponseBodyDataWorkflowLastRunInstance setFailureInfo(String failureInfo) {
            this.failureInfo = failureInfo;
            return this;
        }
        public String getFailureInfo() {
            return this.failureInfo;
        }

        public ListMetastoreCrawlerResponseBodyDataWorkflowLastRunInstance setFlowExtendResult(String flowExtendResult) {
            this.flowExtendResult = flowExtendResult;
            return this;
        }
        public String getFlowExtendResult() {
            return this.flowExtendResult;
        }

        public ListMetastoreCrawlerResponseBodyDataWorkflowLastRunInstance setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListMetastoreCrawlerResponseBodyDataWorkflowLastRunInstance setFlowInstanceId(String flowInstanceId) {
            this.flowInstanceId = flowInstanceId;
            return this;
        }
        public String getFlowInstanceId() {
            return this.flowInstanceId;
        }

        public ListMetastoreCrawlerResponseBodyDataWorkflowLastRunInstance setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public ListMetastoreCrawlerResponseBodyDataWorkflowLastRunInstance setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListMetastoreCrawlerResponseBodyDataWorkflowLastRunInstance setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListMetastoreCrawlerResponseBodyDataWorkflowLastRunInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListMetastoreCrawlerResponseBodyData extends TeaModel {
        @NameInMap("Creator")
        public String creator;

        @NameInMap("CreatorLoginName")
        public String creatorLoginName;

        @NameInMap("DatasourceExcludePath")
        public String datasourceExcludePath;

        @NameInMap("DatasourcePath")
        public String datasourcePath;

        @NameInMap("DatasourceType")
        public String datasourceType;

        @NameInMap("ExecuteMode")
        public String executeMode;

        @NameInMap("ExecuteType")
        public String executeType;

        @NameInMap("FileFormat")
        public String fileFormat;

        @NameInMap("FileFormatConfig")
        public String fileFormatConfig;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("Status")
        public String status;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TargetDatabase")
        public String targetDatabase;

        @NameInMap("TargetTablePrefix")
        public String targetTablePrefix;

        @NameInMap("TargetUpdateStrategy")
        public String targetUpdateStrategy;

        @NameInMap("WorkflowLastRunInstance")
        public ListMetastoreCrawlerResponseBodyDataWorkflowLastRunInstance workflowLastRunInstance;

        public static ListMetastoreCrawlerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMetastoreCrawlerResponseBodyData self = new ListMetastoreCrawlerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMetastoreCrawlerResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListMetastoreCrawlerResponseBodyData setCreatorLoginName(String creatorLoginName) {
            this.creatorLoginName = creatorLoginName;
            return this;
        }
        public String getCreatorLoginName() {
            return this.creatorLoginName;
        }

        public ListMetastoreCrawlerResponseBodyData setDatasourceExcludePath(String datasourceExcludePath) {
            this.datasourceExcludePath = datasourceExcludePath;
            return this;
        }
        public String getDatasourceExcludePath() {
            return this.datasourceExcludePath;
        }

        public ListMetastoreCrawlerResponseBodyData setDatasourcePath(String datasourcePath) {
            this.datasourcePath = datasourcePath;
            return this;
        }
        public String getDatasourcePath() {
            return this.datasourcePath;
        }

        public ListMetastoreCrawlerResponseBodyData setDatasourceType(String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public String getDatasourceType() {
            return this.datasourceType;
        }

        public ListMetastoreCrawlerResponseBodyData setExecuteMode(String executeMode) {
            this.executeMode = executeMode;
            return this;
        }
        public String getExecuteMode() {
            return this.executeMode;
        }

        public ListMetastoreCrawlerResponseBodyData setExecuteType(String executeType) {
            this.executeType = executeType;
            return this;
        }
        public String getExecuteType() {
            return this.executeType;
        }

        public ListMetastoreCrawlerResponseBodyData setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public ListMetastoreCrawlerResponseBodyData setFileFormatConfig(String fileFormatConfig) {
            this.fileFormatConfig = fileFormatConfig;
            return this;
        }
        public String getFileFormatConfig() {
            return this.fileFormatConfig;
        }

        public ListMetastoreCrawlerResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMetastoreCrawlerResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMetastoreCrawlerResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMetastoreCrawlerResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMetastoreCrawlerResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListMetastoreCrawlerResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListMetastoreCrawlerResponseBodyData setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListMetastoreCrawlerResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMetastoreCrawlerResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListMetastoreCrawlerResponseBodyData setTargetDatabase(String targetDatabase) {
            this.targetDatabase = targetDatabase;
            return this;
        }
        public String getTargetDatabase() {
            return this.targetDatabase;
        }

        public ListMetastoreCrawlerResponseBodyData setTargetTablePrefix(String targetTablePrefix) {
            this.targetTablePrefix = targetTablePrefix;
            return this;
        }
        public String getTargetTablePrefix() {
            return this.targetTablePrefix;
        }

        public ListMetastoreCrawlerResponseBodyData setTargetUpdateStrategy(String targetUpdateStrategy) {
            this.targetUpdateStrategy = targetUpdateStrategy;
            return this;
        }
        public String getTargetUpdateStrategy() {
            return this.targetUpdateStrategy;
        }

        public ListMetastoreCrawlerResponseBodyData setWorkflowLastRunInstance(ListMetastoreCrawlerResponseBodyDataWorkflowLastRunInstance workflowLastRunInstance) {
            this.workflowLastRunInstance = workflowLastRunInstance;
            return this;
        }
        public ListMetastoreCrawlerResponseBodyDataWorkflowLastRunInstance getWorkflowLastRunInstance() {
            return this.workflowLastRunInstance;
        }

    }

}

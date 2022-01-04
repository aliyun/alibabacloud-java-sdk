// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListCrawlerWorkflowInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListCrawlerWorkflowInstanceResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCrawlerWorkflowInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCrawlerWorkflowInstanceResponseBody self = new ListCrawlerWorkflowInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCrawlerWorkflowInstanceResponseBody setData(java.util.List<ListCrawlerWorkflowInstanceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCrawlerWorkflowInstanceResponseBodyData> getData() {
        return this.data;
    }

    public ListCrawlerWorkflowInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCrawlerWorkflowInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListCrawlerWorkflowInstanceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCrawlerWorkflowInstanceResponseBodyData extends TeaModel {
        @NameInMap("BatchProgress")
        public Integer batchProgress;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("CrawlerId")
        public String crawlerId;

        @NameInMap("CrawlerIsDelete")
        public Boolean crawlerIsDelete;

        @NameInMap("Creator")
        public Long creator;

        @NameInMap("DatasourceExcludePath")
        public String datasourceExcludePath;

        @NameInMap("DatasourcePath")
        public String datasourcePath;

        @NameInMap("DatasourceType")
        public String datasourceType;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("ExecuteCron")
        public String executeCron;

        @NameInMap("ExecuteMode")
        public String executeMode;

        @NameInMap("ExecuteType")
        public String executeType;

        @NameInMap("FailureInfo")
        public String failureInfo;

        @NameInMap("FileFormat")
        public String fileFormat;

        @NameInMap("FileFormatConfig")
        public String fileFormatConfig;

        @NameInMap("FlowExtendResult")
        public String flowExtendResult;

        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("FlowInstanceId")
        public String flowInstanceId;

        @NameInMap("FlowName")
        public String flowName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public Long owner;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TargetDatabase")
        public String targetDatabase;

        @NameInMap("TargetTablePrefix")
        public String targetTablePrefix;

        @NameInMap("TargetUpdateStrategy")
        public String targetUpdateStrategy;

        public static ListCrawlerWorkflowInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCrawlerWorkflowInstanceResponseBodyData self = new ListCrawlerWorkflowInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setBatchProgress(Integer batchProgress) {
            this.batchProgress = batchProgress;
            return this;
        }
        public Integer getBatchProgress() {
            return this.batchProgress;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setCrawlerId(String crawlerId) {
            this.crawlerId = crawlerId;
            return this;
        }
        public String getCrawlerId() {
            return this.crawlerId;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setCrawlerIsDelete(Boolean crawlerIsDelete) {
            this.crawlerIsDelete = crawlerIsDelete;
            return this;
        }
        public Boolean getCrawlerIsDelete() {
            return this.crawlerIsDelete;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setCreator(Long creator) {
            this.creator = creator;
            return this;
        }
        public Long getCreator() {
            return this.creator;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setDatasourceExcludePath(String datasourceExcludePath) {
            this.datasourceExcludePath = datasourceExcludePath;
            return this;
        }
        public String getDatasourceExcludePath() {
            return this.datasourceExcludePath;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setDatasourcePath(String datasourcePath) {
            this.datasourcePath = datasourcePath;
            return this;
        }
        public String getDatasourcePath() {
            return this.datasourcePath;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setDatasourceType(String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public String getDatasourceType() {
            return this.datasourceType;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setExecuteCron(String executeCron) {
            this.executeCron = executeCron;
            return this;
        }
        public String getExecuteCron() {
            return this.executeCron;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setExecuteMode(String executeMode) {
            this.executeMode = executeMode;
            return this;
        }
        public String getExecuteMode() {
            return this.executeMode;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setExecuteType(String executeType) {
            this.executeType = executeType;
            return this;
        }
        public String getExecuteType() {
            return this.executeType;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setFailureInfo(String failureInfo) {
            this.failureInfo = failureInfo;
            return this;
        }
        public String getFailureInfo() {
            return this.failureInfo;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setFileFormatConfig(String fileFormatConfig) {
            this.fileFormatConfig = fileFormatConfig;
            return this;
        }
        public String getFileFormatConfig() {
            return this.fileFormatConfig;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setFlowExtendResult(String flowExtendResult) {
            this.flowExtendResult = flowExtendResult;
            return this;
        }
        public String getFlowExtendResult() {
            return this.flowExtendResult;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setFlowInstanceId(String flowInstanceId) {
            this.flowInstanceId = flowInstanceId;
            return this;
        }
        public String getFlowInstanceId() {
            return this.flowInstanceId;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setOwner(Long owner) {
            this.owner = owner;
            return this;
        }
        public Long getOwner() {
            return this.owner;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setTargetDatabase(String targetDatabase) {
            this.targetDatabase = targetDatabase;
            return this;
        }
        public String getTargetDatabase() {
            return this.targetDatabase;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setTargetTablePrefix(String targetTablePrefix) {
            this.targetTablePrefix = targetTablePrefix;
            return this;
        }
        public String getTargetTablePrefix() {
            return this.targetTablePrefix;
        }

        public ListCrawlerWorkflowInstanceResponseBodyData setTargetUpdateStrategy(String targetUpdateStrategy) {
            this.targetUpdateStrategy = targetUpdateStrategy;
            return this;
        }
        public String getTargetUpdateStrategy() {
            return this.targetUpdateStrategy;
        }

    }

}

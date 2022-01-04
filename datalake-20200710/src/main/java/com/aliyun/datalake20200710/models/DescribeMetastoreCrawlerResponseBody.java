// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DescribeMetastoreCrawlerResponseBody extends TeaModel {
    @NameInMap("Creator")
    public Long creator;

    @NameInMap("DatasourceExcludePath")
    public String datasourceExcludePath;

    @NameInMap("DatasourcePath")
    public String datasourcePath;

    @NameInMap("DatasourceType")
    public String datasourceType;

    @NameInMap("ExecuteCron")
    public String executeCron;

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
    public Long owner;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

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
    public DescribeMetastoreCrawlerResponseBodyWorkflowLastRunInstance workflowLastRunInstance;

    public static DescribeMetastoreCrawlerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetastoreCrawlerResponseBody self = new DescribeMetastoreCrawlerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetastoreCrawlerResponseBody setCreator(Long creator) {
        this.creator = creator;
        return this;
    }
    public Long getCreator() {
        return this.creator;
    }

    public DescribeMetastoreCrawlerResponseBody setDatasourceExcludePath(String datasourceExcludePath) {
        this.datasourceExcludePath = datasourceExcludePath;
        return this;
    }
    public String getDatasourceExcludePath() {
        return this.datasourceExcludePath;
    }

    public DescribeMetastoreCrawlerResponseBody setDatasourcePath(String datasourcePath) {
        this.datasourcePath = datasourcePath;
        return this;
    }
    public String getDatasourcePath() {
        return this.datasourcePath;
    }

    public DescribeMetastoreCrawlerResponseBody setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
    }

    public DescribeMetastoreCrawlerResponseBody setExecuteCron(String executeCron) {
        this.executeCron = executeCron;
        return this;
    }
    public String getExecuteCron() {
        return this.executeCron;
    }

    public DescribeMetastoreCrawlerResponseBody setExecuteMode(String executeMode) {
        this.executeMode = executeMode;
        return this;
    }
    public String getExecuteMode() {
        return this.executeMode;
    }

    public DescribeMetastoreCrawlerResponseBody setExecuteType(String executeType) {
        this.executeType = executeType;
        return this;
    }
    public String getExecuteType() {
        return this.executeType;
    }

    public DescribeMetastoreCrawlerResponseBody setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }
    public String getFileFormat() {
        return this.fileFormat;
    }

    public DescribeMetastoreCrawlerResponseBody setFileFormatConfig(String fileFormatConfig) {
        this.fileFormatConfig = fileFormatConfig;
        return this;
    }
    public String getFileFormatConfig() {
        return this.fileFormatConfig;
    }

    public DescribeMetastoreCrawlerResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribeMetastoreCrawlerResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DescribeMetastoreCrawlerResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeMetastoreCrawlerResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeMetastoreCrawlerResponseBody setOwner(Long owner) {
        this.owner = owner;
        return this;
    }
    public Long getOwner() {
        return this.owner;
    }

    public DescribeMetastoreCrawlerResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMetastoreCrawlerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMetastoreCrawlerResponseBody setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public DescribeMetastoreCrawlerResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeMetastoreCrawlerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeMetastoreCrawlerResponseBody setTargetDatabase(String targetDatabase) {
        this.targetDatabase = targetDatabase;
        return this;
    }
    public String getTargetDatabase() {
        return this.targetDatabase;
    }

    public DescribeMetastoreCrawlerResponseBody setTargetTablePrefix(String targetTablePrefix) {
        this.targetTablePrefix = targetTablePrefix;
        return this;
    }
    public String getTargetTablePrefix() {
        return this.targetTablePrefix;
    }

    public DescribeMetastoreCrawlerResponseBody setTargetUpdateStrategy(String targetUpdateStrategy) {
        this.targetUpdateStrategy = targetUpdateStrategy;
        return this;
    }
    public String getTargetUpdateStrategy() {
        return this.targetUpdateStrategy;
    }

    public DescribeMetastoreCrawlerResponseBody setWorkflowLastRunInstance(DescribeMetastoreCrawlerResponseBodyWorkflowLastRunInstance workflowLastRunInstance) {
        this.workflowLastRunInstance = workflowLastRunInstance;
        return this;
    }
    public DescribeMetastoreCrawlerResponseBodyWorkflowLastRunInstance getWorkflowLastRunInstance() {
        return this.workflowLastRunInstance;
    }

    public static class DescribeMetastoreCrawlerResponseBodyWorkflowLastRunInstance extends TeaModel {
        @NameInMap("BatchProgress")
        public Integer batchProgress;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Duration")
        public Long duration;

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

        public static DescribeMetastoreCrawlerResponseBodyWorkflowLastRunInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetastoreCrawlerResponseBodyWorkflowLastRunInstance self = new DescribeMetastoreCrawlerResponseBodyWorkflowLastRunInstance();
            return TeaModel.build(map, self);
        }

        public DescribeMetastoreCrawlerResponseBodyWorkflowLastRunInstance setBatchProgress(Integer batchProgress) {
            this.batchProgress = batchProgress;
            return this;
        }
        public Integer getBatchProgress() {
            return this.batchProgress;
        }

        public DescribeMetastoreCrawlerResponseBodyWorkflowLastRunInstance setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeMetastoreCrawlerResponseBodyWorkflowLastRunInstance setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeMetastoreCrawlerResponseBodyWorkflowLastRunInstance setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeMetastoreCrawlerResponseBodyWorkflowLastRunInstance setFailureInfo(String failureInfo) {
            this.failureInfo = failureInfo;
            return this;
        }
        public String getFailureInfo() {
            return this.failureInfo;
        }

        public DescribeMetastoreCrawlerResponseBodyWorkflowLastRunInstance setFlowExtendResult(String flowExtendResult) {
            this.flowExtendResult = flowExtendResult;
            return this;
        }
        public String getFlowExtendResult() {
            return this.flowExtendResult;
        }

        public DescribeMetastoreCrawlerResponseBodyWorkflowLastRunInstance setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public DescribeMetastoreCrawlerResponseBodyWorkflowLastRunInstance setFlowInstanceId(String flowInstanceId) {
            this.flowInstanceId = flowInstanceId;
            return this;
        }
        public String getFlowInstanceId() {
            return this.flowInstanceId;
        }

        public DescribeMetastoreCrawlerResponseBodyWorkflowLastRunInstance setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public DescribeMetastoreCrawlerResponseBodyWorkflowLastRunInstance setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeMetastoreCrawlerResponseBodyWorkflowLastRunInstance setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeMetastoreCrawlerResponseBodyWorkflowLastRunInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

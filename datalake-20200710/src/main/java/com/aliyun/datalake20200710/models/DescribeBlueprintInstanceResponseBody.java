// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DescribeBlueprintInstanceResponseBody extends TeaModel {
    @NameInMap("BlueprintInstance")
    public DescribeBlueprintInstanceResponseBodyBlueprintInstance blueprintInstance;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DescribeBlueprintInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlueprintInstanceResponseBody self = new DescribeBlueprintInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBlueprintInstanceResponseBody setBlueprintInstance(DescribeBlueprintInstanceResponseBodyBlueprintInstance blueprintInstance) {
        this.blueprintInstance = blueprintInstance;
        return this;
    }
    public DescribeBlueprintInstanceResponseBodyBlueprintInstance getBlueprintInstance() {
        return this.blueprintInstance;
    }

    public DescribeBlueprintInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBlueprintInstanceResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeBlueprintInstanceResponseBodyBlueprintInstanceLastRunFlowInstance extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("FlowInstanceId")
        public String flowInstanceId;

        @NameInMap("FlowName")
        public String flowName;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        public static DescribeBlueprintInstanceResponseBodyBlueprintInstanceLastRunFlowInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlueprintInstanceResponseBodyBlueprintInstanceLastRunFlowInstance self = new DescribeBlueprintInstanceResponseBodyBlueprintInstanceLastRunFlowInstance();
            return TeaModel.build(map, self);
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstanceLastRunFlowInstance setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstanceLastRunFlowInstance setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstanceLastRunFlowInstance setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstanceLastRunFlowInstance setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstanceLastRunFlowInstance setFlowInstanceId(String flowInstanceId) {
            this.flowInstanceId = flowInstanceId;
            return this;
        }
        public String getFlowInstanceId() {
            return this.flowInstanceId;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstanceLastRunFlowInstance setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstanceLastRunFlowInstance setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstanceLastRunFlowInstance setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstanceLastRunFlowInstance setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstanceLastRunFlowInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeBlueprintInstanceResponseBodyBlueprintInstance extends TeaModel {
        @NameInMap("BlueprintInstanceId")
        public String blueprintInstanceId;

        @NameInMap("BlueprintType")
        public String blueprintType;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DataSourceConfig")
        public String dataSourceConfig;

        @NameInMap("EmrFlowId")
        public String emrFlowId;

        @NameInMap("EmrFlowProjectId")
        public String emrFlowProjectId;

        @NameInMap("EmrFlowScheduleStatus")
        public String emrFlowScheduleStatus;

        @NameInMap("ExecuteCapacity")
        public Long executeCapacity;

        @NameInMap("ExecuteParameters")
        public String executeParameters;

        @NameInMap("ExecuteType")
        public String executeType;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("LastRunFlowInstance")
        public DescribeBlueprintInstanceResponseBodyBlueprintInstanceLastRunFlowInstance lastRunFlowInstance;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("PreProcessingConfig")
        public String preProcessingConfig;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RoleName")
        public Long roleName;

        @NameInMap("SourceChannelId")
        public String sourceChannelId;

        @NameInMap("SourceChannelName")
        public String sourceChannelName;

        @NameInMap("SourceChannelType")
        public String sourceChannelType;

        @NameInMap("SourceDataSourceId")
        public String sourceDataSourceId;

        @NameInMap("SourceDataSourceName")
        public String sourceDataSourceName;

        @NameInMap("SourceFormat")
        public String sourceFormat;

        @NameInMap("SourceInclude")
        public String sourceInclude;

        @NameInMap("SourceLocationUri")
        public String sourceLocationUri;

        @NameInMap("SourcePrimaryColumn")
        public String sourcePrimaryColumn;

        @NameInMap("SourceSchema")
        public String sourceSchema;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TargetDatabase")
        public String targetDatabase;

        @NameInMap("TargetFormat")
        public String targetFormat;

        @NameInMap("TargetLocationUri")
        public String targetLocationUri;

        @NameInMap("TargetTablePrefix")
        public String targetTablePrefix;

        public static DescribeBlueprintInstanceResponseBodyBlueprintInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlueprintInstanceResponseBodyBlueprintInstance self = new DescribeBlueprintInstanceResponseBodyBlueprintInstance();
            return TeaModel.build(map, self);
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setBlueprintInstanceId(String blueprintInstanceId) {
            this.blueprintInstanceId = blueprintInstanceId;
            return this;
        }
        public String getBlueprintInstanceId() {
            return this.blueprintInstanceId;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setBlueprintType(String blueprintType) {
            this.blueprintType = blueprintType;
            return this;
        }
        public String getBlueprintType() {
            return this.blueprintType;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setDataSourceConfig(String dataSourceConfig) {
            this.dataSourceConfig = dataSourceConfig;
            return this;
        }
        public String getDataSourceConfig() {
            return this.dataSourceConfig;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setEmrFlowId(String emrFlowId) {
            this.emrFlowId = emrFlowId;
            return this;
        }
        public String getEmrFlowId() {
            return this.emrFlowId;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setEmrFlowProjectId(String emrFlowProjectId) {
            this.emrFlowProjectId = emrFlowProjectId;
            return this;
        }
        public String getEmrFlowProjectId() {
            return this.emrFlowProjectId;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setEmrFlowScheduleStatus(String emrFlowScheduleStatus) {
            this.emrFlowScheduleStatus = emrFlowScheduleStatus;
            return this;
        }
        public String getEmrFlowScheduleStatus() {
            return this.emrFlowScheduleStatus;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setExecuteCapacity(Long executeCapacity) {
            this.executeCapacity = executeCapacity;
            return this;
        }
        public Long getExecuteCapacity() {
            return this.executeCapacity;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setExecuteParameters(String executeParameters) {
            this.executeParameters = executeParameters;
            return this;
        }
        public String getExecuteParameters() {
            return this.executeParameters;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setExecuteType(String executeType) {
            this.executeType = executeType;
            return this;
        }
        public String getExecuteType() {
            return this.executeType;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setLastRunFlowInstance(DescribeBlueprintInstanceResponseBodyBlueprintInstanceLastRunFlowInstance lastRunFlowInstance) {
            this.lastRunFlowInstance = lastRunFlowInstance;
            return this;
        }
        public DescribeBlueprintInstanceResponseBodyBlueprintInstanceLastRunFlowInstance getLastRunFlowInstance() {
            return this.lastRunFlowInstance;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setPreProcessingConfig(String preProcessingConfig) {
            this.preProcessingConfig = preProcessingConfig;
            return this;
        }
        public String getPreProcessingConfig() {
            return this.preProcessingConfig;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setRoleName(Long roleName) {
            this.roleName = roleName;
            return this;
        }
        public Long getRoleName() {
            return this.roleName;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setSourceChannelId(String sourceChannelId) {
            this.sourceChannelId = sourceChannelId;
            return this;
        }
        public String getSourceChannelId() {
            return this.sourceChannelId;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setSourceChannelName(String sourceChannelName) {
            this.sourceChannelName = sourceChannelName;
            return this;
        }
        public String getSourceChannelName() {
            return this.sourceChannelName;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setSourceChannelType(String sourceChannelType) {
            this.sourceChannelType = sourceChannelType;
            return this;
        }
        public String getSourceChannelType() {
            return this.sourceChannelType;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setSourceDataSourceId(String sourceDataSourceId) {
            this.sourceDataSourceId = sourceDataSourceId;
            return this;
        }
        public String getSourceDataSourceId() {
            return this.sourceDataSourceId;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setSourceDataSourceName(String sourceDataSourceName) {
            this.sourceDataSourceName = sourceDataSourceName;
            return this;
        }
        public String getSourceDataSourceName() {
            return this.sourceDataSourceName;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setSourceFormat(String sourceFormat) {
            this.sourceFormat = sourceFormat;
            return this;
        }
        public String getSourceFormat() {
            return this.sourceFormat;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setSourceInclude(String sourceInclude) {
            this.sourceInclude = sourceInclude;
            return this;
        }
        public String getSourceInclude() {
            return this.sourceInclude;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setSourceLocationUri(String sourceLocationUri) {
            this.sourceLocationUri = sourceLocationUri;
            return this;
        }
        public String getSourceLocationUri() {
            return this.sourceLocationUri;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setSourcePrimaryColumn(String sourcePrimaryColumn) {
            this.sourcePrimaryColumn = sourcePrimaryColumn;
            return this;
        }
        public String getSourcePrimaryColumn() {
            return this.sourcePrimaryColumn;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setSourceSchema(String sourceSchema) {
            this.sourceSchema = sourceSchema;
            return this;
        }
        public String getSourceSchema() {
            return this.sourceSchema;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setTargetDatabase(String targetDatabase) {
            this.targetDatabase = targetDatabase;
            return this;
        }
        public String getTargetDatabase() {
            return this.targetDatabase;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setTargetFormat(String targetFormat) {
            this.targetFormat = targetFormat;
            return this;
        }
        public String getTargetFormat() {
            return this.targetFormat;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setTargetLocationUri(String targetLocationUri) {
            this.targetLocationUri = targetLocationUri;
            return this;
        }
        public String getTargetLocationUri() {
            return this.targetLocationUri;
        }

        public DescribeBlueprintInstanceResponseBodyBlueprintInstance setTargetTablePrefix(String targetTablePrefix) {
            this.targetTablePrefix = targetTablePrefix;
            return this;
        }
        public String getTargetTablePrefix() {
            return this.targetTablePrefix;
        }

    }

}

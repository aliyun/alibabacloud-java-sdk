// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetPipelineInstHistoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Data")
    public GetPipelineInstHistoryResponseBodyData data;

    public static GetPipelineInstHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineInstHistoryResponseBody self = new GetPipelineInstHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineInstHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPipelineInstHistoryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPipelineInstHistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPipelineInstHistoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPipelineInstHistoryResponseBody setData(GetPipelineInstHistoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPipelineInstHistoryResponseBodyData getData() {
        return this.data;
    }

    public static class GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceGroups extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DeleteStatus")
        public String deleteStatus;

        @NameInMap("IdExtent")
        public Integer idExtent;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("ResultStatus")
        public String resultStatus;

        @NameInMap("FlowInstId")
        public Integer flowInstId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        public static GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceGroups build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceGroups self = new GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceGroups();
            return TeaModel.build(map, self);
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceGroups setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceGroups setDeleteStatus(String deleteStatus) {
            this.deleteStatus = deleteStatus;
            return this;
        }
        public String getDeleteStatus() {
            return this.deleteStatus;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceGroups setIdExtent(Integer idExtent) {
            this.idExtent = idExtent;
            return this;
        }
        public Integer getIdExtent() {
            return this.idExtent;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceGroups setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceGroups setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceGroups setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceGroups setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceGroups setResultStatus(String resultStatus) {
            this.resultStatus = resultStatus;
            return this;
        }
        public String getResultStatus() {
            return this.resultStatus;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceGroups setFlowInstId(Integer flowInstId) {
            this.flowInstId = flowInstId;
            return this;
        }
        public Integer getFlowInstId() {
            return this.flowInstId;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceGroups setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceGroups setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

    }

    public static class GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceResult extends TeaModel {
        @NameInMap("EnginePipelineNumber")
        public Integer enginePipelineNumber;

        @NameInMap("MixFlowInstId")
        public String mixFlowInstId;

        @NameInMap("EnginePipelineName")
        public String enginePipelineName;

        @NameInMap("EnginePipelineId")
        public Integer enginePipelineId;

        @NameInMap("EnginePipelineInstId")
        public Integer enginePipelineInstId;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("TriggerMode")
        public String triggerMode;

        @NameInMap("Sources")
        public String sources;

        @NameInMap("Caches")
        public String caches;

        @NameInMap("DateTime")
        public String dateTime;

        public static GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceResult build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceResult self = new GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceResult();
            return TeaModel.build(map, self);
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceResult setEnginePipelineNumber(Integer enginePipelineNumber) {
            this.enginePipelineNumber = enginePipelineNumber;
            return this;
        }
        public Integer getEnginePipelineNumber() {
            return this.enginePipelineNumber;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceResult setMixFlowInstId(String mixFlowInstId) {
            this.mixFlowInstId = mixFlowInstId;
            return this;
        }
        public String getMixFlowInstId() {
            return this.mixFlowInstId;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceResult setEnginePipelineName(String enginePipelineName) {
            this.enginePipelineName = enginePipelineName;
            return this;
        }
        public String getEnginePipelineName() {
            return this.enginePipelineName;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceResult setEnginePipelineId(Integer enginePipelineId) {
            this.enginePipelineId = enginePipelineId;
            return this;
        }
        public Integer getEnginePipelineId() {
            return this.enginePipelineId;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceResult setEnginePipelineInstId(Integer enginePipelineInstId) {
            this.enginePipelineInstId = enginePipelineInstId;
            return this;
        }
        public Integer getEnginePipelineInstId() {
            return this.enginePipelineInstId;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceResult setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceResult setTriggerMode(String triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public String getTriggerMode() {
            return this.triggerMode;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceResult setSources(String sources) {
            this.sources = sources;
            return this;
        }
        public String getSources() {
            return this.sources;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceResult setCaches(String caches) {
            this.caches = caches;
            return this;
        }
        public String getCaches() {
            return this.caches;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceResult setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

    }

    public static class GetPipelineInstHistoryResponseBodyDataDataListFlowInstance extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Stages")
        public java.util.Map<String, ?> stages;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("StatusName")
        public String statusName;

        @NameInMap("RunningStatus")
        public String runningStatus;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("StageTopo")
        public String stageTopo;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("AutoDrivenStatus")
        public Boolean autoDrivenStatus;

        @NameInMap("ResultStatus")
        public String resultStatus;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("SystemCode")
        public String systemCode;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("SystemId")
        public String systemId;

        @NameInMap("Groups")
        public java.util.List<GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceGroups> groups;

        @NameInMap("Result")
        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceResult result;

        public static GetPipelineInstHistoryResponseBodyDataDataListFlowInstance build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineInstHistoryResponseBodyDataDataListFlowInstance self = new GetPipelineInstHistoryResponseBodyDataDataListFlowInstance();
            return TeaModel.build(map, self);
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstance setStages(java.util.Map<String, ?> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.Map<String, ?> getStages() {
            return this.stages;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstance setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstance setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstance setRunningStatus(String runningStatus) {
            this.runningStatus = runningStatus;
            return this;
        }
        public String getRunningStatus() {
            return this.runningStatus;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstance setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstance setStageTopo(String stageTopo) {
            this.stageTopo = stageTopo;
            return this;
        }
        public String getStageTopo() {
            return this.stageTopo;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstance setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstance setAutoDrivenStatus(Boolean autoDrivenStatus) {
            this.autoDrivenStatus = autoDrivenStatus;
            return this;
        }
        public Boolean getAutoDrivenStatus() {
            return this.autoDrivenStatus;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstance setResultStatus(String resultStatus) {
            this.resultStatus = resultStatus;
            return this;
        }
        public String getResultStatus() {
            return this.resultStatus;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstance setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstance setSystemCode(String systemCode) {
            this.systemCode = systemCode;
            return this;
        }
        public String getSystemCode() {
            return this.systemCode;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstance setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstance setSystemId(String systemId) {
            this.systemId = systemId;
            return this;
        }
        public String getSystemId() {
            return this.systemId;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstance setGroups(java.util.List<GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceGroups> getGroups() {
            return this.groups;
        }

        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstance setResult(GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceResult result) {
            this.result = result;
            return this;
        }
        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstanceResult getResult() {
            return this.result;
        }

    }

    public static class GetPipelineInstHistoryResponseBodyDataDataList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("StatusName")
        public String statusName;

        @NameInMap("TriggerMode")
        public Integer triggerMode;

        @NameInMap("PipelineConfigId")
        public Integer pipelineConfigId;

        @NameInMap("Deletion")
        public String deletion;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("InstNumber")
        public Integer instNumber;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("Packages")
        public String packages;

        @NameInMap("FlowInstId")
        public Integer flowInstId;

        @NameInMap("PipelineId")
        public Integer pipelineId;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("FlowInstance")
        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstance flowInstance;

        public static GetPipelineInstHistoryResponseBodyDataDataList build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineInstHistoryResponseBodyDataDataList self = new GetPipelineInstHistoryResponseBodyDataDataList();
            return TeaModel.build(map, self);
        }

        public GetPipelineInstHistoryResponseBodyDataDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipelineInstHistoryResponseBodyDataDataList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetPipelineInstHistoryResponseBodyDataDataList setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public GetPipelineInstHistoryResponseBodyDataDataList setTriggerMode(Integer triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public Integer getTriggerMode() {
            return this.triggerMode;
        }

        public GetPipelineInstHistoryResponseBodyDataDataList setPipelineConfigId(Integer pipelineConfigId) {
            this.pipelineConfigId = pipelineConfigId;
            return this;
        }
        public Integer getPipelineConfigId() {
            return this.pipelineConfigId;
        }

        public GetPipelineInstHistoryResponseBodyDataDataList setDeletion(String deletion) {
            this.deletion = deletion;
            return this;
        }
        public String getDeletion() {
            return this.deletion;
        }

        public GetPipelineInstHistoryResponseBodyDataDataList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetPipelineInstHistoryResponseBodyDataDataList setInstNumber(Integer instNumber) {
            this.instNumber = instNumber;
            return this;
        }
        public Integer getInstNumber() {
            return this.instNumber;
        }

        public GetPipelineInstHistoryResponseBodyDataDataList setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetPipelineInstHistoryResponseBodyDataDataList setPackages(String packages) {
            this.packages = packages;
            return this;
        }
        public String getPackages() {
            return this.packages;
        }

        public GetPipelineInstHistoryResponseBodyDataDataList setFlowInstId(Integer flowInstId) {
            this.flowInstId = flowInstId;
            return this;
        }
        public Integer getFlowInstId() {
            return this.flowInstId;
        }

        public GetPipelineInstHistoryResponseBodyDataDataList setPipelineId(Integer pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Integer getPipelineId() {
            return this.pipelineId;
        }

        public GetPipelineInstHistoryResponseBodyDataDataList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetPipelineInstHistoryResponseBodyDataDataList setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetPipelineInstHistoryResponseBodyDataDataList setFlowInstance(GetPipelineInstHistoryResponseBodyDataDataListFlowInstance flowInstance) {
            this.flowInstance = flowInstance;
            return this;
        }
        public GetPipelineInstHistoryResponseBodyDataDataListFlowInstance getFlowInstance() {
            return this.flowInstance;
        }

    }

    public static class GetPipelineInstHistoryResponseBodyData extends TeaModel {
        @NameInMap("Total")
        public Integer total;

        @NameInMap("DataList")
        public java.util.List<GetPipelineInstHistoryResponseBodyDataDataList> dataList;

        public static GetPipelineInstHistoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineInstHistoryResponseBodyData self = new GetPipelineInstHistoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPipelineInstHistoryResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public GetPipelineInstHistoryResponseBodyData setDataList(java.util.List<GetPipelineInstHistoryResponseBodyDataDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<GetPipelineInstHistoryResponseBodyDataDataList> getDataList() {
            return this.dataList;
        }

    }

}

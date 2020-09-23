// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetRemindResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetRemindResponseData data;

    public static GetRemindResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRemindResponse self = new GetRemindResponse();
        return TeaModel.build(map, self);
    }

    public GetRemindResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetRemindResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetRemindResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetRemindResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRemindResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRemindResponse setData(GetRemindResponseData data) {
        this.data = data;
        return this;
    }
    public GetRemindResponseData getData() {
        return this.data;
    }

    public static class GetRemindResponseDataRobots extends TeaModel {
        @NameInMap("WebUrl")
        @Validation(required = true)
        public String webUrl;

        @NameInMap("AtAll")
        @Validation(required = true)
        public Boolean atAll;

        public static GetRemindResponseDataRobots build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseDataRobots self = new GetRemindResponseDataRobots();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseDataRobots setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public GetRemindResponseDataRobots setAtAll(Boolean atAll) {
            this.atAll = atAll;
            return this;
        }
        public Boolean getAtAll() {
            return this.atAll;
        }

    }

    public static class GetRemindResponseDataNodes extends TeaModel {
        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        public static GetRemindResponseDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseDataNodes self = new GetRemindResponseDataNodes();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseDataNodes setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetRemindResponseDataNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetRemindResponseDataNodes setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetRemindResponseDataNodes setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class GetRemindResponseDataBaselines extends TeaModel {
        @NameInMap("BaselineId")
        @Validation(required = true)
        public Long baselineId;

        @NameInMap("BaselineName")
        @Validation(required = true)
        public String baselineName;

        public static GetRemindResponseDataBaselines build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseDataBaselines self = new GetRemindResponseDataBaselines();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseDataBaselines setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetRemindResponseDataBaselines setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

    }

    public static class GetRemindResponseDataProjects extends TeaModel {
        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        public static GetRemindResponseDataProjects build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseDataProjects self = new GetRemindResponseDataProjects();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseDataProjects setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class GetRemindResponseDataBizProcesses extends TeaModel {
        @NameInMap("BizId")
        @Validation(required = true)
        public Long bizId;

        @NameInMap("BizProcessName")
        @Validation(required = true)
        public String bizProcessName;

        public static GetRemindResponseDataBizProcesses build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseDataBizProcesses self = new GetRemindResponseDataBizProcesses();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseDataBizProcesses setBizId(Long bizId) {
            this.bizId = bizId;
            return this;
        }
        public Long getBizId() {
            return this.bizId;
        }

        public GetRemindResponseDataBizProcesses setBizProcessName(String bizProcessName) {
            this.bizProcessName = bizProcessName;
            return this;
        }
        public String getBizProcessName() {
            return this.bizProcessName;
        }

    }

    public static class GetRemindResponseData extends TeaModel {
        @NameInMap("RemindId")
        @Validation(required = true)
        public Long remindId;

        @NameInMap("RemindName")
        @Validation(required = true)
        public String remindName;

        @NameInMap("DndStart")
        @Validation(required = true)
        public String dndStart;

        @NameInMap("DndEnd")
        @Validation(required = true)
        public String dndEnd;

        @NameInMap("RemindUnit")
        @Validation(required = true)
        public String remindUnit;

        @NameInMap("RemindType")
        @Validation(required = true)
        public String remindType;

        @NameInMap("AlertUnit")
        @Validation(required = true)
        public String alertUnit;

        @NameInMap("Useflag")
        @Validation(required = true)
        public Boolean useflag;

        @NameInMap("Founder")
        @Validation(required = true)
        public String founder;

        @NameInMap("AlertInterval")
        @Validation(required = true)
        public Integer alertInterval;

        @NameInMap("Detail")
        @Validation(required = true)
        public String detail;

        @NameInMap("MaxAlertTimes")
        @Validation(required = true)
        public Integer maxAlertTimes;

        @NameInMap("Robots")
        @Validation(required = true)
        public java.util.List<GetRemindResponseDataRobots> robots;

        @NameInMap("Nodes")
        @Validation(required = true)
        public java.util.List<GetRemindResponseDataNodes> nodes;

        @NameInMap("Baselines")
        @Validation(required = true)
        public java.util.List<GetRemindResponseDataBaselines> baselines;

        @NameInMap("Projects")
        @Validation(required = true)
        public java.util.List<GetRemindResponseDataProjects> projects;

        @NameInMap("BizProcesses")
        @Validation(required = true)
        public java.util.List<GetRemindResponseDataBizProcesses> bizProcesses;

        @NameInMap("AlertMethods")
        @Validation(required = true)
        public java.util.List<String> alertMethods;

        @NameInMap("AlertTargets")
        @Validation(required = true)
        public java.util.List<String> alertTargets;

        public static GetRemindResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseData self = new GetRemindResponseData();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseData setRemindId(Long remindId) {
            this.remindId = remindId;
            return this;
        }
        public Long getRemindId() {
            return this.remindId;
        }

        public GetRemindResponseData setRemindName(String remindName) {
            this.remindName = remindName;
            return this;
        }
        public String getRemindName() {
            return this.remindName;
        }

        public GetRemindResponseData setDndStart(String dndStart) {
            this.dndStart = dndStart;
            return this;
        }
        public String getDndStart() {
            return this.dndStart;
        }

        public GetRemindResponseData setDndEnd(String dndEnd) {
            this.dndEnd = dndEnd;
            return this;
        }
        public String getDndEnd() {
            return this.dndEnd;
        }

        public GetRemindResponseData setRemindUnit(String remindUnit) {
            this.remindUnit = remindUnit;
            return this;
        }
        public String getRemindUnit() {
            return this.remindUnit;
        }

        public GetRemindResponseData setRemindType(String remindType) {
            this.remindType = remindType;
            return this;
        }
        public String getRemindType() {
            return this.remindType;
        }

        public GetRemindResponseData setAlertUnit(String alertUnit) {
            this.alertUnit = alertUnit;
            return this;
        }
        public String getAlertUnit() {
            return this.alertUnit;
        }

        public GetRemindResponseData setUseflag(Boolean useflag) {
            this.useflag = useflag;
            return this;
        }
        public Boolean getUseflag() {
            return this.useflag;
        }

        public GetRemindResponseData setFounder(String founder) {
            this.founder = founder;
            return this;
        }
        public String getFounder() {
            return this.founder;
        }

        public GetRemindResponseData setAlertInterval(Integer alertInterval) {
            this.alertInterval = alertInterval;
            return this;
        }
        public Integer getAlertInterval() {
            return this.alertInterval;
        }

        public GetRemindResponseData setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetRemindResponseData setMaxAlertTimes(Integer maxAlertTimes) {
            this.maxAlertTimes = maxAlertTimes;
            return this;
        }
        public Integer getMaxAlertTimes() {
            return this.maxAlertTimes;
        }

        public GetRemindResponseData setRobots(java.util.List<GetRemindResponseDataRobots> robots) {
            this.robots = robots;
            return this;
        }
        public java.util.List<GetRemindResponseDataRobots> getRobots() {
            return this.robots;
        }

        public GetRemindResponseData setNodes(java.util.List<GetRemindResponseDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetRemindResponseDataNodes> getNodes() {
            return this.nodes;
        }

        public GetRemindResponseData setBaselines(java.util.List<GetRemindResponseDataBaselines> baselines) {
            this.baselines = baselines;
            return this;
        }
        public java.util.List<GetRemindResponseDataBaselines> getBaselines() {
            return this.baselines;
        }

        public GetRemindResponseData setProjects(java.util.List<GetRemindResponseDataProjects> projects) {
            this.projects = projects;
            return this;
        }
        public java.util.List<GetRemindResponseDataProjects> getProjects() {
            return this.projects;
        }

        public GetRemindResponseData setBizProcesses(java.util.List<GetRemindResponseDataBizProcesses> bizProcesses) {
            this.bizProcesses = bizProcesses;
            return this;
        }
        public java.util.List<GetRemindResponseDataBizProcesses> getBizProcesses() {
            return this.bizProcesses;
        }

        public GetRemindResponseData setAlertMethods(java.util.List<String> alertMethods) {
            this.alertMethods = alertMethods;
            return this;
        }
        public java.util.List<String> getAlertMethods() {
            return this.alertMethods;
        }

        public GetRemindResponseData setAlertTargets(java.util.List<String> alertTargets) {
            this.alertTargets = alertTargets;
            return this;
        }
        public java.util.List<String> getAlertTargets() {
            return this.alertTargets;
        }

    }

}

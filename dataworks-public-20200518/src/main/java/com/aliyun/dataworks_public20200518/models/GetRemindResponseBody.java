// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetRemindResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetRemindResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetRemindResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRemindResponseBody self = new GetRemindResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRemindResponseBody setData(GetRemindResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRemindResponseBodyData getData() {
        return this.data;
    }

    public GetRemindResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetRemindResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetRemindResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRemindResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRemindResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRemindResponseBodyDataBaselines extends TeaModel {
        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("BaselineName")
        public String baselineName;

        public static GetRemindResponseBodyDataBaselines build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseBodyDataBaselines self = new GetRemindResponseBodyDataBaselines();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseBodyDataBaselines setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetRemindResponseBodyDataBaselines setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

    }

    public static class GetRemindResponseBodyDataBizProcesses extends TeaModel {
        @NameInMap("BizId")
        public Long bizId;

        @NameInMap("BizProcessName")
        public String bizProcessName;

        public static GetRemindResponseBodyDataBizProcesses build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseBodyDataBizProcesses self = new GetRemindResponseBodyDataBizProcesses();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseBodyDataBizProcesses setBizId(Long bizId) {
            this.bizId = bizId;
            return this;
        }
        public Long getBizId() {
            return this.bizId;
        }

        public GetRemindResponseBodyDataBizProcesses setBizProcessName(String bizProcessName) {
            this.bizProcessName = bizProcessName;
            return this;
        }
        public String getBizProcessName() {
            return this.bizProcessName;
        }

    }

    public static class GetRemindResponseBodyDataNodes extends TeaModel {
        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ProjectId")
        public Long projectId;

        public static GetRemindResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseBodyDataNodes self = new GetRemindResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseBodyDataNodes setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetRemindResponseBodyDataNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetRemindResponseBodyDataNodes setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetRemindResponseBodyDataNodes setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class GetRemindResponseBodyDataProjects extends TeaModel {
        @NameInMap("ProjectId")
        public Long projectId;

        public static GetRemindResponseBodyDataProjects build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseBodyDataProjects self = new GetRemindResponseBodyDataProjects();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseBodyDataProjects setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class GetRemindResponseBodyDataRobots extends TeaModel {
        @NameInMap("AtAll")
        public Boolean atAll;

        @NameInMap("WebUrl")
        public String webUrl;

        public static GetRemindResponseBodyDataRobots build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseBodyDataRobots self = new GetRemindResponseBodyDataRobots();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseBodyDataRobots setAtAll(Boolean atAll) {
            this.atAll = atAll;
            return this;
        }
        public Boolean getAtAll() {
            return this.atAll;
        }

        public GetRemindResponseBodyDataRobots setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

    public static class GetRemindResponseBodyData extends TeaModel {
        @NameInMap("AlertInterval")
        public Integer alertInterval;

        @NameInMap("AlertMethods")
        public java.util.List<String> alertMethods;

        @NameInMap("AlertTargets")
        public java.util.List<String> alertTargets;

        @NameInMap("AlertUnit")
        public String alertUnit;

        @NameInMap("Baselines")
        public java.util.List<GetRemindResponseBodyDataBaselines> baselines;

        @NameInMap("BizProcesses")
        public java.util.List<GetRemindResponseBodyDataBizProcesses> bizProcesses;

        @NameInMap("Detail")
        public String detail;

        @NameInMap("DndEnd")
        public String dndEnd;

        @NameInMap("DndStart")
        public String dndStart;

        @NameInMap("Founder")
        public String founder;

        @NameInMap("MaxAlertTimes")
        public Integer maxAlertTimes;

        @NameInMap("Nodes")
        public java.util.List<GetRemindResponseBodyDataNodes> nodes;

        @NameInMap("Projects")
        public java.util.List<GetRemindResponseBodyDataProjects> projects;

        @NameInMap("RemindId")
        public Long remindId;

        @NameInMap("RemindName")
        public String remindName;

        @NameInMap("RemindType")
        public String remindType;

        @NameInMap("RemindUnit")
        public String remindUnit;

        @NameInMap("Robots")
        public java.util.List<GetRemindResponseBodyDataRobots> robots;

        @NameInMap("Useflag")
        public Boolean useflag;

        public static GetRemindResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseBodyData self = new GetRemindResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseBodyData setAlertInterval(Integer alertInterval) {
            this.alertInterval = alertInterval;
            return this;
        }
        public Integer getAlertInterval() {
            return this.alertInterval;
        }

        public GetRemindResponseBodyData setAlertMethods(java.util.List<String> alertMethods) {
            this.alertMethods = alertMethods;
            return this;
        }
        public java.util.List<String> getAlertMethods() {
            return this.alertMethods;
        }

        public GetRemindResponseBodyData setAlertTargets(java.util.List<String> alertTargets) {
            this.alertTargets = alertTargets;
            return this;
        }
        public java.util.List<String> getAlertTargets() {
            return this.alertTargets;
        }

        public GetRemindResponseBodyData setAlertUnit(String alertUnit) {
            this.alertUnit = alertUnit;
            return this;
        }
        public String getAlertUnit() {
            return this.alertUnit;
        }

        public GetRemindResponseBodyData setBaselines(java.util.List<GetRemindResponseBodyDataBaselines> baselines) {
            this.baselines = baselines;
            return this;
        }
        public java.util.List<GetRemindResponseBodyDataBaselines> getBaselines() {
            return this.baselines;
        }

        public GetRemindResponseBodyData setBizProcesses(java.util.List<GetRemindResponseBodyDataBizProcesses> bizProcesses) {
            this.bizProcesses = bizProcesses;
            return this;
        }
        public java.util.List<GetRemindResponseBodyDataBizProcesses> getBizProcesses() {
            return this.bizProcesses;
        }

        public GetRemindResponseBodyData setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetRemindResponseBodyData setDndEnd(String dndEnd) {
            this.dndEnd = dndEnd;
            return this;
        }
        public String getDndEnd() {
            return this.dndEnd;
        }

        public GetRemindResponseBodyData setDndStart(String dndStart) {
            this.dndStart = dndStart;
            return this;
        }
        public String getDndStart() {
            return this.dndStart;
        }

        public GetRemindResponseBodyData setFounder(String founder) {
            this.founder = founder;
            return this;
        }
        public String getFounder() {
            return this.founder;
        }

        public GetRemindResponseBodyData setMaxAlertTimes(Integer maxAlertTimes) {
            this.maxAlertTimes = maxAlertTimes;
            return this;
        }
        public Integer getMaxAlertTimes() {
            return this.maxAlertTimes;
        }

        public GetRemindResponseBodyData setNodes(java.util.List<GetRemindResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetRemindResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

        public GetRemindResponseBodyData setProjects(java.util.List<GetRemindResponseBodyDataProjects> projects) {
            this.projects = projects;
            return this;
        }
        public java.util.List<GetRemindResponseBodyDataProjects> getProjects() {
            return this.projects;
        }

        public GetRemindResponseBodyData setRemindId(Long remindId) {
            this.remindId = remindId;
            return this;
        }
        public Long getRemindId() {
            return this.remindId;
        }

        public GetRemindResponseBodyData setRemindName(String remindName) {
            this.remindName = remindName;
            return this;
        }
        public String getRemindName() {
            return this.remindName;
        }

        public GetRemindResponseBodyData setRemindType(String remindType) {
            this.remindType = remindType;
            return this;
        }
        public String getRemindType() {
            return this.remindType;
        }

        public GetRemindResponseBodyData setRemindUnit(String remindUnit) {
            this.remindUnit = remindUnit;
            return this;
        }
        public String getRemindUnit() {
            return this.remindUnit;
        }

        public GetRemindResponseBodyData setRobots(java.util.List<GetRemindResponseBodyDataRobots> robots) {
            this.robots = robots;
            return this;
        }
        public java.util.List<GetRemindResponseBodyDataRobots> getRobots() {
            return this.robots;
        }

        public GetRemindResponseBodyData setUseflag(Boolean useflag) {
            this.useflag = useflag;
            return this;
        }
        public Boolean getUseflag() {
            return this.useflag;
        }

    }

}

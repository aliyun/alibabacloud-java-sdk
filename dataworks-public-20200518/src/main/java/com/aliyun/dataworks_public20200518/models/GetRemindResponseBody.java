// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetRemindResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public GetRemindResponseBodyData data;

    public static GetRemindResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRemindResponseBody self = new GetRemindResponseBody();
        return TeaModel.build(map, self);
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

    public GetRemindResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetRemindResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetRemindResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetRemindResponseBody setData(GetRemindResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRemindResponseBodyData getData() {
        return this.data;
    }

    public static class GetRemindResponseBodyDataRobots extends TeaModel {
        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("AtAll")
        public Boolean atAll;

        public static GetRemindResponseBodyDataRobots build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseBodyDataRobots self = new GetRemindResponseBodyDataRobots();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseBodyDataRobots setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public GetRemindResponseBodyDataRobots setAtAll(Boolean atAll) {
            this.atAll = atAll;
            return this;
        }
        public Boolean getAtAll() {
            return this.atAll;
        }

    }

    public static class GetRemindResponseBodyDataNodes extends TeaModel {
        @NameInMap("Owner")
        public String owner;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("ProjectId")
        public Long projectId;

        public static GetRemindResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseBodyDataNodes self = new GetRemindResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseBodyDataNodes setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetRemindResponseBodyDataNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetRemindResponseBodyDataNodes setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetRemindResponseBodyDataNodes setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class GetRemindResponseBodyDataBaselines extends TeaModel {
        @NameInMap("BaselineName")
        public String baselineName;

        @NameInMap("BaselineId")
        public Long baselineId;

        public static GetRemindResponseBodyDataBaselines build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseBodyDataBaselines self = new GetRemindResponseBodyDataBaselines();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseBodyDataBaselines setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

        public GetRemindResponseBodyDataBaselines setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
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

    public static class GetRemindResponseBodyDataBizProcesses extends TeaModel {
        @NameInMap("BizProcessName")
        public String bizProcessName;

        @NameInMap("BizId")
        public Long bizId;

        public static GetRemindResponseBodyDataBizProcesses build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseBodyDataBizProcesses self = new GetRemindResponseBodyDataBizProcesses();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseBodyDataBizProcesses setBizProcessName(String bizProcessName) {
            this.bizProcessName = bizProcessName;
            return this;
        }
        public String getBizProcessName() {
            return this.bizProcessName;
        }

        public GetRemindResponseBodyDataBizProcesses setBizId(Long bizId) {
            this.bizId = bizId;
            return this;
        }
        public Long getBizId() {
            return this.bizId;
        }

    }

    public static class GetRemindResponseBodyData extends TeaModel {
        @NameInMap("MaxAlertTimes")
        public Integer maxAlertTimes;

        @NameInMap("RemindUnit")
        public String remindUnit;

        @NameInMap("AlertInterval")
        public Integer alertInterval;

        @NameInMap("Useflag")
        public Boolean useflag;

        @NameInMap("Founder")
        public String founder;

        @NameInMap("RemindId")
        public Long remindId;

        @NameInMap("DndEnd")
        public String dndEnd;

        @NameInMap("RemindType")
        public String remindType;

        @NameInMap("AlertUnit")
        public String alertUnit;

        @NameInMap("DndStart")
        public String dndStart;

        @NameInMap("RemindName")
        public String remindName;

        @NameInMap("Detail")
        public String detail;

        @NameInMap("Robots")
        public java.util.List<GetRemindResponseBodyDataRobots> robots;

        @NameInMap("Nodes")
        public java.util.List<GetRemindResponseBodyDataNodes> nodes;

        @NameInMap("Baselines")
        public java.util.List<GetRemindResponseBodyDataBaselines> baselines;

        @NameInMap("Projects")
        public java.util.List<GetRemindResponseBodyDataProjects> projects;

        @NameInMap("BizProcesses")
        public java.util.List<GetRemindResponseBodyDataBizProcesses> bizProcesses;

        @NameInMap("AlertTargets")
        public java.util.List<String> alertTargets;

        @NameInMap("AlertMethods")
        public java.util.List<String> alertMethods;

        public static GetRemindResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseBodyData self = new GetRemindResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseBodyData setMaxAlertTimes(Integer maxAlertTimes) {
            this.maxAlertTimes = maxAlertTimes;
            return this;
        }
        public Integer getMaxAlertTimes() {
            return this.maxAlertTimes;
        }

        public GetRemindResponseBodyData setRemindUnit(String remindUnit) {
            this.remindUnit = remindUnit;
            return this;
        }
        public String getRemindUnit() {
            return this.remindUnit;
        }

        public GetRemindResponseBodyData setAlertInterval(Integer alertInterval) {
            this.alertInterval = alertInterval;
            return this;
        }
        public Integer getAlertInterval() {
            return this.alertInterval;
        }

        public GetRemindResponseBodyData setUseflag(Boolean useflag) {
            this.useflag = useflag;
            return this;
        }
        public Boolean getUseflag() {
            return this.useflag;
        }

        public GetRemindResponseBodyData setFounder(String founder) {
            this.founder = founder;
            return this;
        }
        public String getFounder() {
            return this.founder;
        }

        public GetRemindResponseBodyData setRemindId(Long remindId) {
            this.remindId = remindId;
            return this;
        }
        public Long getRemindId() {
            return this.remindId;
        }

        public GetRemindResponseBodyData setDndEnd(String dndEnd) {
            this.dndEnd = dndEnd;
            return this;
        }
        public String getDndEnd() {
            return this.dndEnd;
        }

        public GetRemindResponseBodyData setRemindType(String remindType) {
            this.remindType = remindType;
            return this;
        }
        public String getRemindType() {
            return this.remindType;
        }

        public GetRemindResponseBodyData setAlertUnit(String alertUnit) {
            this.alertUnit = alertUnit;
            return this;
        }
        public String getAlertUnit() {
            return this.alertUnit;
        }

        public GetRemindResponseBodyData setDndStart(String dndStart) {
            this.dndStart = dndStart;
            return this;
        }
        public String getDndStart() {
            return this.dndStart;
        }

        public GetRemindResponseBodyData setRemindName(String remindName) {
            this.remindName = remindName;
            return this;
        }
        public String getRemindName() {
            return this.remindName;
        }

        public GetRemindResponseBodyData setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetRemindResponseBodyData setRobots(java.util.List<GetRemindResponseBodyDataRobots> robots) {
            this.robots = robots;
            return this;
        }
        public java.util.List<GetRemindResponseBodyDataRobots> getRobots() {
            return this.robots;
        }

        public GetRemindResponseBodyData setNodes(java.util.List<GetRemindResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetRemindResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

        public GetRemindResponseBodyData setBaselines(java.util.List<GetRemindResponseBodyDataBaselines> baselines) {
            this.baselines = baselines;
            return this;
        }
        public java.util.List<GetRemindResponseBodyDataBaselines> getBaselines() {
            return this.baselines;
        }

        public GetRemindResponseBodyData setProjects(java.util.List<GetRemindResponseBodyDataProjects> projects) {
            this.projects = projects;
            return this;
        }
        public java.util.List<GetRemindResponseBodyDataProjects> getProjects() {
            return this.projects;
        }

        public GetRemindResponseBodyData setBizProcesses(java.util.List<GetRemindResponseBodyDataBizProcesses> bizProcesses) {
            this.bizProcesses = bizProcesses;
            return this;
        }
        public java.util.List<GetRemindResponseBodyDataBizProcesses> getBizProcesses() {
            return this.bizProcesses;
        }

        public GetRemindResponseBodyData setAlertTargets(java.util.List<String> alertTargets) {
            this.alertTargets = alertTargets;
            return this;
        }
        public java.util.List<String> getAlertTargets() {
            return this.alertTargets;
        }

        public GetRemindResponseBodyData setAlertMethods(java.util.List<String> alertMethods) {
            this.alertMethods = alertMethods;
            return this;
        }
        public java.util.List<String> getAlertMethods() {
            return this.alertMethods;
        }

    }

}

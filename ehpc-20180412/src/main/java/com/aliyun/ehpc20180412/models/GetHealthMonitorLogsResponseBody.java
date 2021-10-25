// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetHealthMonitorLogsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LogInfo")
    public GetHealthMonitorLogsResponseBodyLogInfo logInfo;

    public static GetHealthMonitorLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHealthMonitorLogsResponseBody self = new GetHealthMonitorLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHealthMonitorLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHealthMonitorLogsResponseBody setLogInfo(GetHealthMonitorLogsResponseBodyLogInfo logInfo) {
        this.logInfo = logInfo;
        return this;
    }
    public GetHealthMonitorLogsResponseBodyLogInfo getLogInfo() {
        return this.logInfo;
    }

    public static class GetHealthMonitorLogsResponseBodyLogInfoLogsCheckListCheckList extends TeaModel {
        @NameInMap("CheckInfo")
        public String checkInfo;

        @NameInMap("CheckDescription")
        public String checkDescription;

        @NameInMap("CheckSolution")
        public String checkSolution;

        @NameInMap("CheckName")
        public String checkName;

        public static GetHealthMonitorLogsResponseBodyLogInfoLogsCheckListCheckList build(java.util.Map<String, ?> map) throws Exception {
            GetHealthMonitorLogsResponseBodyLogInfoLogsCheckListCheckList self = new GetHealthMonitorLogsResponseBodyLogInfoLogsCheckListCheckList();
            return TeaModel.build(map, self);
        }

        public GetHealthMonitorLogsResponseBodyLogInfoLogsCheckListCheckList setCheckInfo(String checkInfo) {
            this.checkInfo = checkInfo;
            return this;
        }
        public String getCheckInfo() {
            return this.checkInfo;
        }

        public GetHealthMonitorLogsResponseBodyLogInfoLogsCheckListCheckList setCheckDescription(String checkDescription) {
            this.checkDescription = checkDescription;
            return this;
        }
        public String getCheckDescription() {
            return this.checkDescription;
        }

        public GetHealthMonitorLogsResponseBodyLogInfoLogsCheckListCheckList setCheckSolution(String checkSolution) {
            this.checkSolution = checkSolution;
            return this;
        }
        public String getCheckSolution() {
            return this.checkSolution;
        }

        public GetHealthMonitorLogsResponseBodyLogInfoLogsCheckListCheckList setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

    }

    public static class GetHealthMonitorLogsResponseBodyLogInfoLogsCheckList extends TeaModel {
        @NameInMap("CheckList")
        public java.util.List<GetHealthMonitorLogsResponseBodyLogInfoLogsCheckListCheckList> checkList;

        public static GetHealthMonitorLogsResponseBodyLogInfoLogsCheckList build(java.util.Map<String, ?> map) throws Exception {
            GetHealthMonitorLogsResponseBodyLogInfoLogsCheckList self = new GetHealthMonitorLogsResponseBodyLogInfoLogsCheckList();
            return TeaModel.build(map, self);
        }

        public GetHealthMonitorLogsResponseBodyLogInfoLogsCheckList setCheckList(java.util.List<GetHealthMonitorLogsResponseBodyLogInfoLogsCheckListCheckList> checkList) {
            this.checkList = checkList;
            return this;
        }
        public java.util.List<GetHealthMonitorLogsResponseBodyLogInfoLogsCheckListCheckList> getCheckList() {
            return this.checkList;
        }

    }

    public static class GetHealthMonitorLogsResponseBodyLogInfoLogs extends TeaModel {
        @NameInMap("Time")
        public Integer time;

        @NameInMap("ItemDescription")
        public String itemDescription;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("HealthId")
        public String healthId;

        @NameInMap("SceneDescription")
        public String sceneDescription;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Level")
        public String level;

        @NameInMap("CheckList")
        public GetHealthMonitorLogsResponseBodyLogInfoLogsCheckList checkList;

        public static GetHealthMonitorLogsResponseBodyLogInfoLogs build(java.util.Map<String, ?> map) throws Exception {
            GetHealthMonitorLogsResponseBodyLogInfoLogs self = new GetHealthMonitorLogsResponseBodyLogInfoLogs();
            return TeaModel.build(map, self);
        }

        public GetHealthMonitorLogsResponseBodyLogInfoLogs setTime(Integer time) {
            this.time = time;
            return this;
        }
        public Integer getTime() {
            return this.time;
        }

        public GetHealthMonitorLogsResponseBodyLogInfoLogs setItemDescription(String itemDescription) {
            this.itemDescription = itemDescription;
            return this;
        }
        public String getItemDescription() {
            return this.itemDescription;
        }

        public GetHealthMonitorLogsResponseBodyLogInfoLogs setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public GetHealthMonitorLogsResponseBodyLogInfoLogs setHealthId(String healthId) {
            this.healthId = healthId;
            return this;
        }
        public String getHealthId() {
            return this.healthId;
        }

        public GetHealthMonitorLogsResponseBodyLogInfoLogs setSceneDescription(String sceneDescription) {
            this.sceneDescription = sceneDescription;
            return this;
        }
        public String getSceneDescription() {
            return this.sceneDescription;
        }

        public GetHealthMonitorLogsResponseBodyLogInfoLogs setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public GetHealthMonitorLogsResponseBodyLogInfoLogs setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetHealthMonitorLogsResponseBodyLogInfoLogs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetHealthMonitorLogsResponseBodyLogInfoLogs setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetHealthMonitorLogsResponseBodyLogInfoLogs setCheckList(GetHealthMonitorLogsResponseBodyLogInfoLogsCheckList checkList) {
            this.checkList = checkList;
            return this;
        }
        public GetHealthMonitorLogsResponseBodyLogInfoLogsCheckList getCheckList() {
            return this.checkList;
        }

    }

    public static class GetHealthMonitorLogsResponseBodyLogInfo extends TeaModel {
        @NameInMap("Logs")
        public java.util.List<GetHealthMonitorLogsResponseBodyLogInfoLogs> logs;

        public static GetHealthMonitorLogsResponseBodyLogInfo build(java.util.Map<String, ?> map) throws Exception {
            GetHealthMonitorLogsResponseBodyLogInfo self = new GetHealthMonitorLogsResponseBodyLogInfo();
            return TeaModel.build(map, self);
        }

        public GetHealthMonitorLogsResponseBodyLogInfo setLogs(java.util.List<GetHealthMonitorLogsResponseBodyLogInfoLogs> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<GetHealthMonitorLogsResponseBodyLogInfoLogs> getLogs() {
            return this.logs;
        }

    }

}

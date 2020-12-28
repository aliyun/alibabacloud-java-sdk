// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetHealthMonitorLogsResponseBody extends TeaModel {
    @NameInMap("LogInfo")
    public java.util.List<GetHealthMonitorLogsResponseBodyLogInfo> logInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static GetHealthMonitorLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHealthMonitorLogsResponseBody self = new GetHealthMonitorLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHealthMonitorLogsResponseBody setLogInfo(java.util.List<GetHealthMonitorLogsResponseBodyLogInfo> logInfo) {
        this.logInfo = logInfo;
        return this;
    }
    public java.util.List<GetHealthMonitorLogsResponseBodyLogInfo> getLogInfo() {
        return this.logInfo;
    }

    public GetHealthMonitorLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetHealthMonitorLogsResponseBodyLogInfoCheckList extends TeaModel {
        @NameInMap("CheckInfo")
        public String checkInfo;

        @NameInMap("CheckDescription")
        public String checkDescription;

        @NameInMap("CheckSolution")
        public String checkSolution;

        @NameInMap("CheckName")
        public String checkName;

        public static GetHealthMonitorLogsResponseBodyLogInfoCheckList build(java.util.Map<String, ?> map) throws Exception {
            GetHealthMonitorLogsResponseBodyLogInfoCheckList self = new GetHealthMonitorLogsResponseBodyLogInfoCheckList();
            return TeaModel.build(map, self);
        }

        public GetHealthMonitorLogsResponseBodyLogInfoCheckList setCheckInfo(String checkInfo) {
            this.checkInfo = checkInfo;
            return this;
        }
        public String getCheckInfo() {
            return this.checkInfo;
        }

        public GetHealthMonitorLogsResponseBodyLogInfoCheckList setCheckDescription(String checkDescription) {
            this.checkDescription = checkDescription;
            return this;
        }
        public String getCheckDescription() {
            return this.checkDescription;
        }

        public GetHealthMonitorLogsResponseBodyLogInfoCheckList setCheckSolution(String checkSolution) {
            this.checkSolution = checkSolution;
            return this;
        }
        public String getCheckSolution() {
            return this.checkSolution;
        }

        public GetHealthMonitorLogsResponseBodyLogInfoCheckList setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

    }

    public static class GetHealthMonitorLogsResponseBodyLogInfo extends TeaModel {
        @NameInMap("Time")
        public Integer time;

        @NameInMap("ItemDescription")
        public String itemDescription;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("HealthId")
        public String healthId;

        @NameInMap("CheckList")
        public java.util.List<GetHealthMonitorLogsResponseBodyLogInfoCheckList> checkList;

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

        public static GetHealthMonitorLogsResponseBodyLogInfo build(java.util.Map<String, ?> map) throws Exception {
            GetHealthMonitorLogsResponseBodyLogInfo self = new GetHealthMonitorLogsResponseBodyLogInfo();
            return TeaModel.build(map, self);
        }

        public GetHealthMonitorLogsResponseBodyLogInfo setTime(Integer time) {
            this.time = time;
            return this;
        }
        public Integer getTime() {
            return this.time;
        }

        public GetHealthMonitorLogsResponseBodyLogInfo setItemDescription(String itemDescription) {
            this.itemDescription = itemDescription;
            return this;
        }
        public String getItemDescription() {
            return this.itemDescription;
        }

        public GetHealthMonitorLogsResponseBodyLogInfo setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public GetHealthMonitorLogsResponseBodyLogInfo setHealthId(String healthId) {
            this.healthId = healthId;
            return this;
        }
        public String getHealthId() {
            return this.healthId;
        }

        public GetHealthMonitorLogsResponseBodyLogInfo setCheckList(java.util.List<GetHealthMonitorLogsResponseBodyLogInfoCheckList> checkList) {
            this.checkList = checkList;
            return this;
        }
        public java.util.List<GetHealthMonitorLogsResponseBodyLogInfoCheckList> getCheckList() {
            return this.checkList;
        }

        public GetHealthMonitorLogsResponseBodyLogInfo setSceneDescription(String sceneDescription) {
            this.sceneDescription = sceneDescription;
            return this;
        }
        public String getSceneDescription() {
            return this.sceneDescription;
        }

        public GetHealthMonitorLogsResponseBodyLogInfo setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public GetHealthMonitorLogsResponseBodyLogInfo setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetHealthMonitorLogsResponseBodyLogInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetHealthMonitorLogsResponseBodyLogInfo setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

}

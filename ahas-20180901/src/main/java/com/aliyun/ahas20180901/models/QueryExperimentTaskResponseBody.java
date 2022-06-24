// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryExperimentTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryExperimentTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryExperimentTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryExperimentTaskResponseBody self = new QueryExperimentTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryExperimentTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryExperimentTaskResponseBody setData(QueryExperimentTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryExperimentTaskResponseBodyData getData() {
        return this.data;
    }

    public QueryExperimentTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryExperimentTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryExperimentTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryExperimentTaskResponseBodyDataActivitiesApps extends TeaModel {
        @NameInMap("appConfigurationId")
        public String appConfigurationId;

        @NameInMap("deviceName")
        public String deviceName;

        @NameInMap("hostIp")
        public String hostIp;

        @NameInMap("result")
        public String result;

        @NameInMap("startTime")
        public Long startTime;

        @NameInMap("state")
        public Long state;

        @NameInMap("taskId")
        public String taskId;

        public static QueryExperimentTaskResponseBodyDataActivitiesApps build(java.util.Map<String, ?> map) throws Exception {
            QueryExperimentTaskResponseBodyDataActivitiesApps self = new QueryExperimentTaskResponseBodyDataActivitiesApps();
            return TeaModel.build(map, self);
        }

        public QueryExperimentTaskResponseBodyDataActivitiesApps setAppConfigurationId(String appConfigurationId) {
            this.appConfigurationId = appConfigurationId;
            return this;
        }
        public String getAppConfigurationId() {
            return this.appConfigurationId;
        }

        public QueryExperimentTaskResponseBodyDataActivitiesApps setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryExperimentTaskResponseBodyDataActivitiesApps setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public QueryExperimentTaskResponseBodyDataActivitiesApps setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public QueryExperimentTaskResponseBodyDataActivitiesApps setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryExperimentTaskResponseBodyDataActivitiesApps setState(Long state) {
            this.state = state;
            return this;
        }
        public Long getState() {
            return this.state;
        }

        public QueryExperimentTaskResponseBodyDataActivitiesApps setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class QueryExperimentTaskResponseBodyDataActivitiesRunParamArguments extends TeaModel {
        @NameInMap("action")
        public java.util.Map<String, String> action;

        @NameInMap("argsComponents")
        public java.util.Map<String, DataActivitiesRunParamArgumentsArgsComponentsValue> argsComponents;

        @NameInMap("matcher")
        public java.util.Map<String, String> matcher;

        @NameInMap("user_args")
        public java.util.Map<String, String> userArgs;

        public static QueryExperimentTaskResponseBodyDataActivitiesRunParamArguments build(java.util.Map<String, ?> map) throws Exception {
            QueryExperimentTaskResponseBodyDataActivitiesRunParamArguments self = new QueryExperimentTaskResponseBodyDataActivitiesRunParamArguments();
            return TeaModel.build(map, self);
        }

        public QueryExperimentTaskResponseBodyDataActivitiesRunParamArguments setAction(java.util.Map<String, String> action) {
            this.action = action;
            return this;
        }
        public java.util.Map<String, String> getAction() {
            return this.action;
        }

        public QueryExperimentTaskResponseBodyDataActivitiesRunParamArguments setArgsComponents(java.util.Map<String, DataActivitiesRunParamArgumentsArgsComponentsValue> argsComponents) {
            this.argsComponents = argsComponents;
            return this;
        }
        public java.util.Map<String, DataActivitiesRunParamArgumentsArgsComponentsValue> getArgsComponents() {
            return this.argsComponents;
        }

        public QueryExperimentTaskResponseBodyDataActivitiesRunParamArguments setMatcher(java.util.Map<String, String> matcher) {
            this.matcher = matcher;
            return this;
        }
        public java.util.Map<String, String> getMatcher() {
            return this.matcher;
        }

        public QueryExperimentTaskResponseBodyDataActivitiesRunParamArguments setUserArgs(java.util.Map<String, String> userArgs) {
            this.userArgs = userArgs;
            return this;
        }
        public java.util.Map<String, String> getUserArgs() {
            return this.userArgs;
        }

    }

    public static class QueryExperimentTaskResponseBodyDataActivitiesRunParam extends TeaModel {
        @NameInMap("activityId")
        public String activityId;

        @NameInMap("arguments")
        public QueryExperimentTaskResponseBodyDataActivitiesRunParamArguments arguments;

        @NameInMap("failedTolerance")
        public Integer failedTolerance;

        @NameInMap("interruptedIfFailed")
        public Boolean interruptedIfFailed;

        @NameInMap("needUserCheck")
        public Boolean needUserCheck;

        public static QueryExperimentTaskResponseBodyDataActivitiesRunParam build(java.util.Map<String, ?> map) throws Exception {
            QueryExperimentTaskResponseBodyDataActivitiesRunParam self = new QueryExperimentTaskResponseBodyDataActivitiesRunParam();
            return TeaModel.build(map, self);
        }

        public QueryExperimentTaskResponseBodyDataActivitiesRunParam setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public QueryExperimentTaskResponseBodyDataActivitiesRunParam setArguments(QueryExperimentTaskResponseBodyDataActivitiesRunParamArguments arguments) {
            this.arguments = arguments;
            return this;
        }
        public QueryExperimentTaskResponseBodyDataActivitiesRunParamArguments getArguments() {
            return this.arguments;
        }

        public QueryExperimentTaskResponseBodyDataActivitiesRunParam setFailedTolerance(Integer failedTolerance) {
            this.failedTolerance = failedTolerance;
            return this;
        }
        public Integer getFailedTolerance() {
            return this.failedTolerance;
        }

        public QueryExperimentTaskResponseBodyDataActivitiesRunParam setInterruptedIfFailed(Boolean interruptedIfFailed) {
            this.interruptedIfFailed = interruptedIfFailed;
            return this;
        }
        public Boolean getInterruptedIfFailed() {
            return this.interruptedIfFailed;
        }

        public QueryExperimentTaskResponseBodyDataActivitiesRunParam setNeedUserCheck(Boolean needUserCheck) {
            this.needUserCheck = needUserCheck;
            return this;
        }
        public Boolean getNeedUserCheck() {
            return this.needUserCheck;
        }

    }

    public static class QueryExperimentTaskResponseBodyDataActivities extends TeaModel {
        @NameInMap("activityId")
        public String activityId;

        @NameInMap("activityTaskId")
        public String activityTaskId;

        @NameInMap("apps")
        public java.util.List<QueryExperimentTaskResponseBodyDataActivitiesApps> apps;

        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("errorMessage")
        public String errorMessage;

        @NameInMap("executableAppCode")
        public String executableAppCode;

        @NameInMap("experimentTaskId")
        public String experimentTaskId;

        @NameInMap("flowId")
        public String flowId;

        @NameInMap("miniAppCode")
        public String miniAppCode;

        @NameInMap("miniAppName")
        public String miniAppName;

        @NameInMap("order")
        public Integer order;

        @NameInMap("phase")
        public String phase;

        @NameInMap("retryable")
        public Boolean retryable;

        @NameInMap("runParam")
        public QueryExperimentTaskResponseBodyDataActivitiesRunParam runParam;

        @NameInMap("runResult")
        public String runResult;

        @NameInMap("startTime")
        public Long startTime;

        @NameInMap("state")
        public String state;

        @NameInMap("userCheckState")
        public String userCheckState;

        public static QueryExperimentTaskResponseBodyDataActivities build(java.util.Map<String, ?> map) throws Exception {
            QueryExperimentTaskResponseBodyDataActivities self = new QueryExperimentTaskResponseBodyDataActivities();
            return TeaModel.build(map, self);
        }

        public QueryExperimentTaskResponseBodyDataActivities setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public QueryExperimentTaskResponseBodyDataActivities setActivityTaskId(String activityTaskId) {
            this.activityTaskId = activityTaskId;
            return this;
        }
        public String getActivityTaskId() {
            return this.activityTaskId;
        }

        public QueryExperimentTaskResponseBodyDataActivities setApps(java.util.List<QueryExperimentTaskResponseBodyDataActivitiesApps> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<QueryExperimentTaskResponseBodyDataActivitiesApps> getApps() {
            return this.apps;
        }

        public QueryExperimentTaskResponseBodyDataActivities setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryExperimentTaskResponseBodyDataActivities setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryExperimentTaskResponseBodyDataActivities setExecutableAppCode(String executableAppCode) {
            this.executableAppCode = executableAppCode;
            return this;
        }
        public String getExecutableAppCode() {
            return this.executableAppCode;
        }

        public QueryExperimentTaskResponseBodyDataActivities setExperimentTaskId(String experimentTaskId) {
            this.experimentTaskId = experimentTaskId;
            return this;
        }
        public String getExperimentTaskId() {
            return this.experimentTaskId;
        }

        public QueryExperimentTaskResponseBodyDataActivities setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public QueryExperimentTaskResponseBodyDataActivities setMiniAppCode(String miniAppCode) {
            this.miniAppCode = miniAppCode;
            return this;
        }
        public String getMiniAppCode() {
            return this.miniAppCode;
        }

        public QueryExperimentTaskResponseBodyDataActivities setMiniAppName(String miniAppName) {
            this.miniAppName = miniAppName;
            return this;
        }
        public String getMiniAppName() {
            return this.miniAppName;
        }

        public QueryExperimentTaskResponseBodyDataActivities setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public QueryExperimentTaskResponseBodyDataActivities setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public QueryExperimentTaskResponseBodyDataActivities setRetryable(Boolean retryable) {
            this.retryable = retryable;
            return this;
        }
        public Boolean getRetryable() {
            return this.retryable;
        }

        public QueryExperimentTaskResponseBodyDataActivities setRunParam(QueryExperimentTaskResponseBodyDataActivitiesRunParam runParam) {
            this.runParam = runParam;
            return this;
        }
        public QueryExperimentTaskResponseBodyDataActivitiesRunParam getRunParam() {
            return this.runParam;
        }

        public QueryExperimentTaskResponseBodyDataActivities setRunResult(String runResult) {
            this.runResult = runResult;
            return this;
        }
        public String getRunResult() {
            return this.runResult;
        }

        public QueryExperimentTaskResponseBodyDataActivities setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryExperimentTaskResponseBodyDataActivities setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryExperimentTaskResponseBodyDataActivities setUserCheckState(String userCheckState) {
            this.userCheckState = userCheckState;
            return this;
        }
        public String getUserCheckState() {
            return this.userCheckState;
        }

    }

    public static class QueryExperimentTaskResponseBodyDataCreatorSts extends TeaModel {
        @NameInMap("accessKeyId")
        public String accessKeyId;

        @NameInMap("parentId")
        public String parentId;

        @NameInMap("roleId")
        public String roleId;

        @NameInMap("userId")
        public String userId;

        public static QueryExperimentTaskResponseBodyDataCreatorSts build(java.util.Map<String, ?> map) throws Exception {
            QueryExperimentTaskResponseBodyDataCreatorSts self = new QueryExperimentTaskResponseBodyDataCreatorSts();
            return TeaModel.build(map, self);
        }

        public QueryExperimentTaskResponseBodyDataCreatorSts setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public QueryExperimentTaskResponseBodyDataCreatorSts setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public QueryExperimentTaskResponseBodyDataCreatorSts setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public QueryExperimentTaskResponseBodyDataCreatorSts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryExperimentTaskResponseBodyDataCreator extends TeaModel {
        @NameInMap("betaFlag")
        public Integer betaFlag;

        @NameInMap("grayEnable")
        public Boolean grayEnable;

        @NameInMap("isAdmin")
        public Boolean isAdmin;

        @NameInMap("isAliAccount")
        public Boolean isAliAccount;

        @NameInMap("mfaPresent")
        public Boolean mfaPresent;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("outerId")
        public Integer outerId;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("secureTransport")
        public Boolean secureTransport;

        @NameInMap("sourceIp")
        public String sourceIp;

        @NameInMap("sts")
        public QueryExperimentTaskResponseBodyDataCreatorSts sts;

        @NameInMap("stsRoleName")
        public String stsRoleName;

        @NameInMap("stsUserId")
        public String stsUserId;

        @NameInMap("subUserId")
        public String subUserId;

        @NameInMap("userId")
        public String userId;

        @NameInMap("userName")
        public String userName;

        @NameInMap("userNick")
        public String userNick;

        public static QueryExperimentTaskResponseBodyDataCreator build(java.util.Map<String, ?> map) throws Exception {
            QueryExperimentTaskResponseBodyDataCreator self = new QueryExperimentTaskResponseBodyDataCreator();
            return TeaModel.build(map, self);
        }

        public QueryExperimentTaskResponseBodyDataCreator setBetaFlag(Integer betaFlag) {
            this.betaFlag = betaFlag;
            return this;
        }
        public Integer getBetaFlag() {
            return this.betaFlag;
        }

        public QueryExperimentTaskResponseBodyDataCreator setGrayEnable(Boolean grayEnable) {
            this.grayEnable = grayEnable;
            return this;
        }
        public Boolean getGrayEnable() {
            return this.grayEnable;
        }

        public QueryExperimentTaskResponseBodyDataCreator setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public QueryExperimentTaskResponseBodyDataCreator setIsAliAccount(Boolean isAliAccount) {
            this.isAliAccount = isAliAccount;
            return this;
        }
        public Boolean getIsAliAccount() {
            return this.isAliAccount;
        }

        public QueryExperimentTaskResponseBodyDataCreator setMfaPresent(Boolean mfaPresent) {
            this.mfaPresent = mfaPresent;
            return this;
        }
        public Boolean getMfaPresent() {
            return this.mfaPresent;
        }

        public QueryExperimentTaskResponseBodyDataCreator setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryExperimentTaskResponseBodyDataCreator setOuterId(Integer outerId) {
            this.outerId = outerId;
            return this;
        }
        public Integer getOuterId() {
            return this.outerId;
        }

        public QueryExperimentTaskResponseBodyDataCreator setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryExperimentTaskResponseBodyDataCreator setSecureTransport(Boolean secureTransport) {
            this.secureTransport = secureTransport;
            return this;
        }
        public Boolean getSecureTransport() {
            return this.secureTransport;
        }

        public QueryExperimentTaskResponseBodyDataCreator setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public QueryExperimentTaskResponseBodyDataCreator setSts(QueryExperimentTaskResponseBodyDataCreatorSts sts) {
            this.sts = sts;
            return this;
        }
        public QueryExperimentTaskResponseBodyDataCreatorSts getSts() {
            return this.sts;
        }

        public QueryExperimentTaskResponseBodyDataCreator setStsRoleName(String stsRoleName) {
            this.stsRoleName = stsRoleName;
            return this;
        }
        public String getStsRoleName() {
            return this.stsRoleName;
        }

        public QueryExperimentTaskResponseBodyDataCreator setStsUserId(String stsUserId) {
            this.stsUserId = stsUserId;
            return this;
        }
        public String getStsUserId() {
            return this.stsUserId;
        }

        public QueryExperimentTaskResponseBodyDataCreator setSubUserId(String subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public String getSubUserId() {
            return this.subUserId;
        }

        public QueryExperimentTaskResponseBodyDataCreator setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryExperimentTaskResponseBodyDataCreator setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public QueryExperimentTaskResponseBodyDataCreator setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

    }

    public static class QueryExperimentTaskResponseBodyDataExtInfoSchedulerConfig extends TeaModel {
        @NameInMap("CronExpression")
        public String cronExpression;

        @NameInMap("FixedTime")
        public Long fixedTime;

        public static QueryExperimentTaskResponseBodyDataExtInfoSchedulerConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryExperimentTaskResponseBodyDataExtInfoSchedulerConfig self = new QueryExperimentTaskResponseBodyDataExtInfoSchedulerConfig();
            return TeaModel.build(map, self);
        }

        public QueryExperimentTaskResponseBodyDataExtInfoSchedulerConfig setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public QueryExperimentTaskResponseBodyDataExtInfoSchedulerConfig setFixedTime(Long fixedTime) {
            this.fixedTime = fixedTime;
            return this;
        }
        public Long getFixedTime() {
            return this.fixedTime;
        }

    }

    public static class QueryExperimentTaskResponseBodyDataExtInfo extends TeaModel {
        @NameInMap("schedulerConfig")
        public QueryExperimentTaskResponseBodyDataExtInfoSchedulerConfig schedulerConfig;

        public static QueryExperimentTaskResponseBodyDataExtInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryExperimentTaskResponseBodyDataExtInfo self = new QueryExperimentTaskResponseBodyDataExtInfo();
            return TeaModel.build(map, self);
        }

        public QueryExperimentTaskResponseBodyDataExtInfo setSchedulerConfig(QueryExperimentTaskResponseBodyDataExtInfoSchedulerConfig schedulerConfig) {
            this.schedulerConfig = schedulerConfig;
            return this;
        }
        public QueryExperimentTaskResponseBodyDataExtInfoSchedulerConfig getSchedulerConfig() {
            return this.schedulerConfig;
        }

    }

    public static class QueryExperimentTaskResponseBodyData extends TeaModel {
        @NameInMap("activities")
        public java.util.List<QueryExperimentTaskResponseBodyDataActivities> activities;

        @NameInMap("aoneApps")
        public java.util.List<String> aoneApps;

        @NameInMap("creator")
        public QueryExperimentTaskResponseBodyDataCreator creator;

        @NameInMap("currentPhase")
        public String currentPhase;

        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("experimentId")
        public String experimentId;

        @NameInMap("experimentName")
        public String experimentName;

        @NameInMap("extInfo")
        public QueryExperimentTaskResponseBodyDataExtInfo extInfo;

        @NameInMap("feedbackStatus")
        public Integer feedbackStatus;

        @NameInMap("isJvm")
        public Boolean isJvm;

        @NameInMap("message")
        public String message;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("permission")
        public Integer permission;

        @NameInMap("result")
        public String result;

        @NameInMap("source")
        public Integer source;

        @NameInMap("startTime")
        public Long startTime;

        @NameInMap("state")
        public String state;

        @NameInMap("taskId")
        public String taskId;

        public static QueryExperimentTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryExperimentTaskResponseBodyData self = new QueryExperimentTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryExperimentTaskResponseBodyData setActivities(java.util.List<QueryExperimentTaskResponseBodyDataActivities> activities) {
            this.activities = activities;
            return this;
        }
        public java.util.List<QueryExperimentTaskResponseBodyDataActivities> getActivities() {
            return this.activities;
        }

        public QueryExperimentTaskResponseBodyData setAoneApps(java.util.List<String> aoneApps) {
            this.aoneApps = aoneApps;
            return this;
        }
        public java.util.List<String> getAoneApps() {
            return this.aoneApps;
        }

        public QueryExperimentTaskResponseBodyData setCreator(QueryExperimentTaskResponseBodyDataCreator creator) {
            this.creator = creator;
            return this;
        }
        public QueryExperimentTaskResponseBodyDataCreator getCreator() {
            return this.creator;
        }

        public QueryExperimentTaskResponseBodyData setCurrentPhase(String currentPhase) {
            this.currentPhase = currentPhase;
            return this;
        }
        public String getCurrentPhase() {
            return this.currentPhase;
        }

        public QueryExperimentTaskResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryExperimentTaskResponseBodyData setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public QueryExperimentTaskResponseBodyData setExperimentName(String experimentName) {
            this.experimentName = experimentName;
            return this;
        }
        public String getExperimentName() {
            return this.experimentName;
        }

        public QueryExperimentTaskResponseBodyData setExtInfo(QueryExperimentTaskResponseBodyDataExtInfo extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public QueryExperimentTaskResponseBodyDataExtInfo getExtInfo() {
            return this.extInfo;
        }

        public QueryExperimentTaskResponseBodyData setFeedbackStatus(Integer feedbackStatus) {
            this.feedbackStatus = feedbackStatus;
            return this;
        }
        public Integer getFeedbackStatus() {
            return this.feedbackStatus;
        }

        public QueryExperimentTaskResponseBodyData setIsJvm(Boolean isJvm) {
            this.isJvm = isJvm;
            return this;
        }
        public Boolean getIsJvm() {
            return this.isJvm;
        }

        public QueryExperimentTaskResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryExperimentTaskResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryExperimentTaskResponseBodyData setPermission(Integer permission) {
            this.permission = permission;
            return this;
        }
        public Integer getPermission() {
            return this.permission;
        }

        public QueryExperimentTaskResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public QueryExperimentTaskResponseBodyData setSource(Integer source) {
            this.source = source;
            return this;
        }
        public Integer getSource() {
            return this.source;
        }

        public QueryExperimentTaskResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryExperimentTaskResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryExperimentTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}

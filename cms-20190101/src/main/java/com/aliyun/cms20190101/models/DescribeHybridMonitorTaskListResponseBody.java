// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorTaskListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("TaskList")
    public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskList> taskList;

    @NameInMap("Total")
    public Integer total;

    public static DescribeHybridMonitorTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridMonitorTaskListResponseBody self = new DescribeHybridMonitorTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridMonitorTaskListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeHybridMonitorTaskListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeHybridMonitorTaskListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHybridMonitorTaskListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHybridMonitorTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHybridMonitorTaskListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeHybridMonitorTaskListResponseBody setTaskList(java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskList> taskList) {
        this.taskList = taskList;
        return this;
    }
    public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskList> getTaskList() {
        return this.taskList;
    }

    public DescribeHybridMonitorTaskListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeHybridMonitorTaskListResponseBodyTaskListAttachLabels extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static DescribeHybridMonitorTaskListResponseBodyTaskListAttachLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorTaskListResponseBodyTaskListAttachLabels self = new DescribeHybridMonitorTaskListResponseBodyTaskListAttachLabels();
            return TeaModel.build(map, self);
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListAttachLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListAttachLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeHybridMonitorTaskListResponseBodyTaskListMatchExpress extends TeaModel {
        @NameInMap("Function")
        public String function;

        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static DescribeHybridMonitorTaskListResponseBodyTaskListMatchExpress build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorTaskListResponseBodyTaskListMatchExpress self = new DescribeHybridMonitorTaskListResponseBodyTaskListMatchExpress();
            return TeaModel.build(map, self);
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListMatchExpress setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListMatchExpress setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListMatchExpress setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeHybridMonitorTaskListResponseBodyTaskList extends TeaModel {
        @NameInMap("AttachLabels")
        public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListAttachLabels> attachLabels;

        @NameInMap("CollectInterval")
        public Integer collectInterval;

        @NameInMap("CollectTargetEndpoint")
        public String collectTargetEndpoint;

        @NameInMap("CollectTargetPath")
        public String collectTargetPath;

        @NameInMap("CollectTargetType")
        public String collectTargetType;

        @NameInMap("CollectTimout")
        public Integer collectTimout;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Instances")
        public java.util.List<String> instances;

        @NameInMap("LogFilePath")
        public String logFilePath;

        @NameInMap("LogProcess")
        public String logProcess;

        @NameInMap("LogSample")
        public String logSample;

        @NameInMap("LogSplit")
        public String logSplit;

        @NameInMap("MatchExpress")
        public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListMatchExpress> matchExpress;

        @NameInMap("MatchExpressRelation")
        public String matchExpressRelation;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("SLSProcess")
        public String SLSProcess;

        @NameInMap("TargetUserId")
        public String targetUserId;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("UploadRegion")
        public String uploadRegion;

        @NameInMap("YARMConfig")
        public String YARMConfig;

        public static DescribeHybridMonitorTaskListResponseBodyTaskList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorTaskListResponseBodyTaskList self = new DescribeHybridMonitorTaskListResponseBodyTaskList();
            return TeaModel.build(map, self);
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setAttachLabels(java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListAttachLabels> attachLabels) {
            this.attachLabels = attachLabels;
            return this;
        }
        public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListAttachLabels> getAttachLabels() {
            return this.attachLabels;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setCollectInterval(Integer collectInterval) {
            this.collectInterval = collectInterval;
            return this;
        }
        public Integer getCollectInterval() {
            return this.collectInterval;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setCollectTargetEndpoint(String collectTargetEndpoint) {
            this.collectTargetEndpoint = collectTargetEndpoint;
            return this;
        }
        public String getCollectTargetEndpoint() {
            return this.collectTargetEndpoint;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setCollectTargetPath(String collectTargetPath) {
            this.collectTargetPath = collectTargetPath;
            return this;
        }
        public String getCollectTargetPath() {
            return this.collectTargetPath;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setCollectTargetType(String collectTargetType) {
            this.collectTargetType = collectTargetType;
            return this;
        }
        public String getCollectTargetType() {
            return this.collectTargetType;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setCollectTimout(Integer collectTimout) {
            this.collectTimout = collectTimout;
            return this;
        }
        public Integer getCollectTimout() {
            return this.collectTimout;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setInstances(java.util.List<String> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<String> getInstances() {
            return this.instances;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setLogFilePath(String logFilePath) {
            this.logFilePath = logFilePath;
            return this;
        }
        public String getLogFilePath() {
            return this.logFilePath;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setLogProcess(String logProcess) {
            this.logProcess = logProcess;
            return this;
        }
        public String getLogProcess() {
            return this.logProcess;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setLogSample(String logSample) {
            this.logSample = logSample;
            return this;
        }
        public String getLogSample() {
            return this.logSample;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setLogSplit(String logSplit) {
            this.logSplit = logSplit;
            return this;
        }
        public String getLogSplit() {
            return this.logSplit;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setMatchExpress(java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListMatchExpress> matchExpress) {
            this.matchExpress = matchExpress;
            return this;
        }
        public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListMatchExpress> getMatchExpress() {
            return this.matchExpress;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setMatchExpressRelation(String matchExpressRelation) {
            this.matchExpressRelation = matchExpressRelation;
            return this;
        }
        public String getMatchExpressRelation() {
            return this.matchExpressRelation;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setSLSProcess(String SLSProcess) {
            this.SLSProcess = SLSProcess;
            return this;
        }
        public String getSLSProcess() {
            return this.SLSProcess;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setTargetUserId(String targetUserId) {
            this.targetUserId = targetUserId;
            return this;
        }
        public String getTargetUserId() {
            return this.targetUserId;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setUploadRegion(String uploadRegion) {
            this.uploadRegion = uploadRegion;
            return this;
        }
        public String getUploadRegion() {
            return this.uploadRegion;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setYARMConfig(String YARMConfig) {
            this.YARMConfig = YARMConfig;
            return this;
        }
        public String getYARMConfig() {
            return this.YARMConfig;
        }

    }

}

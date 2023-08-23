// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class SaveTerminalLogRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("CallId")
    public String callId;

    @NameInMap("Content")
    public String content;

    @NameInMap("DataType")
    public Integer dataType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("MethodName")
    public String methodName;

    @NameInMap("Status")
    public String status;

    @NameInMap("UniqueRequestId")
    public String uniqueRequestId;

    public static SaveTerminalLogRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveTerminalLogRequest self = new SaveTerminalLogRequest();
        return TeaModel.build(map, self);
    }

    public SaveTerminalLogRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SaveTerminalLogRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public SaveTerminalLogRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SaveTerminalLogRequest setDataType(Integer dataType) {
        this.dataType = dataType;
        return this;
    }
    public Integer getDataType() {
        return this.dataType;
    }

    public SaveTerminalLogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SaveTerminalLogRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SaveTerminalLogRequest setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public SaveTerminalLogRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SaveTerminalLogRequest setUniqueRequestId(String uniqueRequestId) {
        this.uniqueRequestId = uniqueRequestId;
        return this;
    }
    public String getUniqueRequestId() {
        return this.uniqueRequestId;
    }

}

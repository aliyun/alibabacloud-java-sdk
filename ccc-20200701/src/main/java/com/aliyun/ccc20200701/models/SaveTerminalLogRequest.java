// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SaveTerminalLogRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("CallId")
    public String callId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("DataType")
    public Integer dataType;

    @NameInMap("Content")
    public String content;

    @NameInMap("Status")
    public String status;

    @NameInMap("UniqueRequestId")
    public String uniqueRequestId;

    @NameInMap("MethodName")
    public String methodName;

    public static SaveTerminalLogRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveTerminalLogRequest self = new SaveTerminalLogRequest();
        return TeaModel.build(map, self);
    }

    public SaveTerminalLogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SaveTerminalLogRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public SaveTerminalLogRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SaveTerminalLogRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SaveTerminalLogRequest setDataType(Integer dataType) {
        this.dataType = dataType;
        return this;
    }
    public Integer getDataType() {
        return this.dataType;
    }

    public SaveTerminalLogRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
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

    public SaveTerminalLogRequest setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

}

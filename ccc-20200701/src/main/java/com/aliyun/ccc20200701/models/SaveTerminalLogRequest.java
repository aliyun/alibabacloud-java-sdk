// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SaveTerminalLogRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CCCClient</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e13c9740-1e37-123b-21b6-00163e352f9</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DataType")
    public Integer dataType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job-b8b0ca63-330c-4e65-8ae3-9de2c7ce7683</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>TurnServerTest</p>
     */
    @NameInMap("MethodName")
    public String methodName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
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

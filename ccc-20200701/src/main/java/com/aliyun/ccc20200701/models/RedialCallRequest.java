// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RedialCallRequest extends TeaModel {
    /**
     * <p>Callee number.</p>
     * 
     * <strong>example:</strong>
     * <p>1318888****</p>
     */
    @NameInMap("Callee")
    public String callee;

    /**
     * <p>Caller number.</p>
     * 
     * <strong>example:</strong>
     * <p>0109810****</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>Unique ID provided by the agent endpoint to identify an agent Workbench.</p>
     * 
     * <strong>example:</strong>
     * <p>CCC-x.x.x.x-chrome102-bsdf911812c60f61e</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>Instance ID of the call center.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Call job ID. The job ID of the previous call used for redialing.</p>
     * 
     * <strong>example:</strong>
     * <p>job-6581536084722****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>Per-call data. It must not exceed 128 bytes and is primarily used for extension purposes. Ordinary customers do not need to pay attention to it.</p>
     * 
     * <strong>example:</strong>
     * <p>a=b</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>Timeout. If the call is not answered within the time specified by this parameter, it is automatically disconnected.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    /**
     * <p>User ID of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>samzhang@abc</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static RedialCallRequest build(java.util.Map<String, ?> map) throws Exception {
        RedialCallRequest self = new RedialCallRequest();
        return TeaModel.build(map, self);
    }

    public RedialCallRequest setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

    public RedialCallRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public RedialCallRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public RedialCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RedialCallRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public RedialCallRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public RedialCallRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public RedialCallRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

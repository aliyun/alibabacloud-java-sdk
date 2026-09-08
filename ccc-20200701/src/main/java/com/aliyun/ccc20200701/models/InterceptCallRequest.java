// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class InterceptCallRequest extends TeaModel {
    /**
     * <p>Device ID. This parameter is meaningless and can be filled in with any value.</p>
     * 
     * <strong>example:</strong>
     * <p>device</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>实例 ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The agent ID that is forcibly disconnected.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent2@ccc-test</p>
     */
    @NameInMap("InterceptedUserId")
    public String interceptedUserId;

    /**
     * <p>The call ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job-6538214103685****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>强拆超时时间，经过指定的时间强拆仍未成功，则取消强拆，正常情况下，强拆操作会马上成功，设置超时时间是为了防止异常发生，此字段选填，默认 30，单位秒。</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    /**
     * <p>发起强拆的坐席。</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static InterceptCallRequest build(java.util.Map<String, ?> map) throws Exception {
        InterceptCallRequest self = new InterceptCallRequest();
        return TeaModel.build(map, self);
    }

    public InterceptCallRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public InterceptCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InterceptCallRequest setInterceptedUserId(String interceptedUserId) {
        this.interceptedUserId = interceptedUserId;
        return this;
    }
    public String getInterceptedUserId() {
        return this.interceptedUserId;
    }

    public InterceptCallRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public InterceptCallRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public InterceptCallRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

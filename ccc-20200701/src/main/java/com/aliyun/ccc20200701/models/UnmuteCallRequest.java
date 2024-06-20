// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UnmuteCallRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ch:user:1390501****-&gt;8032****:1609138902226:job-6538214103685****</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <strong>example:</strong>
     * <p>device</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>job-6538214103685****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static UnmuteCallRequest build(java.util.Map<String, ?> map) throws Exception {
        UnmuteCallRequest self = new UnmuteCallRequest();
        return TeaModel.build(map, self);
    }

    public UnmuteCallRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public UnmuteCallRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public UnmuteCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UnmuteCallRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UnmuteCallRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

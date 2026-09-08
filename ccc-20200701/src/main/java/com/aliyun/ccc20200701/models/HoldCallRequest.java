// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class HoldCallRequest extends TeaModel {
    /**
     * <p>Channel ID to be held.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ch:customer:010123****-&gt;1318888****:1609255715825:job-6582589278232****</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>A unique ID provided by the agent endpoint to represent an agent workbench. An agent can have multiple workbenches of different types, such as browser, iOS, or Android, but only one can be active at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>ACC-YUNBS-1.0.10-****</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Call job ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job-6582589278232****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>Name of the hold music. This parameter is optional and defaults to empty.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Music")
    public String music;

    /**
     * <p>Agent ID.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static HoldCallRequest build(java.util.Map<String, ?> map) throws Exception {
        HoldCallRequest self = new HoldCallRequest();
        return TeaModel.build(map, self);
    }

    public HoldCallRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public HoldCallRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public HoldCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public HoldCallRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public HoldCallRequest setMusic(String music) {
        this.music = music;
        return this;
    }
    public String getMusic() {
        return this.music;
    }

    public HoldCallRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

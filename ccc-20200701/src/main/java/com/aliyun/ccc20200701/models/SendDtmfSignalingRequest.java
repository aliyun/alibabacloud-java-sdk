// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SendDtmfSignalingRequest extends TeaModel {
    /**
     * <p>The channel ID of the call to which DTMF tones are to be sent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ch:customer:0108989****-&gt;1318888****:1609234221870:job-6573574060089****</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>Device ID. This parameter is meaningless and can be filled with any value.</p>
     * 
     * <strong>example:</strong>
     * <p>device</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>DTMF key information, which refers to the keys on a dial pad, including 0–9, \*, and #.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Dtmf")
    public String dtmf;

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
     * <p>The call ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job-6573574060089****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The agent ID that sends DTMF.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static SendDtmfSignalingRequest build(java.util.Map<String, ?> map) throws Exception {
        SendDtmfSignalingRequest self = new SendDtmfSignalingRequest();
        return TeaModel.build(map, self);
    }

    public SendDtmfSignalingRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public SendDtmfSignalingRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public SendDtmfSignalingRequest setDtmf(String dtmf) {
        this.dtmf = dtmf;
        return this;
    }
    public String getDtmf() {
        return this.dtmf;
    }

    public SendDtmfSignalingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SendDtmfSignalingRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SendDtmfSignalingRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

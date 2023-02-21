// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class BridgeRtcCallRequest extends TeaModel {
    @NameInMap("Callee")
    public String callee;

    @NameInMap("Caller")
    public String caller;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Provider")
    public String provider;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("VideoEnabled")
    public Boolean videoEnabled;

    public static BridgeRtcCallRequest build(java.util.Map<String, ?> map) throws Exception {
        BridgeRtcCallRequest self = new BridgeRtcCallRequest();
        return TeaModel.build(map, self);
    }

    public BridgeRtcCallRequest setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

    public BridgeRtcCallRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public BridgeRtcCallRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public BridgeRtcCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BridgeRtcCallRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public BridgeRtcCallRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public BridgeRtcCallRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public BridgeRtcCallRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public BridgeRtcCallRequest setVideoEnabled(Boolean videoEnabled) {
        this.videoEnabled = videoEnabled;
        return this;
    }
    public Boolean getVideoEnabled() {
        return this.videoEnabled;
    }

}

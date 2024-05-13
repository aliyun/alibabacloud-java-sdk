// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ReadyForServiceRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OutboundScenario")
    public Boolean outboundScenario;

    @NameInMap("UserId")
    public String userId;

    public static ReadyForServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReadyForServiceRequest self = new ReadyForServiceRequest();
        return TeaModel.build(map, self);
    }

    public ReadyForServiceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ReadyForServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReadyForServiceRequest setOutboundScenario(Boolean outboundScenario) {
        this.outboundScenario = outboundScenario;
        return this;
    }
    public Boolean getOutboundScenario() {
        return this.outboundScenario;
    }

    public ReadyForServiceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

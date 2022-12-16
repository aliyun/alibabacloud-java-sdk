// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayServiceTrafficPolicyRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   **zh**: Chinese. This is the default value.
    // *   **en**: English.
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the gateway.
    @NameInMap("GatewayId")
    public Long gatewayId;

    // The traffic policy of the service.
    @NameInMap("GatewayTrafficPolicy")
    public TrafficPolicy gatewayTrafficPolicy;

    // The unique ID of the gateway.
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    // The ID of the service.
    @NameInMap("ServiceId")
    public Long serviceId;

    public static UpdateGatewayServiceTrafficPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayServiceTrafficPolicyRequest self = new UpdateGatewayServiceTrafficPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayServiceTrafficPolicyRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayServiceTrafficPolicyRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayServiceTrafficPolicyRequest setGatewayTrafficPolicy(TrafficPolicy gatewayTrafficPolicy) {
        this.gatewayTrafficPolicy = gatewayTrafficPolicy;
        return this;
    }
    public TrafficPolicy getGatewayTrafficPolicy() {
        return this.gatewayTrafficPolicy;
    }

    public UpdateGatewayServiceTrafficPolicyRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayServiceTrafficPolicyRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}

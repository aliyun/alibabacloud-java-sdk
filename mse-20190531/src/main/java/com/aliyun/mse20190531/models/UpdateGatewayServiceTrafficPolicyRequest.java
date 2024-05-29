// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayServiceTrafficPolicyRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   **zh-CN** (default): Chinese</p>
     * <p>*   **en-US**: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the gateway.</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>The traffic policy of the gateway.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GatewayTrafficPolicy")
    public TrafficPolicy gatewayTrafficPolicy;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the service.</p>
     */
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

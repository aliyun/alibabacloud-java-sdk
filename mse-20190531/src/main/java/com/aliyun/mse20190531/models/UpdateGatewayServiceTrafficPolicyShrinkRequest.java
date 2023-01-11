// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayServiceTrafficPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   **zh-CN**: Chinese. This is the default value.</p>
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
     * <p>The traffic policy of the service.</p>
     */
    @NameInMap("GatewayTrafficPolicy")
    public String gatewayTrafficPolicyShrink;

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

    public static UpdateGatewayServiceTrafficPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayServiceTrafficPolicyShrinkRequest self = new UpdateGatewayServiceTrafficPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayServiceTrafficPolicyShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayServiceTrafficPolicyShrinkRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayServiceTrafficPolicyShrinkRequest setGatewayTrafficPolicyShrink(String gatewayTrafficPolicyShrink) {
        this.gatewayTrafficPolicyShrink = gatewayTrafficPolicyShrink;
        return this;
    }
    public String getGatewayTrafficPolicyShrink() {
        return this.gatewayTrafficPolicyShrink;
    }

    public UpdateGatewayServiceTrafficPolicyShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayServiceTrafficPolicyShrinkRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}

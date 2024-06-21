// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayServiceTrafficPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh-CN</strong> (default): Chinese</li>
     * <li><strong>en-US</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>429</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>The traffic policy of the gateway.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GatewayTrafficPolicy")
    public String gatewayTrafficPolicyShrink;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-75c5036c083e4f89ba8ef9fafff2e902</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>411</p>
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

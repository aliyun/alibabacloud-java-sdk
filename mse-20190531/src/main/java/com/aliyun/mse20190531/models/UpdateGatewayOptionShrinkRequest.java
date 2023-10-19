// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayOptionShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the gateway.</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>The detailed configurations of the gateway.</p>
     * <br>
     * <p>*   **TraceDetails**: the sampling description of Managed Service for OpenTelemetry. Content: TraceEnabled indicates whether Managed Service for OpenTelemetry is activated. Sample indicates the sampling rate of Managed Service for OpenTelemetry.</p>
     * <p>*   **LogConfigDetails**: the description of Simple Log Service. Content: LogEnabled indicates whether Simple Log Service is activated. ProjectName indicates the Simple Log Service project to which logs are delivered. LogStoreName indicates the name of the Logstore.</p>
     * <p>*   **EnableHardwareAcceleration**: indicates whether hardware acceleration is enabled.</p>
     * <p>*   **DisableHttp2Alpn**: indicates whether the HTTP/2 protocol is disabled.</p>
     * <p>*   **EnableWaf**: indicates whether Web Application Firewall (WAF) is enabled.</p>
     */
    @NameInMap("GatewayOption")
    public String gatewayOptionShrink;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    public static UpdateGatewayOptionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayOptionShrinkRequest self = new UpdateGatewayOptionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayOptionShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayOptionShrinkRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayOptionShrinkRequest setGatewayOptionShrink(String gatewayOptionShrink) {
        this.gatewayOptionShrink = gatewayOptionShrink;
        return this;
    }
    public String getGatewayOptionShrink() {
        return this.gatewayOptionShrink;
    }

    public UpdateGatewayOptionShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

}

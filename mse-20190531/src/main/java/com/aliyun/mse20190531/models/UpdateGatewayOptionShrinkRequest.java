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
     * <p>*   **TraceDetails**: the sampling description of Tracing Analysis. Content: TraceEnabled specifies whether to activate Tracing Analysis. Sample specifies the sampling rate of Tracing Analysis.</p>
     * <p>*   **LogConfigDetails**: the description of Log Service. Content: LogEnabled specifies whether to activate Log Service. ProjectName specifies the Log Service project to which logs are delivered. LogStoreName specifies the name of the Logstore.</p>
     * <p>*   **EnableHardwareAcceleration**: specifies whether to enable hardware acceleration.</p>
     * <p>*   **DisableHttp2Alpn**: specifies whether to disable the HTTP/2 protocol.</p>
     * <p>*   **EnableWaf**: specifies whether to activate Web Application Firewall (WAF).</p>
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

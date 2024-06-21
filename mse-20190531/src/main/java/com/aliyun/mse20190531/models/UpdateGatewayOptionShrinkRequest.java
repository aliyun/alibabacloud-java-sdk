// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayOptionShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
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
     * <p>421</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>The detailed configurations of the gateway.</p>
     * <ul>
     * <li><strong>TraceDetails</strong>: the sampling description of Managed Service for OpenTelemetry. Content: TraceEnabled indicates whether Managed Service for OpenTelemetry is activated. Sample indicates the sampling rate of Managed Service for OpenTelemetry.</li>
     * <li><strong>LogConfigDetails</strong>: the description of Simple Log Service. Content: LogEnabled indicates whether Simple Log Service is activated. ProjectName indicates the Simple Log Service project to which logs are delivered. LogStoreName indicates the name of the Logstore.</li>
     * <li><strong>EnableHardwareAcceleration</strong>: indicates whether hardware acceleration is enabled.</li>
     * <li><strong>DisableHttp2Alpn</strong>: indicates whether the HTTP/2 protocol is disabled.</li>
     * <li><strong>EnableWaf</strong>: indicates whether Web Application Firewall (WAF) is enabled.</li>
     * </ul>
     */
    @NameInMap("GatewayOption")
    public String gatewayOptionShrink;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-83b0ddb569434f82b9fe8e4c60c4****</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayConfigRequest extends TeaModel {
    /**
     * <p>The language in which you want to display the results. Valid values: zh (default): Chinese. en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The configuration name of the parameter. Valid values:</p>
     * <ul>
     * <li><p>EnableHttp2</p>
     * </li>
     * <li><p>DownstreamIdleTime</p>
     * </li>
     * <li><p>PreserveHeaderFormat</p>
     * </li>
     * <li><p>UpstreamIdleTimeout</p>
     * </li>
     * <li><p>EnableXffTrustedCidrs</p>
     * </li>
     * <li><p>EnableK8sSourceWorkloadFilter</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EnableK8sSourceWorkloadFilter</p>
     */
    @NameInMap("ConfigName")
    public String configName;

    /**
     * <p>The configuration value of the parameter. Examples:</p>
     * <ul>
     * <li>EnableHttp2</li>
     * </ul>
     * <pre><code>true / false
     * </code></pre>
     * <ul>
     * <li>DownstreamIdleTime</li>
     * </ul>
     * <pre><code>15
     * </code></pre>
     * <ul>
     * <li>PreserveHeaderFormat</li>
     * </ul>
     * <pre><code>true / false
     * </code></pre>
     * <ul>
     * <li>UpstreamIdleTimeout</li>
     * </ul>
     * <pre><code>60
     * </code></pre>
     * <ul>
     * <li>EnableXffTrustedCidrs</li>
     * </ul>
     * <pre><code class="language-json">{&quot;enable&quot;:true,&quot;ipListContent&quot;:&quot;192.168.1.0/24
     * 2.2.2.2&quot;}
     * </code></pre>
     * <ul>
     * <li>EnableK8sSourceWorkloadFilter</li>
     * </ul>
     * <pre><code class="language-json">    
     * {&quot;enable&quot;:true,&quot;filterOpt&quot;:&quot;EQUAL&quot;,&quot;labelKey&quot;:&quot;key&quot;,&quot;labelValue&quot;:&quot;value&quot;}
     * </code></pre>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enable&quot;:true,&quot;filterOpt&quot;:&quot;EQUAL&quot;,&quot;labelKey&quot;:&quot;key&quot;,&quot;labelValue&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("ConfigValue")
    public String configValue;

    /**
     * <p>The unique ID of the gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-b525dc1adf3c486ab96224a6346*****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    public static UpdateGatewayConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayConfigRequest self = new UpdateGatewayConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayConfigRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public UpdateGatewayConfigRequest setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public UpdateGatewayConfigRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

}

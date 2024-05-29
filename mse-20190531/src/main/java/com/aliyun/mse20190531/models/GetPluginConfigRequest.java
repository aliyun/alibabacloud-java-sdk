// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetPluginConfigRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>zh: Chinese en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The unique ID of the gateway.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the gateway plug-in.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PluginId")
    public Long pluginId;

    public static GetPluginConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPluginConfigRequest self = new GetPluginConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetPluginConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetPluginConfigRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public GetPluginConfigRequest setPluginId(Long pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public Long getPluginId() {
        return this.pluginId;
    }

}

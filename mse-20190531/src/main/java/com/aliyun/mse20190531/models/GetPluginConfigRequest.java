// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetPluginConfigRequest extends TeaModel {
    /**
     * <p>The name of the plug-in.</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The type.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The category of the plug-in.</p>
     * <br>
     * <p>0: custom</p>
     * <br>
     * <p>1: permission authorization</p>
     * <br>
     * <p>2: security protection</p>
     * <br>
     * <p>3: transmission protocol</p>
     * <br>
     * <p>4: traffic control</p>
     * <br>
     * <p>5: traffic observation</p>
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

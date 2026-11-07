// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreatePluginConfigShrinkRequest extends TeaModel {
    /**
     * <p>The language in which the response is displayed. Valid values:</p>
     * <ul>
     * <li>zh: Chinese. This is the default value.</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The plug-in configuration. The configuration content of a Wasm plug-in is in YAML format, and the configuration content of a Lua plug-in is Lua code.</p>
     * 
     * <strong>example:</strong>
     * <p>name: John
     * age: 18
     * friends:</p>
     * <ul>
     * <li>David</li>
     * <li>Anne</li>
     * </ul>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The application scope of the plug-in. Valid values:</p>
     * <ul>
     * <li>0: Global.</li>
     * <li>1: Route.</li>
     * <li>2: Domain name.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ConfigLevel")
    public Integer configLevel;

    /**
     * <p>Specifies whether to enable the plug-in.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The unique ID of the gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-ubuwqygbq4783gqb2y3f87q****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the gateway plug-in.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PluginId")
    public Long pluginId;

    /**
     * <p>The list of domain name IDs or route IDs. The specific type depends on the value of ConfigLevel.</p>
     */
    @NameInMap("ResourceIdList")
    public String resourceIdListShrink;

    public static CreatePluginConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePluginConfigShrinkRequest self = new CreatePluginConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePluginConfigShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreatePluginConfigShrinkRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreatePluginConfigShrinkRequest setConfigLevel(Integer configLevel) {
        this.configLevel = configLevel;
        return this;
    }
    public Integer getConfigLevel() {
        return this.configLevel;
    }

    public CreatePluginConfigShrinkRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreatePluginConfigShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public CreatePluginConfigShrinkRequest setPluginId(Long pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public Long getPluginId() {
        return this.pluginId;
    }

    public CreatePluginConfigShrinkRequest setResourceIdListShrink(String resourceIdListShrink) {
        this.resourceIdListShrink = resourceIdListShrink;
        return this;
    }
    public String getResourceIdListShrink() {
        return this.resourceIdListShrink;
    }

}

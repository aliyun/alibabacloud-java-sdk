// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdatePluginConfigShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>zh: Chinese en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The plug-in configuration. Configurations of WebAssembly plug-ins are in the YAML format, and configurations of Lua plug-ins are in the Lua code.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The application scope of the plug-in.</p>
     * <br>
     * <p>*   0: global</p>
     * <p>*   1: route</p>
     * <p>*   2: domain name</p>
     */
    @NameInMap("ConfigLevel")
    public Integer configLevel;

    /**
     * <p>Specifies whether to enable the plug-in.</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The ID of the gateway.</p>
     */
    @NameInMap("GatewayId")
    @Deprecated
    public Long gatewayId;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The creation time.</p>
     */
    @NameInMap("GmtCreate")
    @Deprecated
    public String gmtCreate;

    /**
     * <p>The update time.</p>
     */
    @NameInMap("GmtModified")
    @Deprecated
    public String gmtModified;

    /**
     * <p>The ID of the plug-in configuration.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The ID of the gateway plug-in.</p>
     */
    @NameInMap("PluginId")
    public Long pluginId;

    @NameInMap("ResourceIdList")
    public String resourceIdListShrink;

    public static UpdatePluginConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePluginConfigShrinkRequest self = new UpdatePluginConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePluginConfigShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdatePluginConfigShrinkRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdatePluginConfigShrinkRequest setConfigLevel(Integer configLevel) {
        this.configLevel = configLevel;
        return this;
    }
    public Integer getConfigLevel() {
        return this.configLevel;
    }

    public UpdatePluginConfigShrinkRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdatePluginConfigShrinkRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdatePluginConfigShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdatePluginConfigShrinkRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public UpdatePluginConfigShrinkRequest setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public UpdatePluginConfigShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdatePluginConfigShrinkRequest setPluginId(Long pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public Long getPluginId() {
        return this.pluginId;
    }

    public UpdatePluginConfigShrinkRequest setResourceIdListShrink(String resourceIdListShrink) {
        this.resourceIdListShrink = resourceIdListShrink;
        return this;
    }
    public String getResourceIdListShrink() {
        return this.resourceIdListShrink;
    }

}

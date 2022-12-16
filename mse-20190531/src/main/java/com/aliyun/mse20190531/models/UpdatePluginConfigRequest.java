// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdatePluginConfigRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // zh: Chinese en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The plug-in configuration.
    @NameInMap("Config")
    public String config;

    // The application scope of the plug-in.
    // 
    // *   0: global
    // *   1: domain names
    // *   2: routes
    @NameInMap("ConfigLevel")
    public Integer configLevel;

    // Specifies whether to enable the plug-in.
    @NameInMap("Enable")
    public Boolean enable;

    // The ID of the gateway.
    @NameInMap("GatewayId")
    public Long gatewayId;

    // The unique ID of the gateway.
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    // The creation time.
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // The update time.
    @NameInMap("GmtModified")
    public String gmtModified;

    // The ID of the plug-in configuration.
    @NameInMap("Id")
    public Long id;

    // The ID of the gateway plug-in.
    @NameInMap("PluginId")
    public Long pluginId;

    public static UpdatePluginConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePluginConfigRequest self = new UpdatePluginConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePluginConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdatePluginConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdatePluginConfigRequest setConfigLevel(Integer configLevel) {
        this.configLevel = configLevel;
        return this;
    }
    public Integer getConfigLevel() {
        return this.configLevel;
    }

    public UpdatePluginConfigRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdatePluginConfigRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdatePluginConfigRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdatePluginConfigRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public UpdatePluginConfigRequest setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public UpdatePluginConfigRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdatePluginConfigRequest setPluginId(Long pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public Long getPluginId() {
        return this.pluginId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdatePluginConfigRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <p>zh: Chinese en: English</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("Config")
    public String config;

    /**
     * <p>The application scope of the plug-in.</p>
     * <ul>
     * <li>0: global</li>
     * <li>1: route</li>
     * <li>2: domain name</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ConfigLevel")
    public Integer configLevel;

    /**
     * <p>Specifies whether to enable the plug-in.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GatewayId")
    @Deprecated
    public Long gatewayId;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-ubuwqygbq4783gqb2y3f87q****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1667309705000</p>
     */
    @NameInMap("GmtCreate")
    @Deprecated
    public String gmtCreate;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>1667309705000</p>
     */
    @NameInMap("GmtModified")
    @Deprecated
    public String gmtModified;

    /**
     * <p>The ID of the plug-in configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The ID of the gateway plug-in.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PluginId")
    public Long pluginId;

    @NameInMap("ResourceIdList")
    public java.util.List<Long> resourceIdList;

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

    @Deprecated
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

    @Deprecated
    public UpdatePluginConfigRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    @Deprecated
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

    public UpdatePluginConfigRequest setResourceIdList(java.util.List<Long> resourceIdList) {
        this.resourceIdList = resourceIdList;
        return this;
    }
    public java.util.List<Long> getResourceIdList() {
        return this.resourceIdList;
    }

}

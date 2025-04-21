// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreatePluginConfigRequest extends TeaModel {
    /**
     * <p>The language in which you want to display the results. Valid values: zh and en. zh indicates Chinese, which is the default value. en indicates English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("Config")
    public String config;

    /**
     * <p>The application scope of the plug-in. Valid values:</p>
     * <ul>
     * <li>0: global</li>
     * <li>1: route</li>
     * <li>2: domain name</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ConfigLevel")
    public Integer configLevel;

    /**
     * <p>Indicates whether the plug-in is enabled.</p>
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
     * <p>The gateway plug-in ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PluginId")
    public Long pluginId;

    /**
     * <p>The domain IDs or route IDs. They are distinguished based on ConfigLevel.</p>
     */
    @NameInMap("ResourceIdList")
    public java.util.List<Long> resourceIdList;

    public static CreatePluginConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePluginConfigRequest self = new CreatePluginConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreatePluginConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreatePluginConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreatePluginConfigRequest setConfigLevel(Integer configLevel) {
        this.configLevel = configLevel;
        return this;
    }
    public Integer getConfigLevel() {
        return this.configLevel;
    }

    public CreatePluginConfigRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreatePluginConfigRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public CreatePluginConfigRequest setPluginId(Long pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public Long getPluginId() {
        return this.pluginId;
    }

    public CreatePluginConfigRequest setResourceIdList(java.util.List<Long> resourceIdList) {
        this.resourceIdList = resourceIdList;
        return this;
    }
    public java.util.List<Long> getResourceIdList() {
        return this.resourceIdList;
    }

}

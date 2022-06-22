// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class StopPluginRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("ConfigurationId")
    public String configurationId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PluginType")
    public String pluginType;

    public static StopPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        StopPluginRequest self = new StopPluginRequest();
        return TeaModel.build(map, self);
    }

    public StopPluginRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public StopPluginRequest setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }
    public String getConfigurationId() {
        return this.configurationId;
    }

    public StopPluginRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public StopPluginRequest setPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public String getPluginType() {
        return this.pluginType;
    }

}

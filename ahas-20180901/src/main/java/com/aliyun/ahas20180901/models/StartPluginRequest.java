// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class StartPluginRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("ConfigurationId")
    public String configurationId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PluginType")
    public String pluginType;

    public static StartPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        StartPluginRequest self = new StartPluginRequest();
        return TeaModel.build(map, self);
    }

    public StartPluginRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public StartPluginRequest setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }
    public String getConfigurationId() {
        return this.configurationId;
    }

    public StartPluginRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public StartPluginRequest setPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public String getPluginType() {
        return this.pluginType;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiPluginStatus extends TeaModel {
    /**
     * <p>The list of plug-in runtime error logs. Each item is a map[string]any key-value pair.</p>
     */
    @NameInMap("errorLogs")
    public java.util.List<java.util.Map<String, ?>> errorLogs;

    /**
     * <p>The plug-in instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pi-xxx</p>
     */
    @NameInMap("pluginId")
    public String pluginId;

    /**
     * <p>Indicates whether the backend service that the plug-in depends on is healthy.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("serviceHealthy")
    public Boolean serviceHealthy;

    public static AiPluginStatus build(java.util.Map<String, ?> map) throws Exception {
        AiPluginStatus self = new AiPluginStatus();
        return TeaModel.build(map, self);
    }

    public AiPluginStatus setErrorLogs(java.util.List<java.util.Map<String, ?>> errorLogs) {
        this.errorLogs = errorLogs;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getErrorLogs() {
        return this.errorLogs;
    }

    public AiPluginStatus setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public AiPluginStatus setServiceHealthy(Boolean serviceHealthy) {
        this.serviceHealthy = serviceHealthy;
        return this;
    }
    public Boolean getServiceHealthy() {
        return this.serviceHealthy;
    }

}

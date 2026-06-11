// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiPluginStatus extends TeaModel {
    /**
     * <p>An object containing error logs, where each key is a string identifying an error and the value is a string describing that error.</p>
     */
    @NameInMap("errorLogs")
    public java.util.List<java.util.Map<String, ?>> errorLogs;

    /**
     * <p>The unique identifier of the plugin.</p>
     */
    @NameInMap("pluginId")
    public String pluginId;

    /**
     * <p>Indicates if the service is healthy. <code>true</code> indicates normal operation, and <code>false</code> indicates an issue.</p>
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

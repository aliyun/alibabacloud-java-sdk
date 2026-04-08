// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiPluginStatus extends TeaModel {
    @NameInMap("errorLogs")
    public java.util.Map<String, String> errorLogs;

    @NameInMap("pluginId")
    public String pluginId;

    @NameInMap("serviceHealthy")
    public Boolean serviceHealthy;

    public static AiPluginStatus build(java.util.Map<String, ?> map) throws Exception {
        AiPluginStatus self = new AiPluginStatus();
        return TeaModel.build(map, self);
    }

    public AiPluginStatus setErrorLogs(java.util.Map<String, String> errorLogs) {
        this.errorLogs = errorLogs;
        return this;
    }
    public java.util.Map<String, String> getErrorLogs() {
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

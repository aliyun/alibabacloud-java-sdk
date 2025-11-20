// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class InstallPluginRequest extends TeaModel {
    /**
     * <p>The list of gateway IDs.</p>
     */
    @NameInMap("gatewayIds")
    public java.util.List<String> gatewayIds;

    /**
     * <p>The plug-in type ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pls-csqmjndlhtguk0loef21</p>
     */
    @NameInMap("pluginClassId")
    public String pluginClassId;

    public static InstallPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallPluginRequest self = new InstallPluginRequest();
        return TeaModel.build(map, self);
    }

    public InstallPluginRequest setGatewayIds(java.util.List<String> gatewayIds) {
        this.gatewayIds = gatewayIds;
        return this;
    }
    public java.util.List<String> getGatewayIds() {
        return this.gatewayIds;
    }

    public InstallPluginRequest setPluginClassId(String pluginClassId) {
        this.pluginClassId = pluginClassId;
        return this;
    }
    public String getPluginClassId() {
        return this.pluginClassId;
    }

}

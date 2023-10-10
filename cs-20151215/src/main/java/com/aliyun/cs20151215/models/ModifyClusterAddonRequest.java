// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterAddonRequest extends TeaModel {
    /**
     * <p>The custom parameter settings that you want to use.</p>
     */
    @NameInMap("config")
    public String config;

    public static ModifyClusterAddonRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterAddonRequest self = new ModifyClusterAddonRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterAddonRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ServicePluginStep extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("args")
    public java.util.Map<String, ?> args;

    /**
     * <strong>example:</strong>
     * <p>dingding-robot</p>
     */
    @NameInMap("plugin")
    public String plugin;

    public static ServicePluginStep build(java.util.Map<String, ?> map) throws Exception {
        ServicePluginStep self = new ServicePluginStep();
        return TeaModel.build(map, self);
    }

    public ServicePluginStep setArgs(java.util.Map<String, ?> args) {
        this.args = args;
        return this;
    }
    public java.util.Map<String, ?> getArgs() {
        return this.args;
    }

    public ServicePluginStep setPlugin(String plugin) {
        this.plugin = plugin;
        return this;
    }
    public String getPlugin() {
        return this.plugin;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer4RuleShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;InstanceId&quot;:&quot;xxxxxx-xxxxxx-xxxxxx-xxxxxxx&quot;,&quot;Protocol&quot;:&quot;tcp&quot;,&quot;FrontendPort&quot;:80,&quot;BackendPort&quot;:5,&quot;RealServers&quot;:&quot;1.1.1.1&quot;,&quot;2.2.2.2&quot;}]</p>
     */
    @NameInMap("Listeners")
    public String listeners;

    @NameInMap("ProxyEnable")
    public Long proxyEnable;

    @NameInMap("UsTimeout")
    public String usTimeoutShrink;

    public static ConfigLayer4RuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RuleShrinkRequest self = new ConfigLayer4RuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RuleShrinkRequest setListeners(String listeners) {
        this.listeners = listeners;
        return this;
    }
    public String getListeners() {
        return this.listeners;
    }

    public ConfigLayer4RuleShrinkRequest setProxyEnable(Long proxyEnable) {
        this.proxyEnable = proxyEnable;
        return this;
    }
    public Long getProxyEnable() {
        return this.proxyEnable;
    }

    public ConfigLayer4RuleShrinkRequest setUsTimeoutShrink(String usTimeoutShrink) {
        this.usTimeoutShrink = usTimeoutShrink;
        return this;
    }
    public String getUsTimeoutShrink() {
        return this.usTimeoutShrink;
    }

}

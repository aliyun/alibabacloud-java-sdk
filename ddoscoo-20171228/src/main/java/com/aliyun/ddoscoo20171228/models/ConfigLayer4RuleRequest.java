// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer4RuleRequest extends TeaModel {
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

    public static ConfigLayer4RuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RuleRequest self = new ConfigLayer4RuleRequest();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RuleRequest setListeners(String listeners) {
        this.listeners = listeners;
        return this;
    }
    public String getListeners() {
        return this.listeners;
    }

    public ConfigLayer4RuleRequest setProxyEnable(Long proxyEnable) {
        this.proxyEnable = proxyEnable;
        return this;
    }
    public Long getProxyEnable() {
        return this.proxyEnable;
    }

}

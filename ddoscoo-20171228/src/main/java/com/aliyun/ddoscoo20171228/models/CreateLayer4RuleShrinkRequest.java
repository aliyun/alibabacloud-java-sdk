// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class CreateLayer4RuleShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;InstanceId&quot;:&quot;xxxxxx-xxxxxx-xxxxxx-xxxxxxx&quot;,&quot;Protocol&quot;:&quot;tcp&quot;,&quot;FrontendPort&quot;:80,&quot;BackendPort&quot;:5,&quot;RealServers&quot;:&quot;1.1.1.1&quot;,&quot;2.2.2.2&quot;}]</p>
     */
    @NameInMap("Listeners")
    public String listeners;

    @NameInMap("ProxyEnable")
    public Integer proxyEnable;

    @NameInMap("UsTimeout")
    public String usTimeoutShrink;

    public static CreateLayer4RuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLayer4RuleShrinkRequest self = new CreateLayer4RuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateLayer4RuleShrinkRequest setListeners(String listeners) {
        this.listeners = listeners;
        return this;
    }
    public String getListeners() {
        return this.listeners;
    }

    public CreateLayer4RuleShrinkRequest setProxyEnable(Integer proxyEnable) {
        this.proxyEnable = proxyEnable;
        return this;
    }
    public Integer getProxyEnable() {
        return this.proxyEnable;
    }

    public CreateLayer4RuleShrinkRequest setUsTimeoutShrink(String usTimeoutShrink) {
        this.usTimeoutShrink = usTimeoutShrink;
        return this;
    }
    public String getUsTimeoutShrink() {
        return this.usTimeoutShrink;
    }

}

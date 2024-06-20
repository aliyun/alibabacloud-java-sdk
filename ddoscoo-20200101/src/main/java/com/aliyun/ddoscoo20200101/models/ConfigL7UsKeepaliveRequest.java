// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigL7UsKeepaliveRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enabled&quot;: true, &quot;keepalive_requests&quot;: 1000,&quot;keepalive_timeout&quot;: 30}</p>
     */
    @NameInMap("UpstreamKeepalive")
    public String upstreamKeepalive;

    public static ConfigL7UsKeepaliveRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigL7UsKeepaliveRequest self = new ConfigL7UsKeepaliveRequest();
        return TeaModel.build(map, self);
    }

    public ConfigL7UsKeepaliveRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ConfigL7UsKeepaliveRequest setUpstreamKeepalive(String upstreamKeepalive) {
        this.upstreamKeepalive = upstreamKeepalive;
        return this;
    }
    public String getUpstreamKeepalive() {
        return this.upstreamKeepalive;
    }

}

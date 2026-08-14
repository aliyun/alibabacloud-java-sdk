// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigL7UsKeepaliveRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("DownstreamKeepalive")
    public String downstreamKeepalive;

    /**
     * <p>This parameter is required.</p>
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

    public ConfigL7UsKeepaliveRequest setDownstreamKeepalive(String downstreamKeepalive) {
        this.downstreamKeepalive = downstreamKeepalive;
        return this;
    }
    public String getDownstreamKeepalive() {
        return this.downstreamKeepalive;
    }

    public ConfigL7UsKeepaliveRequest setUpstreamKeepalive(String upstreamKeepalive) {
        this.upstreamKeepalive = upstreamKeepalive;
        return this;
    }
    public String getUpstreamKeepalive() {
        return this.upstreamKeepalive;
    }

}

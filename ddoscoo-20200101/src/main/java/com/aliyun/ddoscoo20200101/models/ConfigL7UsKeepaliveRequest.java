// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigL7UsKeepaliveRequest extends TeaModel {
    /**
     * <p>The domain name of the website service.</p>
     * <blockquote>
     * <p>The domain name must have a website service forwarding rule configured. You can call <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> to query all domain names.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The idle timeout period of the persistent connection between the client and Anti-DDoS Proxy.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("DownstreamKeepalive")
    public String downstreamKeepalive;

    /**
     * <p>The persistent connection settings for back-to-origin requests of Anti-DDoS Proxy. The value is a string that represents a JSON struct. The JSON struct contains the following fields:</p>
     * <ul>
     * <li><strong>enabled</strong>: Boolean | Required | Specifies whether to enable persistent connections for back-to-origin requests.</li>
     * <li><strong>keepalive_requests</strong>: Integer | Required | The number of requests that can be sent over a persistent connection.</li>
     * <li><strong>keepalive_timeout</strong>: Integer | Required | The idle timeout period of a persistent connection.</li>
     * </ul>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigL7UsKeepaliveRequest extends TeaModel {
    /**
     * <p>The domain name of the website.</p>
     * <blockquote>
     * <p> A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The settings for back-to-origin persistent connections. The value is a string that consists of a JSON struct. The JSON struct contains the following fields:</p>
     * <ul>
     * <li><strong>enabled</strong>: the switch for back-to-origin persistent connections. This field is required, and the value is of the Boolean type.</li>
     * <li><strong>keepalive_requests</strong>: the number of requests that reuse a persistent connection. This field is required, and the value is of the integer type.</li>
     * <li><strong>keepalive_timeout</strong>: the timeout period for an idle persistent connection. This field is required, and the value is of the integer type.</li>
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

    public ConfigL7UsKeepaliveRequest setUpstreamKeepalive(String upstreamKeepalive) {
        this.upstreamKeepalive = upstreamKeepalive;
        return this;
    }
    public String getUpstreamKeepalive() {
        return this.upstreamKeepalive;
    }

}

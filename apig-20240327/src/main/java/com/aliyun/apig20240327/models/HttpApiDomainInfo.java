// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiDomainInfo extends TeaModel {
    /**
     * <p>The domain name ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-xxx</p>
     */
    @NameInMap("domainId")
    public String domainId;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The protocol.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>HTTPS</li>
     * <li>HTTP</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    public static HttpApiDomainInfo build(java.util.Map<String, ?> map) throws Exception {
        HttpApiDomainInfo self = new HttpApiDomainInfo();
        return TeaModel.build(map, self);
    }

    public HttpApiDomainInfo setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public HttpApiDomainInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public HttpApiDomainInfo setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}

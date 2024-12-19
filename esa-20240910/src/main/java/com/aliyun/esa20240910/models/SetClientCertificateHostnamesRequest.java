// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetClientCertificateHostnamesRequest extends TeaModel {
    /**
     * <p>The domain names to associate.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Hostnames")
    public java.util.List<String> hostnames;

    /**
     * <p>The ID of the client CA certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>babab9db65ee5efcca9f3d41d4b50d66</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The website ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static SetClientCertificateHostnamesRequest build(java.util.Map<String, ?> map) throws Exception {
        SetClientCertificateHostnamesRequest self = new SetClientCertificateHostnamesRequest();
        return TeaModel.build(map, self);
    }

    public SetClientCertificateHostnamesRequest setHostnames(java.util.List<String> hostnames) {
        this.hostnames = hostnames;
        return this;
    }
    public java.util.List<String> getHostnames() {
        return this.hostnames;
    }

    public SetClientCertificateHostnamesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SetClientCertificateHostnamesRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}

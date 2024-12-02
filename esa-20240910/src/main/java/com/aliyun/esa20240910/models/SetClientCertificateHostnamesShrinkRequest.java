// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetClientCertificateHostnamesShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Hostnames")
    public String hostnamesShrink;

    /**
     * <strong>example:</strong>
     * <p>babab9db65ee5efcca9f3d41d4b50d66</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static SetClientCertificateHostnamesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetClientCertificateHostnamesShrinkRequest self = new SetClientCertificateHostnamesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetClientCertificateHostnamesShrinkRequest setHostnamesShrink(String hostnamesShrink) {
        this.hostnamesShrink = hostnamesShrink;
        return this;
    }
    public String getHostnamesShrink() {
        return this.hostnamesShrink;
    }

    public SetClientCertificateHostnamesShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SetClientCertificateHostnamesShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}

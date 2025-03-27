// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetClientCaCertificateRequest extends TeaModel {
    /**
     * <p>The certificate ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2860651.html">ListClientCaCertificates</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>babab9db65ee5efcca9f3d41d4b5****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetClientCaCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClientCaCertificateRequest self = new GetClientCaCertificateRequest();
        return TeaModel.build(map, self);
    }

    public GetClientCaCertificateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetClientCaCertificateRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}

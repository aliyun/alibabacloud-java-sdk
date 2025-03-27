// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteOriginClientCertificateRequest extends TeaModel {
    /**
     * <p>The certificate ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>babaabcd****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static DeleteOriginClientCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOriginClientCertificateRequest self = new DeleteOriginClientCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOriginClientCertificateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteOriginClientCertificateRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}

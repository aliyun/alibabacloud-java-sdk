// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteClientCaCertificateRequest extends TeaModel {
    /**
     * <p>The certificate ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>baba39055622c008b90285a8838ed09a</p>
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

    public static DeleteClientCaCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientCaCertificateRequest self = new DeleteClientCaCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClientCaCertificateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteClientCaCertificateRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCertificateQuotaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>free</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetCertificateQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCertificateQuotaRequest self = new GetCertificateQuotaRequest();
        return TeaModel.build(map, self);
    }

    public GetCertificateQuotaRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public GetCertificateQuotaRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

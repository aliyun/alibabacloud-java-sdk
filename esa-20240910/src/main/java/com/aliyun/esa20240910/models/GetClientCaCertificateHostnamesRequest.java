// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetClientCaCertificateHostnamesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>babaded901474b9693acf530e0fb****</p>
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

    public static GetClientCaCertificateHostnamesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClientCaCertificateHostnamesRequest self = new GetClientCaCertificateHostnamesRequest();
        return TeaModel.build(map, self);
    }

    public GetClientCaCertificateHostnamesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetClientCaCertificateHostnamesRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}

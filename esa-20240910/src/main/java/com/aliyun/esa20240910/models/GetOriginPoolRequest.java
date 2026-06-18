// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetOriginPoolRequest extends TeaModel {
    /**
     * <p>The origin pool ID. To get it, call <a href="https://help.aliyun.com/document_detail/2863947.html">ListOriginPools</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1038520525196928</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The site ID. To get it, call <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>216558609793952</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetOriginPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOriginPoolRequest self = new GetOriginPoolRequest();
        return TeaModel.build(map, self);
    }

    public GetOriginPoolRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetOriginPoolRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}

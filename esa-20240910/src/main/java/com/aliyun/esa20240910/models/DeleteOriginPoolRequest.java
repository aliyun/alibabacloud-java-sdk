// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteOriginPoolRequest extends TeaModel {
    /**
     * <p>The ID of the origin address pool, which can be obtained by calling the <a href="~~ListOriginPools~~">ListOriginPools</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>103852052519****</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>21655860979****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static DeleteOriginPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOriginPoolRequest self = new DeleteOriginPoolRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOriginPoolRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteOriginPoolRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}

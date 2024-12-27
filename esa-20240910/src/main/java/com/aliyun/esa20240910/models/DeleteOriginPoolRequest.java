// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteOriginPoolRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DeleteOriginPool</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
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

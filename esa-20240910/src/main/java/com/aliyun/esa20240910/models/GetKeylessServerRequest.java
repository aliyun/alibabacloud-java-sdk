// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetKeylessServerRequest extends TeaModel {
    /**
     * <p>The keyless server ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>baba39055622c008b90285a8838e****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The site ID. To obtain this ID, call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5407498413****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetKeylessServerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKeylessServerRequest self = new GetKeylessServerRequest();
        return TeaModel.build(map, self);
    }

    public GetKeylessServerRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetKeylessServerRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}

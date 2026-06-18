// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteKeylessServerRequest extends TeaModel {
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
     * <p>The ID of the site, which you can get by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11223***</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static DeleteKeylessServerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeylessServerRequest self = new DeleteKeylessServerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKeylessServerRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteKeylessServerRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}

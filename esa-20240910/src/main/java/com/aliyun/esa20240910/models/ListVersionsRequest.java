// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListVersionsRequest extends TeaModel {
    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>33968830844****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static ListVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVersionsRequest self = new ListVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListVersionsRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}

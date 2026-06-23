// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ActivateVersionManagementRequest extends TeaModel {
    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11223***</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static ActivateVersionManagementRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivateVersionManagementRequest self = new ActivateVersionManagementRequest();
        return TeaModel.build(map, self);
    }

    public ActivateVersionManagementRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}

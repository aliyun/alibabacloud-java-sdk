// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeactivateVersionManagementRequest extends TeaModel {
    /**
     * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890***</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static DeactivateVersionManagementRequest build(java.util.Map<String, ?> map) throws Exception {
        DeactivateVersionManagementRequest self = new DeactivateVersionManagementRequest();
        return TeaModel.build(map, self);
    }

    public DeactivateVersionManagementRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}

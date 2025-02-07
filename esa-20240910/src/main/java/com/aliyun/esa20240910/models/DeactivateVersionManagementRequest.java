// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeactivateVersionManagementRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
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

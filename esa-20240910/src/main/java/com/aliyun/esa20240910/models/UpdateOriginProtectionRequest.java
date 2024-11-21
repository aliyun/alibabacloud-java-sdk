// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateOriginProtectionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("OriginConverge")
    public String originConverge;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateOriginProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOriginProtectionRequest self = new UpdateOriginProtectionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOriginProtectionRequest setOriginConverge(String originConverge) {
        this.originConverge = originConverge;
        return this;
    }
    public String getOriginConverge() {
        return this.originConverge;
    }

    public UpdateOriginProtectionRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}

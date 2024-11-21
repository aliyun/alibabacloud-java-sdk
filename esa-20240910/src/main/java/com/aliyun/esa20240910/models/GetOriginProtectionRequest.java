// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetOriginProtectionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetOriginProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOriginProtectionRequest self = new GetOriginProtectionRequest();
        return TeaModel.build(map, self);
    }

    public GetOriginProtectionRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}

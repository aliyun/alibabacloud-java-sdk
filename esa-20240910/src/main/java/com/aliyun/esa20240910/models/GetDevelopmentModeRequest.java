// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetDevelopmentModeRequest extends TeaModel {
    /**
     * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5407498413****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetDevelopmentModeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDevelopmentModeRequest self = new GetDevelopmentModeRequest();
        return TeaModel.build(map, self);
    }

    public GetDevelopmentModeRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}

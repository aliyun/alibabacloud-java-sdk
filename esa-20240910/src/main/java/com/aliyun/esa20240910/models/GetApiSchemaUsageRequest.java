// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetApiSchemaUsageRequest extends TeaModel {
    /**
     * <p>The site ID. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1159101787****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The site version.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static GetApiSchemaUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApiSchemaUsageRequest self = new GetApiSchemaUsageRequest();
        return TeaModel.build(map, self);
    }

    public GetApiSchemaUsageRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public GetApiSchemaUsageRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}

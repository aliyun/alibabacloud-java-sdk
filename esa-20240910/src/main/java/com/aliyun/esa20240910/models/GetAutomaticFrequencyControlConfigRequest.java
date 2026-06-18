// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetAutomaticFrequencyControlConfigRequest extends TeaModel {
    /**
     * <p>The ID of the site. Call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version of the site. If versioning is enabled, use this parameter to specify the site version. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static GetAutomaticFrequencyControlConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAutomaticFrequencyControlConfigRequest self = new GetAutomaticFrequencyControlConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAutomaticFrequencyControlConfigRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public GetAutomaticFrequencyControlConfigRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}

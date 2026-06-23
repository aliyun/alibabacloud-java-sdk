// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetPurgeQuotaRequest extends TeaModel {
    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The refresh task type. Valid values:</p>
     * <ul>
     * <li><strong>file</strong> (default): file refresh.</li>
     * <li><strong>cachetag</strong>: cache tag refresh.</li>
     * <li><strong>directory</strong>: directory refresh.</li>
     * <li><strong>ignoreParams</strong>: ignore-parameters refresh.</li>
     * <li><strong>hostname</strong>: hostname refresh.</li>
     * <li><strong>purgeall</strong>: purge all cache under the site.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>file</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetPurgeQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPurgeQuotaRequest self = new GetPurgeQuotaRequest();
        return TeaModel.build(map, self);
    }

    public GetPurgeQuotaRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public GetPurgeQuotaRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

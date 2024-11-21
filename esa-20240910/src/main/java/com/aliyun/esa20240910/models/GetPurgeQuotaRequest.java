// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetPurgeQuotaRequest extends TeaModel {
    /**
     * <p>The website ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The type of the purge task. Valid values:</p>
     * <ul>
     * <li><strong>file</strong> (default): purges the cache by file.</li>
     * <li><strong>cachetag</strong>: purges the cache by cache tag.</li>
     * <li><strong>directory</strong>: purges the cache by directory.</li>
     * <li><strong>ignoreParams</strong>: purges the cache by URL with specific parameters ignored.</li>
     * <li><strong>hostname</strong>: purges the cache by hostname.</li>
     * <li><strong>purgeall</strong>: purges all cache.</li>
     * </ul>
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

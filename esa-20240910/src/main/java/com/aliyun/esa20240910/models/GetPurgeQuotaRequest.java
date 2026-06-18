// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetPurgeQuotaRequest extends TeaModel {
    /**
     * <p>The ID of the site. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The type of the purge task. Valid values:</p>
     * <ul>
     * <li><p><strong>file</strong> (default): File purge.</p>
     * </li>
     * <li><p><strong>cachetag</strong>: Cache tag purge.</p>
     * </li>
     * <li><p><strong>directory</strong>: Directory purge.</p>
     * </li>
     * <li><p><strong>ignoreParams</strong>: Purge by ignoring parameters.</p>
     * </li>
     * <li><p><strong>hostname</strong>: Hostname purge.</p>
     * </li>
     * <li><p><strong>purgeall</strong>: Purges all cached content for the site.</p>
     * </li>
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

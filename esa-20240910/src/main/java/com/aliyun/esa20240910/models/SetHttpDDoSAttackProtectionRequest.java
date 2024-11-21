// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetHttpDDoSAttackProtectionRequest extends TeaModel {
    /**
     * <p>The level of HTTP DDoS attack protection. Valid values:</p>
     * <ul>
     * <li><strong>very weak</strong>: very loose.</li>
     * <li><strong>weak</strong>: loose.</li>
     * <li><strong>default</strong>: normal.</li>
     * <li><strong>hard</strong>: strict.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("GlobalMode")
    public String globalMode;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static SetHttpDDoSAttackProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetHttpDDoSAttackProtectionRequest self = new SetHttpDDoSAttackProtectionRequest();
        return TeaModel.build(map, self);
    }

    public SetHttpDDoSAttackProtectionRequest setGlobalMode(String globalMode) {
        this.globalMode = globalMode;
        return this;
    }
    public String getGlobalMode() {
        return this.globalMode;
    }

    public SetHttpDDoSAttackProtectionRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}

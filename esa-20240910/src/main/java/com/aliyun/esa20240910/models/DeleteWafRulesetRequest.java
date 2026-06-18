// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteWafRulesetRequest extends TeaModel {
    /**
     * <p>The ID of the WAF ruleset. Call the <a href="https://help.aliyun.com/document_detail/2878359.html">ListWafRulesets</a> API to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The site ID. Call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> API to obtain this ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>If version management is enabled for the site, use this parameter to specify the version to modify. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static DeleteWafRulesetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWafRulesetRequest self = new DeleteWafRulesetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWafRulesetRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteWafRulesetRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public DeleteWafRulesetRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}

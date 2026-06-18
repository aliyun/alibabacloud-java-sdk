// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateWafRulesetRequest extends TeaModel {
    /**
     * <p>The name of the WAF ruleset.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The WAF rule execution phase. Valid values:</p>
     * <ul>
     * <li><p>http_whitelist</p>
     * </li>
     * <li><p>http_custom</p>
     * </li>
     * <li><p>http_managed</p>
     * </li>
     * <li><p>http_anti_scan</p>
     * </li>
     * <li><p>http_ratelimit</p>
     * </li>
     * <li><p>ip_access_rule</p>
     * </li>
     * <li><p>http_bot</p>
     * </li>
     * <li><p>http_security_level_rule</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>http_custom</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>The site ID. To get this ID, call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The site configuration version. This parameter applies only if versioning is enabled for the site. The default is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static CreateWafRulesetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWafRulesetRequest self = new CreateWafRulesetRequest();
        return TeaModel.build(map, self);
    }

    public CreateWafRulesetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWafRulesetRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public CreateWafRulesetRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateWafRulesetRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateWafRuleRequest extends TeaModel {
    /**
     * <p>The specific configuration of the WAF rule (<code>WafRuleConfig</code> data structure). The required fields vary depending on the Phase value:</p>
     * <ul>
     * <li><code>http_custom</code>: <code>Expression</code> (match expression) and <code>Action</code> (action upon match) are required. Setting <code>Name</code> is recommended for easier identification.</li>
     * <li><code>http_whitelist</code>: <code>Expression</code> is required. Matched requests are allowed directly (no Action).</li>
     * <li><code>http_ratelimit</code>: <code>Expression</code> and <code>RateLimit</code> (rate limiting parameters) are required.</li>
     * <li><code>ip_access_rule</code>: <code>Expression</code> (containing IP match) and <code>Action</code> are required.</li>
     * </ul>
     * <blockquote>
     * <p>The complete field definitions are based on the <code>WafRuleConfig</code> data structure. If required fields are missing, the service returns <code>InvalidParameter(400)</code> / <code>Rule.Config.Malformed</code>.</p>
     * </blockquote>
     */
    @NameInMap("Config")
    public WafRuleConfig config;

    /**
     * <p>The WAF rule execution phase. This <strong>single-creation operation</strong> supports the following phases (it does not support <code>http_anti_scan</code> or <code>http_bot</code>. For these two phases, use the batch operation <code>BatchCreateWafRules</code>):</p>
     * <ul>
     * <li><code>http_whitelist</code>: whitelist rule</li>
     * <li><code>http_custom</code>: custom rule</li>
     * <li><code>http_managed</code>: managed rule</li>
     * <li><code>http_ratelimit</code>: rate limiting rule</li>
     * <li><code>ip_access_rule</code>: IP access rule</li>
     * <li><code>http_security_level_rule</code>: security rule</li>
     * </ul>
     * <blockquote>
     * <p>Note: <code>http_anti_scan</code> and <code>http_bot</code> can only be created through the batch operation. Passing these two values to this operation returns an error.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>http_custom</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>The ID of the WAF ruleset. You can call the <a href="https://help.aliyun.com/document_detail/2878359.html">ListWafRulesets</a> operation to obtain the ruleset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("RulesetId")
    public Long rulesetId;

    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the site version on which the configuration takes effect. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static CreateWafRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWafRuleRequest self = new CreateWafRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateWafRuleRequest setConfig(WafRuleConfig config) {
        this.config = config;
        return this;
    }
    public WafRuleConfig getConfig() {
        return this.config;
    }

    public CreateWafRuleRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public CreateWafRuleRequest setRulesetId(Long rulesetId) {
        this.rulesetId = rulesetId;
        return this;
    }
    public Long getRulesetId() {
        return this.rulesetId;
    }

    public CreateWafRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateWafRuleRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}

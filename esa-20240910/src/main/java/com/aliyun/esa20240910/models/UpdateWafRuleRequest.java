// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateWafRuleRequest extends TeaModel {
    /**
     * <p>The configuration of the rule.</p>
     */
    @NameInMap("Config")
    public WafRuleConfig config;

    /**
     * <p>The ID of the WAF rule. To obtain the rule ID, call the <a href="https://help.aliyun.com/document_detail/2878257.html">ListWafRules</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The position of the rule within the rule set.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Position")
    public Long position;

    /**
     * <p>The ID of the site. To obtain the site ID, call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version number of the site configuration. For sites with configuration version management enabled, use this parameter to specify the effective configuration version. The default is version 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    /**
     * <p>The status of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateWafRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWafRuleRequest self = new UpdateWafRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWafRuleRequest setConfig(WafRuleConfig config) {
        this.config = config;
        return this;
    }
    public WafRuleConfig getConfig() {
        return this.config;
    }

    public UpdateWafRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateWafRuleRequest setPosition(Long position) {
        this.position = position;
        return this;
    }
    public Long getPosition() {
        return this.position;
    }

    public UpdateWafRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateWafRuleRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public UpdateWafRuleRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

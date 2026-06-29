// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateImageTransformRequest extends TeaModel {
    /**
     * <p>The adaptive AVIF setting.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AutoAvif")
    public String autoAvif;

    /**
     * <p>The adaptive WebP setting.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AutoWebp")
    public String autoWebp;

    /**
     * <p>The configuration ID. You can call the <a href="https://help.aliyun.com/document_detail/2869056.html">ListImageTransforms</a> operation to obtain the configuration ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>352816096987136</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>Specifies whether to enable image transformation. Valid values:</p>
     * <ul>
     * <li>on: Enabled.</li>
     * <li>off: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The rule content, which uses a conditional expression to match user requests. You do not need to set this parameter when adding a global configuration. Two scenarios are supported:</p>
     * <ul>
     * <li>Match all incoming requests: Set the value to true.</li>
     * <li>Match specified requests: Set the value to a custom expression, such as (http.host eq \&quot;video.example.com\&quot;).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.request.uri.path.file_name eq \&quot;jpg\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>The rule switch. You do not need to set this parameter when adding a global configuration. Valid values:</p>
     * <ul>
     * <li>on: Enabled.</li>
     * <li>off: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The rule name. You do not need to set this parameter when adding a global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The execution order of the rule. A smaller value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateImageTransformRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageTransformRequest self = new UpdateImageTransformRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageTransformRequest setAutoAvif(String autoAvif) {
        this.autoAvif = autoAvif;
        return this;
    }
    public String getAutoAvif() {
        return this.autoAvif;
    }

    public UpdateImageTransformRequest setAutoWebp(String autoWebp) {
        this.autoWebp = autoWebp;
        return this;
    }
    public String getAutoWebp() {
        return this.autoWebp;
    }

    public UpdateImageTransformRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public UpdateImageTransformRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public UpdateImageTransformRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UpdateImageTransformRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public UpdateImageTransformRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateImageTransformRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public UpdateImageTransformRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}

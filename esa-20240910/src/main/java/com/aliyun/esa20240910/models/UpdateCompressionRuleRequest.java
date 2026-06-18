// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCompressionRuleRequest extends TeaModel {
    /**
     * <p>Brotli compression. Valid values:</p>
     * <ul>
     * <li><p>on: Enable.</p>
     * </li>
     * <li><p>off: Disable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Brotli")
    public String brotli;

    /**
     * <p>Configuration ID. Get this value by calling the <a href="~~ListCompressionRules~~">ListCompressionRules</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>35281609698****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>Gzip compression. Valid values:</p>
     * <ul>
     * <li><p>on: Enable.</p>
     * </li>
     * <li><p>off: Disable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Gzip")
    public String gzip;

    /**
     * <p>Rule content, using a conditional expression to match user requests. Do not set this parameter when adding a global configuration. Two scenarios apply:</p>
     * <ul>
     * <li><p>Match all incoming requests: Set the value to true.</p>
     * </li>
     * <li><p>Match specific requests: Set the value to a custom expression, such as: (http.host eq &quot;video.example.com&quot;)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Rule switch. Do not set this parameter when adding a global configuration. Valid values:</p>
     * <ul>
     * <li><p>on: Enable.</p>
     * </li>
     * <li><p>off: Disable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>Rule name. Do not set this parameter when adding a global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Rule execution order. Rules with smaller values take precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>Site ID. Get this value by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5407498413****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Zstd compression. Valid values:</p>
     * <ul>
     * <li><p>on: Enable.</p>
     * </li>
     * <li><p>off: Disable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Zstd")
    public String zstd;

    public static UpdateCompressionRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCompressionRuleRequest self = new UpdateCompressionRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCompressionRuleRequest setBrotli(String brotli) {
        this.brotli = brotli;
        return this;
    }
    public String getBrotli() {
        return this.brotli;
    }

    public UpdateCompressionRuleRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public UpdateCompressionRuleRequest setGzip(String gzip) {
        this.gzip = gzip;
        return this;
    }
    public String getGzip() {
        return this.gzip;
    }

    public UpdateCompressionRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UpdateCompressionRuleRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public UpdateCompressionRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateCompressionRuleRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public UpdateCompressionRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateCompressionRuleRequest setZstd(String zstd) {
        this.zstd = zstd;
        return this;
    }
    public String getZstd() {
        return this.zstd;
    }

}

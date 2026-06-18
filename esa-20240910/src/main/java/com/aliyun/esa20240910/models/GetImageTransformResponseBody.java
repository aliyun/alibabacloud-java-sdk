// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetImageTransformResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AutoAvif")
    public String autoAvif;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AutoWebp")
    public String autoWebp;

    /**
     * <p>The config ID.</p>
     * 
     * <strong>example:</strong>
     * <p>352816096987136</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The configuration type. Valid values:</p>
     * <ul>
     * <li><p>global: The global configuration.</p>
     * </li>
     * <li><p>rule: A rule configuration.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>Indicates whether image transformation is enabled. Valid values:</p>
     * <ul>
     * <li><p>on: Enabled.</p>
     * </li>
     * <li><p>off: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-280B-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The conditional expression of the rule, used to match user requests. This parameter is relevant only for a rule configuration.</p>
     * <ul>
     * <li><p>A value of true matches all incoming requests.</p>
     * </li>
     * <li><p>A custom expression, such as (http.host eq &quot;video.example.com&quot;), matches specific requests.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.request.uri.path.file_name eq \&quot;jpg\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>The status of the rule. This parameter is relevant only for a rule configuration. Valid values:</p>
     * <ul>
     * <li><p>on: Enabled.</p>
     * </li>
     * <li><p>off: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The rule name. This parameter is relevant only for a rule configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The execution sequence of the rule. A smaller value indicates a higher execution priority.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The version number of the site configuration. For a site that has configuration versioning enabled, this value indicates the version to which the configuration applies. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static GetImageTransformResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageTransformResponseBody self = new GetImageTransformResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageTransformResponseBody setAutoAvif(String autoAvif) {
        this.autoAvif = autoAvif;
        return this;
    }
    public String getAutoAvif() {
        return this.autoAvif;
    }

    public GetImageTransformResponseBody setAutoWebp(String autoWebp) {
        this.autoWebp = autoWebp;
        return this;
    }
    public String getAutoWebp() {
        return this.autoWebp;
    }

    public GetImageTransformResponseBody setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetImageTransformResponseBody setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public GetImageTransformResponseBody setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public GetImageTransformResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageTransformResponseBody setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public GetImageTransformResponseBody setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public GetImageTransformResponseBody setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public GetImageTransformResponseBody setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public GetImageTransformResponseBody setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}

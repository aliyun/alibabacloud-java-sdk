// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateImageTransformRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <strong>example:</strong>
     * <p>(http.request.uri.path.file_name eq \&quot;jpg\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static CreateImageTransformRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageTransformRequest self = new CreateImageTransformRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageTransformRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public CreateImageTransformRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public CreateImageTransformRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public CreateImageTransformRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateImageTransformRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateImageTransformRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}

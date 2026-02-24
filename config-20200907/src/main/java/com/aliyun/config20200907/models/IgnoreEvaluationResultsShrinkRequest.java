// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class IgnoreEvaluationResultsShrinkRequest extends TeaModel {
    /**
     * <p>The rule ID.</p>
     * <p>For more information about how to obtain the rule ID, see <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-7e72626622af0051****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The date on which the ignored evaluation results are automatically restored.</p>
     * <blockquote>
     * <p>If this parameter is left empty, the ignored evaluation results are not automatically restored. You must manually restore them.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-06-01</p>
     */
    @NameInMap("IgnoreDate")
    public String ignoreDate;

    /**
     * <p>The reason for ignoring the resources.</p>
     * 
     * <strong>example:</strong>
     * <p>无需检测。</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The list of resources to be ignored.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Resources")
    public String resourcesShrink;

    public static IgnoreEvaluationResultsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IgnoreEvaluationResultsShrinkRequest self = new IgnoreEvaluationResultsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IgnoreEvaluationResultsShrinkRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public IgnoreEvaluationResultsShrinkRequest setIgnoreDate(String ignoreDate) {
        this.ignoreDate = ignoreDate;
        return this;
    }
    public String getIgnoreDate() {
        return this.ignoreDate;
    }

    public IgnoreEvaluationResultsShrinkRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public IgnoreEvaluationResultsShrinkRequest setResourcesShrink(String resourcesShrink) {
        this.resourcesShrink = resourcesShrink;
        return this;
    }
    public String getResourcesShrink() {
        return this.resourcesShrink;
    }

}

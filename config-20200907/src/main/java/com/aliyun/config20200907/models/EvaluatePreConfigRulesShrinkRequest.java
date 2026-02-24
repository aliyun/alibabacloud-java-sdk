// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class EvaluatePreConfigRulesShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable rule templates. Valid values:</p>
     * <ul>
     * <li><p>true: enables rule templates.</p>
     * </li>
     * <li><p>false (default): does not enable rule templates.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableManagedRules")
    public Boolean enableManagedRules;

    /**
     * <p>An array that contains the resources that you want to evaluate.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceEvaluateItems")
    public String resourceEvaluateItemsShrink;

    /**
     * <p>The query start token</p>
     * 
     * <strong>example:</strong>
     * <p>ros</p>
     */
    @NameInMap("ResourceTypeFormat")
    public String resourceTypeFormat;

    public static EvaluatePreConfigRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EvaluatePreConfigRulesShrinkRequest self = new EvaluatePreConfigRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EvaluatePreConfigRulesShrinkRequest setEnableManagedRules(Boolean enableManagedRules) {
        this.enableManagedRules = enableManagedRules;
        return this;
    }
    public Boolean getEnableManagedRules() {
        return this.enableManagedRules;
    }

    public EvaluatePreConfigRulesShrinkRequest setResourceEvaluateItemsShrink(String resourceEvaluateItemsShrink) {
        this.resourceEvaluateItemsShrink = resourceEvaluateItemsShrink;
        return this;
    }
    public String getResourceEvaluateItemsShrink() {
        return this.resourceEvaluateItemsShrink;
    }

    public EvaluatePreConfigRulesShrinkRequest setResourceTypeFormat(String resourceTypeFormat) {
        this.resourceTypeFormat = resourceTypeFormat;
        return this;
    }
    public String getResourceTypeFormat() {
        return this.resourceTypeFormat;
    }

}

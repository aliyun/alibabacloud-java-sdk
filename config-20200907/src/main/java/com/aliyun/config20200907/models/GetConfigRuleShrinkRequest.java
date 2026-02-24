// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigRuleShrinkRequest extends TeaModel {
    /**
     * <p>The rule ID.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-7f7d626622af0041****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The tags of the resource. This parameter is deprecated and has no effect.</p>
     * <p>You can add a maximum of 20 tags to a resource.</p>
     */
    @NameInMap("Tag")
    @Deprecated
    public String tagShrink;

    public static GetConfigRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConfigRuleShrinkRequest self = new GetConfigRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetConfigRuleShrinkRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    @Deprecated
    public GetConfigRuleShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}

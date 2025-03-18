// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class DeleteEventRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("ProductName")
    public String productName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rule-xsXDW</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static DeleteEventRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventRuleRequest self = new DeleteEventRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEventRuleRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public DeleteEventRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}

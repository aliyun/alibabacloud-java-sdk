// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartConfigRuleEvaluationByResourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp151g9tpto890zr****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    public static StartConfigRuleEvaluationByResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartConfigRuleEvaluationByResourceRequest self = new StartConfigRuleEvaluationByResourceRequest();
        return TeaModel.build(map, self);
    }

    public StartConfigRuleEvaluationByResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}

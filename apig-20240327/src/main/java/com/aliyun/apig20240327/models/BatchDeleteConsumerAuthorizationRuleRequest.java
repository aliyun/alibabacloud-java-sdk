// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchDeleteConsumerAuthorizationRuleRequest extends TeaModel {
    /**
     * <p>The rule IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>car-cus2d1em1hkg7732kuk0</p>
     */
    @NameInMap("consumerAuthorizationRuleIds")
    public String consumerAuthorizationRuleIds;

    public static BatchDeleteConsumerAuthorizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteConsumerAuthorizationRuleRequest self = new BatchDeleteConsumerAuthorizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteConsumerAuthorizationRuleRequest setConsumerAuthorizationRuleIds(String consumerAuthorizationRuleIds) {
        this.consumerAuthorizationRuleIds = consumerAuthorizationRuleIds;
        return this;
    }
    public String getConsumerAuthorizationRuleIds() {
        return this.consumerAuthorizationRuleIds;
    }

}

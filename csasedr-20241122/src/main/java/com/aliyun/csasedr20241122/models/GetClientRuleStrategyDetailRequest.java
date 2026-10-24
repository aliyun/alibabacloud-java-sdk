// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class GetClientRuleStrategyDetailRequest extends TeaModel {
    /**
     * <p>The ID of the client rule policy. You can obtain the ID from the response of the create operation or the policy list.</p>
     * 
     * <strong>example:</strong>
     * <p>14808</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetClientRuleStrategyDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClientRuleStrategyDetailRequest self = new GetClientRuleStrategyDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetClientRuleStrategyDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}

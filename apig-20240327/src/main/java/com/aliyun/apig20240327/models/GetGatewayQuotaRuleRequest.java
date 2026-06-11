// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayQuotaRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("consumerPageNumber")
    public String consumerPageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("consumerPageSize")
    public String consumerPageSize;

    @NameInMap("withConsumers")
    public Boolean withConsumers;

    public static GetGatewayQuotaRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayQuotaRuleRequest self = new GetGatewayQuotaRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetGatewayQuotaRuleRequest setConsumerPageNumber(String consumerPageNumber) {
        this.consumerPageNumber = consumerPageNumber;
        return this;
    }
    public String getConsumerPageNumber() {
        return this.consumerPageNumber;
    }

    public GetGatewayQuotaRuleRequest setConsumerPageSize(String consumerPageSize) {
        this.consumerPageSize = consumerPageSize;
        return this;
    }
    public String getConsumerPageSize() {
        return this.consumerPageSize;
    }

    public GetGatewayQuotaRuleRequest setWithConsumers(Boolean withConsumers) {
        this.withConsumers = withConsumers;
        return this;
    }
    public Boolean getWithConsumers() {
        return this.withConsumers;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayQuotaRuleRequest extends TeaModel {
    /**
     * <p>The page number of the consumer list.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("consumerPageNumber")
    @Deprecated
    public String consumerPageNumber;

    /**
     * <p>The page size of the consumer list.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("consumerPageSize")
    @Deprecated
    public String consumerPageSize;

    /**
     * <p>Specifies whether to return the consumer list.</p>
     */
    @NameInMap("withConsumers")
    public Boolean withConsumers;

    public static GetGatewayQuotaRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayQuotaRuleRequest self = new GetGatewayQuotaRuleRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public GetGatewayQuotaRuleRequest setConsumerPageNumber(String consumerPageNumber) {
        this.consumerPageNumber = consumerPageNumber;
        return this;
    }
    public String getConsumerPageNumber() {
        return this.consumerPageNumber;
    }

    @Deprecated
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

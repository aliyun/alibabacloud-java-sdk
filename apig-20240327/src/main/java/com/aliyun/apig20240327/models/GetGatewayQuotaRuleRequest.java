// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayQuotaRuleRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("consumerPageNumber")
    @Deprecated
    public String consumerPageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("consumerPageSize")
    @Deprecated
    public String consumerPageSize;

    /**
     * <p>Specifies whether to return the API consumer list.</p>
     */
    @NameInMap("withConsumers")
    public Boolean withConsumers;

    /**
     * <p>Specifies whether to return the general subject list. This parameter applies to both API consumer and API consumer group rules.</p>
     */
    @NameInMap("withSubjects")
    public Boolean withSubjects;

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

    public GetGatewayQuotaRuleRequest setWithSubjects(Boolean withSubjects) {
        this.withSubjects = withSubjects;
        return this;
    }
    public Boolean getWithSubjects() {
        return this.withSubjects;
    }

}

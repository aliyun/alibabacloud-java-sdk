// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayCircuitBreakerRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>just for POP</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>param</p>
     */
    @NameInMap("FilterParams")
    public String filterParams;

    public static ListGatewayCircuitBreakerRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayCircuitBreakerRuleRequest self = new ListGatewayCircuitBreakerRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewayCircuitBreakerRuleRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListGatewayCircuitBreakerRuleRequest setFilterParams(String filterParams) {
        this.filterParams = filterParams;
        return this;
    }
    public String getFilterParams() {
        return this.filterParams;
    }

}

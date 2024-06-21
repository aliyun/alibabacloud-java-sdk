// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayFlowRuleRequest extends TeaModel {
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

    public static ListGatewayFlowRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayFlowRuleRequest self = new ListGatewayFlowRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewayFlowRuleRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListGatewayFlowRuleRequest setFilterParams(String filterParams) {
        this.filterParams = filterParams;
        return this;
    }
    public String getFilterParams() {
        return this.filterParams;
    }

}

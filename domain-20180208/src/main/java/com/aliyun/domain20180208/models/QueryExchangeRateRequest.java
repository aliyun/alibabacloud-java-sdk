// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryExchangeRateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>USD</p>
     */
    @NameInMap("FromCurrency")
    public String fromCurrency;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("ToCurrency")
    public String toCurrency;

    public static QueryExchangeRateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryExchangeRateRequest self = new QueryExchangeRateRequest();
        return TeaModel.build(map, self);
    }

    public QueryExchangeRateRequest setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
        return this;
    }
    public String getFromCurrency() {
        return this.fromCurrency;
    }

    public QueryExchangeRateRequest setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
        return this;
    }
    public String getToCurrency() {
        return this.toCurrency;
    }

}

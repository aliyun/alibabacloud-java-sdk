// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryExchangeRateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7.12</p>
     */
    @NameInMap("ExchangeRate")
    public Double exchangeRate;

    /**
     * <strong>example:</strong>
     * <p>D200000-C0B9-4CD3-B92A-9B44A000000</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryExchangeRateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryExchangeRateResponseBody self = new QueryExchangeRateResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryExchangeRateResponseBody setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }
    public Double getExchangeRate() {
        return this.exchangeRate;
    }

    public QueryExchangeRateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

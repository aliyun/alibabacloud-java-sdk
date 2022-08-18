// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsRequestStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePdnsRequestStatisticsResponseBody body;

    public static DescribePdnsRequestStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsRequestStatisticsResponse self = new DescribePdnsRequestStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePdnsRequestStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePdnsRequestStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePdnsRequestStatisticsResponse setBody(DescribePdnsRequestStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePdnsRequestStatisticsResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsRequestStatisticResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePdnsRequestStatisticResponseBody body;

    public static DescribePdnsRequestStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsRequestStatisticResponse self = new DescribePdnsRequestStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DescribePdnsRequestStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePdnsRequestStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePdnsRequestStatisticResponse setBody(DescribePdnsRequestStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePdnsRequestStatisticResponseBody getBody() {
        return this.body;
    }

}

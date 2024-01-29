// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsAccountSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePdnsAccountSummaryResponseBody body;

    public static DescribePdnsAccountSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsAccountSummaryResponse self = new DescribePdnsAccountSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribePdnsAccountSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePdnsAccountSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePdnsAccountSummaryResponse setBody(DescribePdnsAccountSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePdnsAccountSummaryResponseBody getBody() {
        return this.body;
    }

}

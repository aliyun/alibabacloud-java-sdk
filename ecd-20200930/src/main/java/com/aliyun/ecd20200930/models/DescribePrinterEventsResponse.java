// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePrinterEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePrinterEventsResponseBody body;

    public static DescribePrinterEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePrinterEventsResponse self = new DescribePrinterEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePrinterEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePrinterEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePrinterEventsResponse setBody(DescribePrinterEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePrinterEventsResponseBody getBody() {
        return this.body;
    }

}

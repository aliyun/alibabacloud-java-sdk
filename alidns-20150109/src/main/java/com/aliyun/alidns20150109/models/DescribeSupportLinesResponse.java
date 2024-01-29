// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeSupportLinesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSupportLinesResponseBody body;

    public static DescribeSupportLinesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportLinesResponse self = new DescribeSupportLinesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSupportLinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSupportLinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSupportLinesResponse setBody(DescribeSupportLinesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSupportLinesResponseBody getBody() {
        return this.body;
    }

}

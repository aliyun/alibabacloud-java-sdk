// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribePreCheckCreateGadOrderResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePreCheckCreateGadOrderResultResponseBody body;

    public static DescribePreCheckCreateGadOrderResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePreCheckCreateGadOrderResultResponse self = new DescribePreCheckCreateGadOrderResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribePreCheckCreateGadOrderResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePreCheckCreateGadOrderResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePreCheckCreateGadOrderResultResponse setBody(DescribePreCheckCreateGadOrderResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePreCheckCreateGadOrderResultResponseBody getBody() {
        return this.body;
    }

}

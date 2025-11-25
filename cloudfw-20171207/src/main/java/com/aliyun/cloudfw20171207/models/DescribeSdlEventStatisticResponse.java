// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSdlEventStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSdlEventStatisticResponseBody body;

    public static DescribeSdlEventStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSdlEventStatisticResponse self = new DescribeSdlEventStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSdlEventStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSdlEventStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSdlEventStatisticResponse setBody(DescribeSdlEventStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSdlEventStatisticResponseBody getBody() {
        return this.body;
    }

}

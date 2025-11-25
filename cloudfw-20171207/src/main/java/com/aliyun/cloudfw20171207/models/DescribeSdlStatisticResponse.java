// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSdlStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSdlStatisticResponseBody body;

    public static DescribeSdlStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSdlStatisticResponse self = new DescribeSdlStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSdlStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSdlStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSdlStatisticResponse setBody(DescribeSdlStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSdlStatisticResponseBody getBody() {
        return this.body;
    }

}

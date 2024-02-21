// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDTSIPResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDTSIPResponseBody body;

    public static DescribeDTSIPResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDTSIPResponse self = new DescribeDTSIPResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDTSIPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDTSIPResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDTSIPResponse setBody(DescribeDTSIPResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDTSIPResponseBody getBody() {
        return this.body;
    }

}

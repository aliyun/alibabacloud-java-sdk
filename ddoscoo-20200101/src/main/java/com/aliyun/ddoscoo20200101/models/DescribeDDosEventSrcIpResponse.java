// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventSrcIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDDosEventSrcIpResponseBody body;

    public static DescribeDDosEventSrcIpResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventSrcIpResponse self = new DescribeDDosEventSrcIpResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventSrcIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDDosEventSrcIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDDosEventSrcIpResponse setBody(DescribeDDosEventSrcIpResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDDosEventSrcIpResponseBody getBody() {
        return this.body;
    }

}

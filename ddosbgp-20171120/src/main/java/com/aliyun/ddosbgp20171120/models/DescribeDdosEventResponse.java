// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeDdosEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDdosEventResponseBody body;

    public static DescribeDdosEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosEventResponse self = new DescribeDdosEventResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDdosEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDdosEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDdosEventResponse setBody(DescribeDdosEventResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDdosEventResponseBody getBody() {
        return this.body;
    }

}

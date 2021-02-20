// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeCnameReusesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCnameReusesResponseBody body;

    public static DescribeCnameReusesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCnameReusesResponse self = new DescribeCnameReusesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCnameReusesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCnameReusesResponse setBody(DescribeCnameReusesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCnameReusesResponseBody getBody() {
        return this.body;
    }

}

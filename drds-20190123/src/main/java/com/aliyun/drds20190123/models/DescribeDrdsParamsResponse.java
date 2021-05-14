// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsParamsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrdsParamsResponseBody body;

    public static DescribeDrdsParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsParamsResponse self = new DescribeDrdsParamsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsParamsResponse setBody(DescribeDrdsParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsParamsResponseBody getBody() {
        return this.body;
    }

}

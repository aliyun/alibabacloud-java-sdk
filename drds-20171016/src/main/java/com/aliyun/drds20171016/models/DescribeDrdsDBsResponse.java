// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeDrdsDBsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrdsDBsResponseBody body;

    public static DescribeDrdsDBsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDBsResponse self = new DescribeDrdsDBsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDBsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsDBsResponse setBody(DescribeDrdsDBsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsDBsResponseBody getBody() {
        return this.body;
    }

}

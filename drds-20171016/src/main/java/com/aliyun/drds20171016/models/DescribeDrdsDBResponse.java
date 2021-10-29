// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeDrdsDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrdsDBResponseBody body;

    public static DescribeDrdsDBResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDBResponse self = new DescribeDrdsDBResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsDBResponse setBody(DescribeDrdsDBResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsDBResponseBody getBody() {
        return this.body;
    }

}

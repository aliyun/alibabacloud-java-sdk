// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDbInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrdsDbInstanceResponseBody body;

    public static DescribeDrdsDbInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDbInstanceResponse self = new DescribeDrdsDbInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDbInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsDbInstanceResponse setBody(DescribeDrdsDbInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsDbInstanceResponseBody getBody() {
        return this.body;
    }

}

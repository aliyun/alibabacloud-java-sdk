// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeDrdsDBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeDrdsDBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDrdsDBResponse setBody(DescribeDrdsDBResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsDBResponseBody getBody() {
        return this.body;
    }

}

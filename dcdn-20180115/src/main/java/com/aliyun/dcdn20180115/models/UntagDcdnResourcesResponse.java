// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UntagDcdnResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UntagDcdnResourcesResponseBody body;

    public static UntagDcdnResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        UntagDcdnResourcesResponse self = new UntagDcdnResourcesResponse();
        return TeaModel.build(map, self);
    }

    public UntagDcdnResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UntagDcdnResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UntagDcdnResourcesResponse setBody(UntagDcdnResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public UntagDcdnResourcesResponseBody getBody() {
        return this.body;
    }

}

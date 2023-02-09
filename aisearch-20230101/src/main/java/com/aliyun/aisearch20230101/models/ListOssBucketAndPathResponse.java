// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class ListOssBucketAndPathResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListOssBucketAndPathResponseBody body;

    public static ListOssBucketAndPathResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOssBucketAndPathResponse self = new ListOssBucketAndPathResponse();
        return TeaModel.build(map, self);
    }

    public ListOssBucketAndPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOssBucketAndPathResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOssBucketAndPathResponse setBody(ListOssBucketAndPathResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOssBucketAndPathResponseBody getBody() {
        return this.body;
    }

}

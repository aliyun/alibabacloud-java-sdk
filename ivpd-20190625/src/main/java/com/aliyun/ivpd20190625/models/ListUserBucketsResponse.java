// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class ListUserBucketsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserBucketsResponseBody body;

    public static ListUserBucketsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserBucketsResponse self = new ListUserBucketsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserBucketsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserBucketsResponse setBody(ListUserBucketsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserBucketsResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListMomentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMomentsResponseBody body;

    public static ListMomentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMomentsResponse self = new ListMomentsResponse();
        return TeaModel.build(map, self);
    }

    public ListMomentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMomentsResponse setBody(ListMomentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMomentsResponseBody getBody() {
        return this.body;
    }

}

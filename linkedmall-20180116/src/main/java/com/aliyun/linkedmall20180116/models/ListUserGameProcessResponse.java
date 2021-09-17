// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ListUserGameProcessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserGameProcessResponseBody body;

    public static ListUserGameProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserGameProcessResponse self = new ListUserGameProcessResponse();
        return TeaModel.build(map, self);
    }

    public ListUserGameProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserGameProcessResponse setBody(ListUserGameProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserGameProcessResponseBody getBody() {
        return this.body;
    }

}

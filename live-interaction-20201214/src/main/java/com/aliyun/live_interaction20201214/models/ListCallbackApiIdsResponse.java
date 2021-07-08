// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListCallbackApiIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCallbackApiIdsResponseBody body;

    public static ListCallbackApiIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCallbackApiIdsResponse self = new ListCallbackApiIdsResponse();
        return TeaModel.build(map, self);
    }

    public ListCallbackApiIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCallbackApiIdsResponse setBody(ListCallbackApiIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCallbackApiIdsResponseBody getBody() {
        return this.body;
    }

}

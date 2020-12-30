// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListApmApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListApmApplicationResponseBody body;

    public static ListApmApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApmApplicationResponse self = new ListApmApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ListApmApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApmApplicationResponse setBody(ListApmApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApmApplicationResponseBody getBody() {
        return this.body;
    }

}

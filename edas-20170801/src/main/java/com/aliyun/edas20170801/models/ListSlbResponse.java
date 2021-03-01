// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListSlbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSlbResponseBody body;

    public static ListSlbResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSlbResponse self = new ListSlbResponse();
        return TeaModel.build(map, self);
    }

    public ListSlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSlbResponse setBody(ListSlbResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSlbResponseBody getBody() {
        return this.body;
    }

}

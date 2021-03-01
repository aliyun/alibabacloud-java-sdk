// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListApplicationEcuResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListApplicationEcuResponseBody body;

    public static ListApplicationEcuResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationEcuResponse self = new ListApplicationEcuResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationEcuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationEcuResponse setBody(ListApplicationEcuResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationEcuResponseBody getBody() {
        return this.body;
    }

}

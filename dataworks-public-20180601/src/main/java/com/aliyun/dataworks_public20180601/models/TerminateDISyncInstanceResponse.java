// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class TerminateDISyncInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TerminateDISyncInstanceResponseBody body;

    public static TerminateDISyncInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminateDISyncInstanceResponse self = new TerminateDISyncInstanceResponse();
        return TeaModel.build(map, self);
    }

    public TerminateDISyncInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TerminateDISyncInstanceResponse setBody(TerminateDISyncInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public TerminateDISyncInstanceResponseBody getBody() {
        return this.body;
    }

}

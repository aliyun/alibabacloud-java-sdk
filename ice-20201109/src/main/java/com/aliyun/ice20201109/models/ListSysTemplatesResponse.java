// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSysTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSysTemplatesResponseBody body;

    public static ListSysTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSysTemplatesResponse self = new ListSysTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListSysTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSysTemplatesResponse setBody(ListSysTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSysTemplatesResponseBody getBody() {
        return this.body;
    }

}

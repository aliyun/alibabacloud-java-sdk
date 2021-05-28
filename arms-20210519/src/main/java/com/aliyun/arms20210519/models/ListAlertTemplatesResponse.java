// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class ListAlertTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAlertTemplatesResponseBody body;

    public static ListAlertTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlertTemplatesResponse self = new ListAlertTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListAlertTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlertTemplatesResponse setBody(ListAlertTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlertTemplatesResponseBody getBody() {
        return this.body;
    }

}

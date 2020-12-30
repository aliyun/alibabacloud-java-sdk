// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListAdviceActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAdviceActionResponseBody body;

    public static ListAdviceActionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAdviceActionResponse self = new ListAdviceActionResponse();
        return TeaModel.build(map, self);
    }

    public ListAdviceActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAdviceActionResponse setBody(ListAdviceActionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAdviceActionResponseBody getBody() {
        return this.body;
    }

}

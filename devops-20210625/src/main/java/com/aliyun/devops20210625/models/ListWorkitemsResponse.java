// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkitemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListWorkitemsResponseBody body;

    public static ListWorkitemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkitemsResponse self = new ListWorkitemsResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkitemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkitemsResponse setBody(ListWorkitemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkitemsResponseBody getBody() {
        return this.body;
    }

}

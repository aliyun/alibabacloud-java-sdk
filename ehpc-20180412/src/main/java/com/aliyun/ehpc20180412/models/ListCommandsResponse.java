// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCommandsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCommandsResponseBody body;

    public static ListCommandsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCommandsResponse self = new ListCommandsResponse();
        return TeaModel.build(map, self);
    }

    public ListCommandsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCommandsResponse setBody(ListCommandsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCommandsResponseBody getBody() {
        return this.body;
    }

}

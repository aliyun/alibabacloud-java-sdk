// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListTimeLinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTimeLinesResponseBody body;

    public static ListTimeLinesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTimeLinesResponse self = new ListTimeLinesResponse();
        return TeaModel.build(map, self);
    }

    public ListTimeLinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTimeLinesResponse setBody(ListTimeLinesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTimeLinesResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListCallTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCallTaskDetailResponseBody body;

    public static ListCallTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCallTaskDetailResponse self = new ListCallTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListCallTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCallTaskDetailResponse setBody(ListCallTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCallTaskDetailResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListCallEventDetailByContactIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCallEventDetailByContactIdResponseBody body;

    public static ListCallEventDetailByContactIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCallEventDetailByContactIdResponse self = new ListCallEventDetailByContactIdResponse();
        return TeaModel.build(map, self);
    }

    public ListCallEventDetailByContactIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCallEventDetailByContactIdResponse setBody(ListCallEventDetailByContactIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCallEventDetailByContactIdResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListResourcePoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourcePoolResponseBody body;

    public static ListResourcePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourcePoolResponse self = new ListResourcePoolResponse();
        return TeaModel.build(map, self);
    }

    public ListResourcePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourcePoolResponse setBody(ListResourcePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourcePoolResponseBody getBody() {
        return this.body;
    }

}

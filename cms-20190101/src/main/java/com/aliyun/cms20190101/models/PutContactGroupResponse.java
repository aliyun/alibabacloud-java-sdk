// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutContactGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutContactGroupResponseBody body;

    public static PutContactGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        PutContactGroupResponse self = new PutContactGroupResponse();
        return TeaModel.build(map, self);
    }

    public PutContactGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutContactGroupResponse setBody(PutContactGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public PutContactGroupResponseBody getBody() {
        return this.body;
    }

}

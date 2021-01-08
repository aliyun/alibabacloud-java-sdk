// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListCredentialsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCredentialsResponseBody body;

    public static ListCredentialsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCredentialsResponse self = new ListCredentialsResponse();
        return TeaModel.build(map, self);
    }

    public ListCredentialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCredentialsResponse setBody(ListCredentialsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCredentialsResponseBody getBody() {
        return this.body;
    }

}

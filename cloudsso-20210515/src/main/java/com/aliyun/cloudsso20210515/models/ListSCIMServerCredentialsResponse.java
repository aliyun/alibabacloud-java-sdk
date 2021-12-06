// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListSCIMServerCredentialsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSCIMServerCredentialsResponseBody body;

    public static ListSCIMServerCredentialsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSCIMServerCredentialsResponse self = new ListSCIMServerCredentialsResponse();
        return TeaModel.build(map, self);
    }

    public ListSCIMServerCredentialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSCIMServerCredentialsResponse setBody(ListSCIMServerCredentialsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSCIMServerCredentialsResponseBody getBody() {
        return this.body;
    }

}

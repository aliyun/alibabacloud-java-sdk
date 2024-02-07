// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListSCIMServerCredentialsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListSCIMServerCredentialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSCIMServerCredentialsResponse setBody(ListSCIMServerCredentialsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSCIMServerCredentialsResponseBody getBody() {
        return this.body;
    }

}

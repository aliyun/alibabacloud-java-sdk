// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListServiceCredentialsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListServiceCredentialsResponseBody body;

    public static ListServiceCredentialsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceCredentialsResponse self = new ListServiceCredentialsResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceCredentialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceCredentialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceCredentialsResponse setBody(ListServiceCredentialsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceCredentialsResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListAuthorizedSoftwareResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAuthorizedSoftwareResponseBody body;

    public static ListAuthorizedSoftwareResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedSoftwareResponse self = new ListAuthorizedSoftwareResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedSoftwareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizedSoftwareResponse setBody(ListAuthorizedSoftwareResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizedSoftwareResponseBody getBody() {
        return this.body;
    }

}

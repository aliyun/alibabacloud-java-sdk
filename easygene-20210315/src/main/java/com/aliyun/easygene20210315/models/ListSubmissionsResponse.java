// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListSubmissionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSubmissionsResponseBody body;

    public static ListSubmissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubmissionsResponse self = new ListSubmissionsResponse();
        return TeaModel.build(map, self);
    }

    public ListSubmissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubmissionsResponse setBody(ListSubmissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubmissionsResponseBody getBody() {
        return this.body;
    }

}

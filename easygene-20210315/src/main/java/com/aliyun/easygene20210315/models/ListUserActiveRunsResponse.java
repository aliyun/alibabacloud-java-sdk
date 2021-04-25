// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListUserActiveRunsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserActiveRunsResponseBody body;

    public static ListUserActiveRunsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserActiveRunsResponse self = new ListUserActiveRunsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserActiveRunsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserActiveRunsResponse setBody(ListUserActiveRunsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserActiveRunsResponseBody getBody() {
        return this.body;
    }

}

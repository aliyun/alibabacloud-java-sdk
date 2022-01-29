// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListProjectWorkitemTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProjectWorkitemTypesResponseBody body;

    public static ListProjectWorkitemTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectWorkitemTypesResponse self = new ListProjectWorkitemTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectWorkitemTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectWorkitemTypesResponse setBody(ListProjectWorkitemTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectWorkitemTypesResponseBody getBody() {
        return this.body;
    }

}

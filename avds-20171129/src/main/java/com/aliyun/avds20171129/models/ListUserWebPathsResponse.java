// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListUserWebPathsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserWebPathsResponseBody body;

    public static ListUserWebPathsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserWebPathsResponse self = new ListUserWebPathsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserWebPathsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserWebPathsResponse setBody(ListUserWebPathsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserWebPathsResponseBody getBody() {
        return this.body;
    }

}

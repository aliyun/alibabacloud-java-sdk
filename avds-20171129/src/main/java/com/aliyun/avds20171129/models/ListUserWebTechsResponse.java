// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListUserWebTechsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserWebTechsResponseBody body;

    public static ListUserWebTechsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserWebTechsResponse self = new ListUserWebTechsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserWebTechsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserWebTechsResponse setBody(ListUserWebTechsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserWebTechsResponseBody getBody() {
        return this.body;
    }

}

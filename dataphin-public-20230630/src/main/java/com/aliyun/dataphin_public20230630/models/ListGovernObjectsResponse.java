// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListGovernObjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGovernObjectsResponseBody body;

    public static ListGovernObjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGovernObjectsResponse self = new ListGovernObjectsResponse();
        return TeaModel.build(map, self);
    }

    public ListGovernObjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGovernObjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGovernObjectsResponse setBody(ListGovernObjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGovernObjectsResponseBody getBody() {
        return this.body;
    }

}

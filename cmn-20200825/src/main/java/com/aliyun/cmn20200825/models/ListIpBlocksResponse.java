// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListIpBlocksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListIpBlocksResponseBody body;

    public static ListIpBlocksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpBlocksResponse self = new ListIpBlocksResponse();
        return TeaModel.build(map, self);
    }

    public ListIpBlocksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIpBlocksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIpBlocksResponse setBody(ListIpBlocksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIpBlocksResponseBody getBody() {
        return this.body;
    }

}

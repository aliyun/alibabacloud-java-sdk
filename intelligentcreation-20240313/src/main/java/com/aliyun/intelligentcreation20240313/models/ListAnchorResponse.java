// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListAnchorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAnchorResponseBody body;

    public static ListAnchorResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAnchorResponse self = new ListAnchorResponse();
        return TeaModel.build(map, self);
    }

    public ListAnchorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAnchorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAnchorResponse setBody(ListAnchorResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAnchorResponseBody getBody() {
        return this.body;
    }

}

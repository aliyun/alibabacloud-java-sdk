// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDIProjectConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDIProjectConfigResponseBody body;

    public static ListDIProjectConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDIProjectConfigResponse self = new ListDIProjectConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListDIProjectConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDIProjectConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDIProjectConfigResponse setBody(ListDIProjectConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDIProjectConfigResponseBody getBody() {
        return this.body;
    }

}

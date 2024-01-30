// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_yaochi_portal20230206.models;

import com.aliyun.tea.*;

public class ListTagsByResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTagsByResourceResponseBody body;

    public static ListTagsByResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagsByResourceResponse self = new ListTagsByResourceResponse();
        return TeaModel.build(map, self);
    }

    public ListTagsByResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTagsByResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTagsByResourceResponse setBody(ListTagsByResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTagsByResourceResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodeIOResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNodeIOResponseBody body;

    public static ListNodeIOResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodeIOResponse self = new ListNodeIOResponse();
        return TeaModel.build(map, self);
    }

    public ListNodeIOResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodeIOResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNodeIOResponse setBody(ListNodeIOResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodeIOResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListApiByAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApiByAppResponseBody body;

    public static ListApiByAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApiByAppResponse self = new ListApiByAppResponse();
        return TeaModel.build(map, self);
    }

    public ListApiByAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApiByAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApiByAppResponse setBody(ListApiByAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApiByAppResponseBody getBody() {
        return this.body;
    }

}

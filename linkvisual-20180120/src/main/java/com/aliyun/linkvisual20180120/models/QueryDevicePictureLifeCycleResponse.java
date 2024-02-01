// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePictureLifeCycleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDevicePictureLifeCycleResponseBody body;

    public static QueryDevicePictureLifeCycleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePictureLifeCycleResponse self = new QueryDevicePictureLifeCycleResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicePictureLifeCycleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDevicePictureLifeCycleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDevicePictureLifeCycleResponse setBody(QueryDevicePictureLifeCycleResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDevicePictureLifeCycleResponseBody getBody() {
        return this.body;
    }

}

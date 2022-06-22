// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListPtsPerfLatestDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPtsPerfLatestDataResponseBody body;

    public static ListPtsPerfLatestDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPtsPerfLatestDataResponse self = new ListPtsPerfLatestDataResponse();
        return TeaModel.build(map, self);
    }

    public ListPtsPerfLatestDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPtsPerfLatestDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPtsPerfLatestDataResponse setBody(ListPtsPerfLatestDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPtsPerfLatestDataResponseBody getBody() {
        return this.body;
    }

}

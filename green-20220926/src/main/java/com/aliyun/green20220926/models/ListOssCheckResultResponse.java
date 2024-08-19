// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListOssCheckResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOssCheckResultResponseBody body;

    public static ListOssCheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOssCheckResultResponse self = new ListOssCheckResultResponse();
        return TeaModel.build(map, self);
    }

    public ListOssCheckResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOssCheckResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOssCheckResultResponse setBody(ListOssCheckResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOssCheckResultResponseBody getBody() {
        return this.body;
    }

}

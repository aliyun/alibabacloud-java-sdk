// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class MarkOssV2ResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MarkOssV2ResultResponseBody body;

    public static MarkOssV2ResultResponse build(java.util.Map<String, ?> map) throws Exception {
        MarkOssV2ResultResponse self = new MarkOssV2ResultResponse();
        return TeaModel.build(map, self);
    }

    public MarkOssV2ResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MarkOssV2ResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MarkOssV2ResultResponse setBody(MarkOssV2ResultResponseBody body) {
        this.body = body;
        return this;
    }
    public MarkOssV2ResultResponseBody getBody() {
        return this.body;
    }

}

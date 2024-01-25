// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class BatchAbolishApisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchAbolishApisResponseBody body;

    public static BatchAbolishApisResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchAbolishApisResponse self = new BatchAbolishApisResponse();
        return TeaModel.build(map, self);
    }

    public BatchAbolishApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchAbolishApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchAbolishApisResponse setBody(BatchAbolishApisResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchAbolishApisResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class BatchDeployApisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeployApisResponseBody body;

    public static BatchDeployApisResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeployApisResponse self = new BatchDeployApisResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeployApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeployApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeployApisResponse setBody(BatchDeployApisResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeployApisResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class BatchQueryPluginStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchQueryPluginStatusResponseBody body;

    public static BatchQueryPluginStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryPluginStatusResponse self = new BatchQueryPluginStatusResponse();
        return TeaModel.build(map, self);
    }

    public BatchQueryPluginStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchQueryPluginStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchQueryPluginStatusResponse setBody(BatchQueryPluginStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchQueryPluginStatusResponseBody getBody() {
        return this.body;
    }

}

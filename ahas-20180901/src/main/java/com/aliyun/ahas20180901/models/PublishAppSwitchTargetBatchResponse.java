// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class PublishAppSwitchTargetBatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PublishAppSwitchTargetBatchResponseBody body;

    public static PublishAppSwitchTargetBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishAppSwitchTargetBatchResponse self = new PublishAppSwitchTargetBatchResponse();
        return TeaModel.build(map, self);
    }

    public PublishAppSwitchTargetBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishAppSwitchTargetBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishAppSwitchTargetBatchResponse setBody(PublishAppSwitchTargetBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishAppSwitchTargetBatchResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQueueInformationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetQueueInformationResponseBody body;

    public static GetQueueInformationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueueInformationResponse self = new GetQueueInformationResponse();
        return TeaModel.build(map, self);
    }

    public GetQueueInformationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueueInformationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQueueInformationResponse setBody(GetQueueInformationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueueInformationResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class PushRpaTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PushRpaTaskDetailResponseBody body;

    public static PushRpaTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        PushRpaTaskDetailResponse self = new PushRpaTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public PushRpaTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushRpaTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushRpaTaskDetailResponse setBody(PushRpaTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public PushRpaTaskDetailResponseBody getBody() {
        return this.body;
    }

}

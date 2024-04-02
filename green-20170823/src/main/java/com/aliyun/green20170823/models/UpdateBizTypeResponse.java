// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateBizTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBizTypeResponseBody body;

    public static UpdateBizTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBizTypeResponse self = new UpdateBizTypeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBizTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBizTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBizTypeResponse setBody(UpdateBizTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBizTypeResponseBody getBody() {
        return this.body;
    }

}

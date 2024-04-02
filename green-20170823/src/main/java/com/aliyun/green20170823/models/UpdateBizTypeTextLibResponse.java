// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateBizTypeTextLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBizTypeTextLibResponseBody body;

    public static UpdateBizTypeTextLibResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBizTypeTextLibResponse self = new UpdateBizTypeTextLibResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBizTypeTextLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBizTypeTextLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBizTypeTextLibResponse setBody(UpdateBizTypeTextLibResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBizTypeTextLibResponseBody getBody() {
        return this.body;
    }

}

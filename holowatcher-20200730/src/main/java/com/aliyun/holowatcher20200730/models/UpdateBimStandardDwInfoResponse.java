// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UpdateBimStandardDwInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateBimStandardDwInfoResponseBody body;

    public static UpdateBimStandardDwInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBimStandardDwInfoResponse self = new UpdateBimStandardDwInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBimStandardDwInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBimStandardDwInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBimStandardDwInfoResponse setBody(UpdateBimStandardDwInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBimStandardDwInfoResponseBody getBody() {
        return this.body;
    }

}

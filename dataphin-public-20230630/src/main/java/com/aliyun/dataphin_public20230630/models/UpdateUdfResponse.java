// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateUdfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUdfResponseBody body;

    public static UpdateUdfResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUdfResponse self = new UpdateUdfResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUdfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUdfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUdfResponse setBody(UpdateUdfResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUdfResponseBody getBody() {
        return this.body;
    }

}

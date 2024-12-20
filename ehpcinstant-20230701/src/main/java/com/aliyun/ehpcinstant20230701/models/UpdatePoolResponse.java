// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class UpdatePoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePoolResponseBody body;

    public static UpdatePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePoolResponse self = new UpdatePoolResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePoolResponse setBody(UpdatePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePoolResponseBody getBody() {
        return this.body;
    }

}

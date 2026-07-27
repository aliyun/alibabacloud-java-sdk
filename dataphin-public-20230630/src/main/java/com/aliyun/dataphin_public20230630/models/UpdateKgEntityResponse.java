// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateKgEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKgEntityResponseBody body;

    public static UpdateKgEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKgEntityResponse self = new UpdateKgEntityResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKgEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKgEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKgEntityResponse setBody(UpdateKgEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKgEntityResponseBody getBody() {
        return this.body;
    }

}

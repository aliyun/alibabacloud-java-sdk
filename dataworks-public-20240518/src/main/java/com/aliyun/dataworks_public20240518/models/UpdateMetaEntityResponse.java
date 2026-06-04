// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateMetaEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMetaEntityResponseBody body;

    public static UpdateMetaEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaEntityResponse self = new UpdateMetaEntityResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMetaEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMetaEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMetaEntityResponse setBody(UpdateMetaEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMetaEntityResponseBody getBody() {
        return this.body;
    }

}

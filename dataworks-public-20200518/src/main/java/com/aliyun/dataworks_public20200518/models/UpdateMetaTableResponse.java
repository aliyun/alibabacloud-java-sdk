// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateMetaTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMetaTableResponseBody body;

    public static UpdateMetaTableResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaTableResponse self = new UpdateMetaTableResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMetaTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMetaTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMetaTableResponse setBody(UpdateMetaTableResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMetaTableResponseBody getBody() {
        return this.body;
    }

}

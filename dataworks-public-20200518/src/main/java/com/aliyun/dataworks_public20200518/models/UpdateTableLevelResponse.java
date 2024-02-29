// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableLevelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTableLevelResponseBody body;

    public static UpdateTableLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableLevelResponse self = new UpdateTableLevelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTableLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTableLevelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTableLevelResponse setBody(UpdateTableLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTableLevelResponseBody getBody() {
        return this.body;
    }

}

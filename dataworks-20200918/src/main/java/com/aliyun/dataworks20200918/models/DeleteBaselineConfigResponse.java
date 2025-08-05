// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class DeleteBaselineConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBaselineConfigResponseBody body;

    public static DeleteBaselineConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBaselineConfigResponse self = new DeleteBaselineConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBaselineConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBaselineConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBaselineConfigResponse setBody(DeleteBaselineConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBaselineConfigResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateDevProdProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDevProdProjectResponseBody body;

    public static UpdateDevProdProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDevProdProjectResponse self = new UpdateDevProdProjectResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDevProdProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDevProdProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDevProdProjectResponse setBody(UpdateDevProdProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDevProdProjectResponseBody getBody() {
        return this.body;
    }

}

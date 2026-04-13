// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateTableFromAuthorizedOssResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTableFromAuthorizedOssResponseBody body;

    public static UpdateTableFromAuthorizedOssResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableFromAuthorizedOssResponse self = new UpdateTableFromAuthorizedOssResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTableFromAuthorizedOssResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTableFromAuthorizedOssResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTableFromAuthorizedOssResponse setBody(UpdateTableFromAuthorizedOssResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTableFromAuthorizedOssResponseBody getBody() {
        return this.body;
    }

}

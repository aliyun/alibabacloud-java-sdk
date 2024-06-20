// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class UpdateAccessControlListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAccessControlListResponseBody body;

    public static UpdateAccessControlListResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccessControlListResponse self = new UpdateAccessControlListResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAccessControlListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAccessControlListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAccessControlListResponse setBody(UpdateAccessControlListResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAccessControlListResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterBatchDisableMemberApiKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterBatchDisableMemberApiKeysResponseBody body;

    public static ModelRouterBatchDisableMemberApiKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterBatchDisableMemberApiKeysResponse self = new ModelRouterBatchDisableMemberApiKeysResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterBatchDisableMemberApiKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterBatchDisableMemberApiKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterBatchDisableMemberApiKeysResponse setBody(ModelRouterBatchDisableMemberApiKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterBatchDisableMemberApiKeysResponseBody getBody() {
        return this.body;
    }

}

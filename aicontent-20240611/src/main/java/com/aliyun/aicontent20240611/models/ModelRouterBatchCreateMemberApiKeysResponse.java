// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterBatchCreateMemberApiKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterBatchCreateMemberApiKeysResponseBody body;

    public static ModelRouterBatchCreateMemberApiKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterBatchCreateMemberApiKeysResponse self = new ModelRouterBatchCreateMemberApiKeysResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterBatchCreateMemberApiKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterBatchCreateMemberApiKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterBatchCreateMemberApiKeysResponse setBody(ModelRouterBatchCreateMemberApiKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterBatchCreateMemberApiKeysResponseBody getBody() {
        return this.body;
    }

}

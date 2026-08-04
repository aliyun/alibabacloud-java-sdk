// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterGetMemberApiKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterGetMemberApiKeysResponseBody body;

    public static ModelRouterGetMemberApiKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterGetMemberApiKeysResponse self = new ModelRouterGetMemberApiKeysResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterGetMemberApiKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterGetMemberApiKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterGetMemberApiKeysResponse setBody(ModelRouterGetMemberApiKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterGetMemberApiKeysResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterTransferToMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterTransferToMemberResponseBody body;

    public static ModelRouterTransferToMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterTransferToMemberResponse self = new ModelRouterTransferToMemberResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterTransferToMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterTransferToMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterTransferToMemberResponse setBody(ModelRouterTransferToMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterTransferToMemberResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class DeleteFeatureConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFeatureConfigResponseBody body;

    public static DeleteFeatureConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFeatureConfigResponse self = new DeleteFeatureConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFeatureConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFeatureConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFeatureConfigResponse setBody(DeleteFeatureConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFeatureConfigResponseBody getBody() {
        return this.body;
    }

}

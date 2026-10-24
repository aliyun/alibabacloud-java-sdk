// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class UpdateAssetScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAssetScopeResponseBody body;

    public static UpdateAssetScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAssetScopeResponse self = new UpdateAssetScopeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAssetScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAssetScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAssetScopeResponse setBody(UpdateAssetScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAssetScopeResponseBody getBody() {
        return this.body;
    }

}

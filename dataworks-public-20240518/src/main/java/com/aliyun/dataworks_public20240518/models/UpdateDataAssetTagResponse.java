// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataAssetTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataAssetTagResponseBody body;

    public static UpdateDataAssetTagResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataAssetTagResponse self = new UpdateDataAssetTagResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataAssetTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataAssetTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataAssetTagResponse setBody(UpdateDataAssetTagResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataAssetTagResponseBody getBody() {
        return this.body;
    }

}

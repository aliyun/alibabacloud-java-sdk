// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataAssetTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataAssetTagResponseBody body;

    public static CreateDataAssetTagResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAssetTagResponse self = new CreateDataAssetTagResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataAssetTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataAssetTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataAssetTagResponse setBody(CreateDataAssetTagResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataAssetTagResponseBody getBody() {
        return this.body;
    }

}

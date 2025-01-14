// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDataAssetTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataAssetTagResponseBody body;

    public static DeleteDataAssetTagResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataAssetTagResponse self = new DeleteDataAssetTagResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataAssetTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataAssetTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataAssetTagResponse setBody(DeleteDataAssetTagResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataAssetTagResponseBody getBody() {
        return this.body;
    }

}

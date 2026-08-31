// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateAssetAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAssetAttributesResponseBody body;

    public static UpdateAssetAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAssetAttributesResponse self = new UpdateAssetAttributesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAssetAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAssetAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAssetAttributesResponse setBody(UpdateAssetAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAssetAttributesResponseBody getBody() {
        return this.body;
    }

}

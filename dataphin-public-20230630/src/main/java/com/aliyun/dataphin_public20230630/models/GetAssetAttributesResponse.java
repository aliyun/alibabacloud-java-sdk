// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAssetAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAssetAttributesResponseBody body;

    public static GetAssetAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAssetAttributesResponse self = new GetAssetAttributesResponse();
        return TeaModel.build(map, self);
    }

    public GetAssetAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAssetAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAssetAttributesResponse setBody(GetAssetAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAssetAttributesResponseBody getBody() {
        return this.body;
    }

}

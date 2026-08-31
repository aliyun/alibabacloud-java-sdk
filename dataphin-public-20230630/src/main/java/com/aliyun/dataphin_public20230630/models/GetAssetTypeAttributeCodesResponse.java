// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAssetTypeAttributeCodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAssetTypeAttributeCodesResponseBody body;

    public static GetAssetTypeAttributeCodesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAssetTypeAttributeCodesResponse self = new GetAssetTypeAttributeCodesResponse();
        return TeaModel.build(map, self);
    }

    public GetAssetTypeAttributeCodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAssetTypeAttributeCodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAssetTypeAttributeCodesResponse setBody(GetAssetTypeAttributeCodesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAssetTypeAttributeCodesResponseBody getBody() {
        return this.body;
    }

}

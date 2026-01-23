// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAssetMappingRelationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAssetMappingRelationsResponseBody body;

    public static GetAssetMappingRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAssetMappingRelationsResponse self = new GetAssetMappingRelationsResponse();
        return TeaModel.build(map, self);
    }

    public GetAssetMappingRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAssetMappingRelationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAssetMappingRelationsResponse setBody(GetAssetMappingRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAssetMappingRelationsResponseBody getBody() {
        return this.body;
    }

}

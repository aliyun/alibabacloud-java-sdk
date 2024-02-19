// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetUpsertCollectionDataJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUpsertCollectionDataJobResponseBody body;

    public static GetUpsertCollectionDataJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUpsertCollectionDataJobResponse self = new GetUpsertCollectionDataJobResponse();
        return TeaModel.build(map, self);
    }

    public GetUpsertCollectionDataJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUpsertCollectionDataJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUpsertCollectionDataJobResponse setBody(GetUpsertCollectionDataJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUpsertCollectionDataJobResponseBody getBody() {
        return this.body;
    }

}

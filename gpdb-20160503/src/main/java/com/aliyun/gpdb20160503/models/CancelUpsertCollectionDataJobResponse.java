// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CancelUpsertCollectionDataJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelUpsertCollectionDataJobResponseBody body;

    public static CancelUpsertCollectionDataJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelUpsertCollectionDataJobResponse self = new CancelUpsertCollectionDataJobResponse();
        return TeaModel.build(map, self);
    }

    public CancelUpsertCollectionDataJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelUpsertCollectionDataJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelUpsertCollectionDataJobResponse setBody(CancelUpsertCollectionDataJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelUpsertCollectionDataJobResponseBody getBody() {
        return this.body;
    }

}

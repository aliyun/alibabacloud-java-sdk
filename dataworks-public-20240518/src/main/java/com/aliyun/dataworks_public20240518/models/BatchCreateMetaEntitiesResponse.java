// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class BatchCreateMetaEntitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCreateMetaEntitiesResponseBody body;

    public static BatchCreateMetaEntitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateMetaEntitiesResponse self = new BatchCreateMetaEntitiesResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateMetaEntitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateMetaEntitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCreateMetaEntitiesResponse setBody(BatchCreateMetaEntitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateMetaEntitiesResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class BatchDeleteMetaEntitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteMetaEntitiesResponseBody body;

    public static BatchDeleteMetaEntitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteMetaEntitiesResponse self = new BatchDeleteMetaEntitiesResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteMetaEntitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteMetaEntitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteMetaEntitiesResponse setBody(BatchDeleteMetaEntitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteMetaEntitiesResponseBody getBody() {
        return this.body;
    }

}

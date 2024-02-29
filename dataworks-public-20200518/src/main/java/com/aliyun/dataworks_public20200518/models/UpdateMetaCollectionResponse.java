// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateMetaCollectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMetaCollectionResponseBody body;

    public static UpdateMetaCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaCollectionResponse self = new UpdateMetaCollectionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMetaCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMetaCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMetaCollectionResponse setBody(UpdateMetaCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMetaCollectionResponseBody getBody() {
        return this.body;
    }

}

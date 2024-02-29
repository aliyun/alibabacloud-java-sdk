// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteMetaCollectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMetaCollectionResponseBody body;

    public static DeleteMetaCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetaCollectionResponse self = new DeleteMetaCollectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMetaCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMetaCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMetaCollectionResponse setBody(DeleteMetaCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMetaCollectionResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteMetaCollectionEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMetaCollectionEntityResponseBody body;

    public static DeleteMetaCollectionEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetaCollectionEntityResponse self = new DeleteMetaCollectionEntityResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMetaCollectionEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMetaCollectionEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMetaCollectionEntityResponse setBody(DeleteMetaCollectionEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMetaCollectionEntityResponseBody getBody() {
        return this.body;
    }

}

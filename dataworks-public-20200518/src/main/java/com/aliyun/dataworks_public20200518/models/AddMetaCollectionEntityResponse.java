// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class AddMetaCollectionEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddMetaCollectionEntityResponseBody body;

    public static AddMetaCollectionEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMetaCollectionEntityResponse self = new AddMetaCollectionEntityResponse();
        return TeaModel.build(map, self);
    }

    public AddMetaCollectionEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMetaCollectionEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMetaCollectionEntityResponse setBody(AddMetaCollectionEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMetaCollectionEntityResponseBody getBody() {
        return this.body;
    }

}

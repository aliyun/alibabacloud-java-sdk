// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListEntitiesInMetaCollectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEntitiesInMetaCollectionResponseBody body;

    public static ListEntitiesInMetaCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEntitiesInMetaCollectionResponse self = new ListEntitiesInMetaCollectionResponse();
        return TeaModel.build(map, self);
    }

    public ListEntitiesInMetaCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEntitiesInMetaCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEntitiesInMetaCollectionResponse setBody(ListEntitiesInMetaCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEntitiesInMetaCollectionResponseBody getBody() {
        return this.body;
    }

}

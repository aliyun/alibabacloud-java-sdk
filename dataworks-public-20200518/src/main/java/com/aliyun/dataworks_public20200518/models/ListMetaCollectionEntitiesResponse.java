// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMetaCollectionEntitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMetaCollectionEntitiesResponseBody body;

    public static ListMetaCollectionEntitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetaCollectionEntitiesResponse self = new ListMetaCollectionEntitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListMetaCollectionEntitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMetaCollectionEntitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMetaCollectionEntitiesResponse setBody(ListMetaCollectionEntitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMetaCollectionEntitiesResponseBody getBody() {
        return this.body;
    }

}

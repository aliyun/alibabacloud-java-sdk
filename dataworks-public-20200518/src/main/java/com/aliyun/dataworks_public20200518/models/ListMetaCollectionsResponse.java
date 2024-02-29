// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMetaCollectionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMetaCollectionsResponseBody body;

    public static ListMetaCollectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetaCollectionsResponse self = new ListMetaCollectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListMetaCollectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMetaCollectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMetaCollectionsResponse setBody(ListMetaCollectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMetaCollectionsResponseBody getBody() {
        return this.body;
    }

}

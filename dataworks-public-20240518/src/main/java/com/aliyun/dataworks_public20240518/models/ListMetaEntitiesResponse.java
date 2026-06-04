// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMetaEntitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMetaEntitiesResponseBody body;

    public static ListMetaEntitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetaEntitiesResponse self = new ListMetaEntitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListMetaEntitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMetaEntitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMetaEntitiesResponse setBody(ListMetaEntitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMetaEntitiesResponseBody getBody() {
        return this.body;
    }

}

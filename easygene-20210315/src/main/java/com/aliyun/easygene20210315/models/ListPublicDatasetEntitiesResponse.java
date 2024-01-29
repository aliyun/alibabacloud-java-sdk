// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListPublicDatasetEntitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPublicDatasetEntitiesResponseBody body;

    public static ListPublicDatasetEntitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublicDatasetEntitiesResponse self = new ListPublicDatasetEntitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListPublicDatasetEntitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublicDatasetEntitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublicDatasetEntitiesResponse setBody(ListPublicDatasetEntitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublicDatasetEntitiesResponseBody getBody() {
        return this.body;
    }

}

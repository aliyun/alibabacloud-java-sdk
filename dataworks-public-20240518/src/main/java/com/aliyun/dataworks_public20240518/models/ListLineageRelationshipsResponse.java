// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListLineageRelationshipsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLineageRelationshipsResponseBody body;

    public static ListLineageRelationshipsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLineageRelationshipsResponse self = new ListLineageRelationshipsResponse();
        return TeaModel.build(map, self);
    }

    public ListLineageRelationshipsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLineageRelationshipsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLineageRelationshipsResponse setBody(ListLineageRelationshipsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLineageRelationshipsResponseBody getBody() {
        return this.body;
    }

}

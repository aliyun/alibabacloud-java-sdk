// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListEntitiesByTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListEntitiesByTagsResponseBody body;

    public static ListEntitiesByTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEntitiesByTagsResponse self = new ListEntitiesByTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListEntitiesByTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEntitiesByTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEntitiesByTagsResponse setBody(ListEntitiesByTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEntitiesByTagsResponseBody getBody() {
        return this.body;
    }

}

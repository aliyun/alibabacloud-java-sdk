// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListBizEntitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBizEntitiesResponseBody body;

    public static ListBizEntitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBizEntitiesResponse self = new ListBizEntitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListBizEntitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBizEntitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBizEntitiesResponse setBody(ListBizEntitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBizEntitiesResponseBody getBody() {
        return this.body;
    }

}

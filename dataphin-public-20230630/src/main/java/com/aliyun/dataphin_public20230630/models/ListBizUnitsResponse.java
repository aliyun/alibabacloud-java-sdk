// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListBizUnitsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBizUnitsResponseBody body;

    public static ListBizUnitsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBizUnitsResponse self = new ListBizUnitsResponse();
        return TeaModel.build(map, self);
    }

    public ListBizUnitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBizUnitsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBizUnitsResponse setBody(ListBizUnitsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBizUnitsResponseBody getBody() {
        return this.body;
    }

}

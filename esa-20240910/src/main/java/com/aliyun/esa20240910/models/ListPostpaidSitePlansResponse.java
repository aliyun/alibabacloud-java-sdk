// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListPostpaidSitePlansResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPostpaidSitePlansResponseBody body;

    public static ListPostpaidSitePlansResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPostpaidSitePlansResponse self = new ListPostpaidSitePlansResponse();
        return TeaModel.build(map, self);
    }

    public ListPostpaidSitePlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPostpaidSitePlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPostpaidSitePlansResponse setBody(ListPostpaidSitePlansResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPostpaidSitePlansResponseBody getBody() {
        return this.body;
    }

}

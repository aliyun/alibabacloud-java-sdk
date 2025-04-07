// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListSiteRoutesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSiteRoutesResponseBody body;

    public static ListSiteRoutesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSiteRoutesResponse self = new ListSiteRoutesResponse();
        return TeaModel.build(map, self);
    }

    public ListSiteRoutesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSiteRoutesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSiteRoutesResponse setBody(ListSiteRoutesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSiteRoutesResponseBody getBody() {
        return this.body;
    }

}

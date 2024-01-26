// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListOfficeSiteOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOfficeSiteOverviewResponseBody body;

    public static ListOfficeSiteOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOfficeSiteOverviewResponse self = new ListOfficeSiteOverviewResponse();
        return TeaModel.build(map, self);
    }

    public ListOfficeSiteOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOfficeSiteOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOfficeSiteOverviewResponse setBody(ListOfficeSiteOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOfficeSiteOverviewResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVulnerabilitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVulnerabilitiesResponseBody body;

    public static ListVulnerabilitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVulnerabilitiesResponse self = new ListVulnerabilitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListVulnerabilitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVulnerabilitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVulnerabilitiesResponse setBody(ListVulnerabilitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVulnerabilitiesResponseBody getBody() {
        return this.body;
    }

}

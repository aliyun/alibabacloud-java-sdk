// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListChartReleaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChartReleaseResponseBody body;

    public static ListChartReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChartReleaseResponse self = new ListChartReleaseResponse();
        return TeaModel.build(map, self);
    }

    public ListChartReleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChartReleaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChartReleaseResponse setBody(ListChartReleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChartReleaseResponseBody getBody() {
        return this.body;
    }

}

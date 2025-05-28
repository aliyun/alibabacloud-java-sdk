// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListReportDefinitionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListReportDefinitionsResponseBody body;

    public static ListReportDefinitionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListReportDefinitionsResponse self = new ListReportDefinitionsResponse();
        return TeaModel.build(map, self);
    }

    public ListReportDefinitionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListReportDefinitionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListReportDefinitionsResponse setBody(ListReportDefinitionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListReportDefinitionsResponseBody getBody() {
        return this.body;
    }

}

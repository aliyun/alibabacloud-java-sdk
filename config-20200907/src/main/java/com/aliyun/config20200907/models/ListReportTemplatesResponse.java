// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListReportTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListReportTemplatesResponseBody body;

    public static ListReportTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListReportTemplatesResponse self = new ListReportTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListReportTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListReportTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListReportTemplatesResponse setBody(ListReportTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListReportTemplatesResponseBody getBody() {
        return this.body;
    }

}

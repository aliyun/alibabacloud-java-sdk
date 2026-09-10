// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListDataCheckReportInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataCheckReportInstanceResponseBody body;

    public static ListDataCheckReportInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataCheckReportInstanceResponse self = new ListDataCheckReportInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ListDataCheckReportInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataCheckReportInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataCheckReportInstanceResponse setBody(ListDataCheckReportInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataCheckReportInstanceResponseBody getBody() {
        return this.body;
    }

}

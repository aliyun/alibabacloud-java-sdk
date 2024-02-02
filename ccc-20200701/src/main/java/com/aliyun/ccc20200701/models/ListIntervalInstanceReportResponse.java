// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListIntervalInstanceReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIntervalInstanceReportResponseBody body;

    public static ListIntervalInstanceReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIntervalInstanceReportResponse self = new ListIntervalInstanceReportResponse();
        return TeaModel.build(map, self);
    }

    public ListIntervalInstanceReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIntervalInstanceReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIntervalInstanceReportResponse setBody(ListIntervalInstanceReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntervalInstanceReportResponseBody getBody() {
        return this.body;
    }

}

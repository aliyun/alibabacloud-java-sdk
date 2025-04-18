// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreateFixedNoAReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFixedNoAReportResponseBody body;

    public static CreateFixedNoAReportResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFixedNoAReportResponse self = new CreateFixedNoAReportResponse();
        return TeaModel.build(map, self);
    }

    public CreateFixedNoAReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFixedNoAReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFixedNoAReportResponse setBody(CreateFixedNoAReportResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFixedNoAReportResponseBody getBody() {
        return this.body;
    }

}

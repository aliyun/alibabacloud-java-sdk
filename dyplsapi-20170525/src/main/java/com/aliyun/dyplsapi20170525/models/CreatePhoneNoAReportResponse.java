// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreatePhoneNoAReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePhoneNoAReportResponseBody body;

    public static CreatePhoneNoAReportResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePhoneNoAReportResponse self = new CreatePhoneNoAReportResponse();
        return TeaModel.build(map, self);
    }

    public CreatePhoneNoAReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePhoneNoAReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePhoneNoAReportResponse setBody(CreatePhoneNoAReportResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePhoneNoAReportResponseBody getBody() {
        return this.body;
    }

}

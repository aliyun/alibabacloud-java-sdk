// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitAirWaybillExtractJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitAirWaybillExtractJobResponseBody body;

    public static SubmitAirWaybillExtractJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAirWaybillExtractJobResponse self = new SubmitAirWaybillExtractJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAirWaybillExtractJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAirWaybillExtractJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAirWaybillExtractJobResponse setBody(SubmitAirWaybillExtractJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAirWaybillExtractJobResponseBody getBody() {
        return this.body;
    }

}

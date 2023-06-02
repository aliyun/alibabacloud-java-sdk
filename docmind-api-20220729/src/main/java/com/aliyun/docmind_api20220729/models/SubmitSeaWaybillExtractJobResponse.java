// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitSeaWaybillExtractJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitSeaWaybillExtractJobResponseBody body;

    public static SubmitSeaWaybillExtractJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSeaWaybillExtractJobResponse self = new SubmitSeaWaybillExtractJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSeaWaybillExtractJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSeaWaybillExtractJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSeaWaybillExtractJobResponse setBody(SubmitSeaWaybillExtractJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSeaWaybillExtractJobResponseBody getBody() {
        return this.body;
    }

}

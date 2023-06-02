// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitPackingListExtractJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitPackingListExtractJobResponseBody body;

    public static SubmitPackingListExtractJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitPackingListExtractJobResponse self = new SubmitPackingListExtractJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitPackingListExtractJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitPackingListExtractJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitPackingListExtractJobResponse setBody(SubmitPackingListExtractJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitPackingListExtractJobResponseBody getBody() {
        return this.body;
    }

}

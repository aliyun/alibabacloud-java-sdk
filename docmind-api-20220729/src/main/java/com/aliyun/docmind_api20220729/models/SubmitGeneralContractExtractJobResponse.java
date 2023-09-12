// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitGeneralContractExtractJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitGeneralContractExtractJobResponseBody body;

    public static SubmitGeneralContractExtractJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitGeneralContractExtractJobResponse self = new SubmitGeneralContractExtractJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitGeneralContractExtractJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitGeneralContractExtractJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitGeneralContractExtractJobResponse setBody(SubmitGeneralContractExtractJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitGeneralContractExtractJobResponseBody getBody() {
        return this.body;
    }

}

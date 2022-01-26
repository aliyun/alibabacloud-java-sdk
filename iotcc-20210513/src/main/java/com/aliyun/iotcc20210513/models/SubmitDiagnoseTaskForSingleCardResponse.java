// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class SubmitDiagnoseTaskForSingleCardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitDiagnoseTaskForSingleCardResponseBody body;

    public static SubmitDiagnoseTaskForSingleCardResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDiagnoseTaskForSingleCardResponse self = new SubmitDiagnoseTaskForSingleCardResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDiagnoseTaskForSingleCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDiagnoseTaskForSingleCardResponse setBody(SubmitDiagnoseTaskForSingleCardResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDiagnoseTaskForSingleCardResponseBody getBody() {
        return this.body;
    }

}

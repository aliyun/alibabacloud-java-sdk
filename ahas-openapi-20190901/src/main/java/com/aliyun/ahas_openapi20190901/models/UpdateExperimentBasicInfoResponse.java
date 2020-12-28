// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class UpdateExperimentBasicInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateExperimentBasicInfoResponseBody body;

    public static UpdateExperimentBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentBasicInfoResponse self = new UpdateExperimentBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentBasicInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExperimentBasicInfoResponse setBody(UpdateExperimentBasicInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExperimentBasicInfoResponseBody getBody() {
        return this.body;
    }

}

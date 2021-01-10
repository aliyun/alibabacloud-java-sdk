// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitImageQualityJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitImageQualityJobResponseBody body;

    public static SubmitImageQualityJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageQualityJobResponse self = new SubmitImageQualityJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitImageQualityJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitImageQualityJobResponse setBody(SubmitImageQualityJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitImageQualityJobResponseBody getBody() {
        return this.body;
    }

}

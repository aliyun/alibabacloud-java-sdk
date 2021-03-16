// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitVideoQualityJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitVideoQualityJobResponseBody body;

    public static SubmitVideoQualityJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoQualityJobResponse self = new SubmitVideoQualityJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitVideoQualityJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitVideoQualityJobResponse setBody(SubmitVideoQualityJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitVideoQualityJobResponseBody getBody() {
        return this.body;
    }

}

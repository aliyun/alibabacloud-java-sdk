// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitVideoSummaryJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitVideoSummaryJobResponseBody body;

    public static SubmitVideoSummaryJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoSummaryJobResponse self = new SubmitVideoSummaryJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitVideoSummaryJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitVideoSummaryJobResponse setBody(SubmitVideoSummaryJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitVideoSummaryJobResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitVideoSplitJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitVideoSplitJobResponseBody body;

    public static SubmitVideoSplitJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoSplitJobResponse self = new SubmitVideoSplitJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitVideoSplitJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitVideoSplitJobResponse setBody(SubmitVideoSplitJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitVideoSplitJobResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitFpCompareJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitFpCompareJobResponseBody body;

    public static SubmitFpCompareJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitFpCompareJobResponse self = new SubmitFpCompareJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitFpCompareJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitFpCompareJobResponse setBody(SubmitFpCompareJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitFpCompareJobResponseBody getBody() {
        return this.body;
    }

}

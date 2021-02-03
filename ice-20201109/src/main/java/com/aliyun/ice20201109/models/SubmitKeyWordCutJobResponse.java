// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitKeyWordCutJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitKeyWordCutJobResponseBody body;

    public static SubmitKeyWordCutJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitKeyWordCutJobResponse self = new SubmitKeyWordCutJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitKeyWordCutJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitKeyWordCutJobResponse setBody(SubmitKeyWordCutJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitKeyWordCutJobResponseBody getBody() {
        return this.body;
    }

}

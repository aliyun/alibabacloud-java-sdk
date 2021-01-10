// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitTerrorismJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitTerrorismJobResponseBody body;

    public static SubmitTerrorismJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTerrorismJobResponse self = new SubmitTerrorismJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTerrorismJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTerrorismJobResponse setBody(SubmitTerrorismJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTerrorismJobResponseBody getBody() {
        return this.body;
    }

}

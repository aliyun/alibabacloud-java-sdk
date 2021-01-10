// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitAnnotationJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitAnnotationJobResponseBody body;

    public static SubmitAnnotationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAnnotationJobResponse self = new SubmitAnnotationJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAnnotationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAnnotationJobResponse setBody(SubmitAnnotationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAnnotationJobResponseBody getBody() {
        return this.body;
    }

}

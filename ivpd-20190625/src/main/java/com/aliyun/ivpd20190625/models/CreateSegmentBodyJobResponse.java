// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class CreateSegmentBodyJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSegmentBodyJobResponseBody body;

    public static CreateSegmentBodyJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSegmentBodyJobResponse self = new CreateSegmentBodyJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateSegmentBodyJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSegmentBodyJobResponse setBody(CreateSegmentBodyJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSegmentBodyJobResponseBody getBody() {
        return this.body;
    }

}

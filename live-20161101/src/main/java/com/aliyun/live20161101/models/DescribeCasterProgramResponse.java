// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterProgramResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCasterProgramResponseBody body;

    public static DescribeCasterProgramResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterProgramResponse self = new DescribeCasterProgramResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterProgramResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCasterProgramResponse setBody(DescribeCasterProgramResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCasterProgramResponseBody getBody() {
        return this.body;
    }

}

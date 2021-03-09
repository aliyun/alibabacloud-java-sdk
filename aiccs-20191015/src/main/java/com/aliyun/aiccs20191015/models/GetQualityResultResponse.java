// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetQualityResultResponseBody body;

    public static GetQualityResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityResultResponse self = new GetQualityResultResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityResultResponse setBody(GetQualityResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityResultResponseBody getBody() {
        return this.body;
    }

}

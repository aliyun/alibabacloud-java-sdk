// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetOutAccountBindDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOutAccountBindDetailResponseBody body;

    public static GetOutAccountBindDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOutAccountBindDetailResponse self = new GetOutAccountBindDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetOutAccountBindDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOutAccountBindDetailResponse setBody(GetOutAccountBindDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOutAccountBindDetailResponseBody getBody() {
        return this.body;
    }

}

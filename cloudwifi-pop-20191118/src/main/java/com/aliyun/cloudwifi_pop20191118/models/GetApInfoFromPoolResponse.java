// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApInfoFromPoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetApInfoFromPoolResponseBody body;

    public static GetApInfoFromPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApInfoFromPoolResponse self = new GetApInfoFromPoolResponse();
        return TeaModel.build(map, self);
    }

    public GetApInfoFromPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApInfoFromPoolResponse setBody(GetApInfoFromPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApInfoFromPoolResponseBody getBody() {
        return this.body;
    }

}

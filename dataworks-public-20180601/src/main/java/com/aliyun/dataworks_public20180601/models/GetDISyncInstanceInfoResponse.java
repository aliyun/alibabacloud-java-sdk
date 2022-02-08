// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class GetDISyncInstanceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDISyncInstanceInfoResponseBody body;

    public static GetDISyncInstanceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncInstanceInfoResponse self = new GetDISyncInstanceInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDISyncInstanceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDISyncInstanceInfoResponse setBody(GetDISyncInstanceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDISyncInstanceInfoResponseBody getBody() {
        return this.body;
    }

}

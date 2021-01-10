// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetDevicePurifyJobByJobIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDevicePurifyJobByJobIdResponseBody body;

    public static GetDevicePurifyJobByJobIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDevicePurifyJobByJobIdResponse self = new GetDevicePurifyJobByJobIdResponse();
        return TeaModel.build(map, self);
    }

    public GetDevicePurifyJobByJobIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDevicePurifyJobByJobIdResponse setBody(GetDevicePurifyJobByJobIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDevicePurifyJobByJobIdResponseBody getBody() {
        return this.body;
    }

}

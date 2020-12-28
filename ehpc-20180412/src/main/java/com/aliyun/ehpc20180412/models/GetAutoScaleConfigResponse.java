// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetAutoScaleConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAutoScaleConfigResponseBody body;

    public static GetAutoScaleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScaleConfigResponse self = new GetAutoScaleConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetAutoScaleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutoScaleConfigResponse setBody(GetAutoScaleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutoScaleConfigResponseBody getBody() {
        return this.body;
    }

}

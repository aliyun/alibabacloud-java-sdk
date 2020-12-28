// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetIfEcsTypeSupportHtConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetIfEcsTypeSupportHtConfigResponseBody body;

    public static GetIfEcsTypeSupportHtConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIfEcsTypeSupportHtConfigResponse self = new GetIfEcsTypeSupportHtConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetIfEcsTypeSupportHtConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIfEcsTypeSupportHtConfigResponse setBody(GetIfEcsTypeSupportHtConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIfEcsTypeSupportHtConfigResponseBody getBody() {
        return this.body;
    }

}

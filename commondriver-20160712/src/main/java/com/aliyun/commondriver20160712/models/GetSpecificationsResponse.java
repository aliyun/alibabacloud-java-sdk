// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class GetSpecificationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSpecificationsResponseBody body;

    public static GetSpecificationsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSpecificationsResponse self = new GetSpecificationsResponse();
        return TeaModel.build(map, self);
    }

    public GetSpecificationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSpecificationsResponse setBody(GetSpecificationsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSpecificationsResponseBody getBody() {
        return this.body;
    }

}

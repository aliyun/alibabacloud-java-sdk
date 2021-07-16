// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceGroupResponseBody body;

    public static GetServiceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceGroupResponse self = new GetServiceGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceGroupResponse setBody(GetServiceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceGroupResponseBody getBody() {
        return this.body;
    }

}

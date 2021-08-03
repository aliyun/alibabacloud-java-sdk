// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RecreateDesktopGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecreateDesktopGroupResponseBody body;

    public static RecreateDesktopGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RecreateDesktopGroupResponse self = new RecreateDesktopGroupResponse();
        return TeaModel.build(map, self);
    }

    public RecreateDesktopGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecreateDesktopGroupResponse setBody(RecreateDesktopGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RecreateDesktopGroupResponseBody getBody() {
        return this.body;
    }

}

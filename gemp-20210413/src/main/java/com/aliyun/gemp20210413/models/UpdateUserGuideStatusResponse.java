// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateUserGuideStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateUserGuideStatusResponseBody body;

    public static UpdateUserGuideStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserGuideStatusResponse self = new UpdateUserGuideStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserGuideStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserGuideStatusResponse setBody(UpdateUserGuideStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserGuideStatusResponseBody getBody() {
        return this.body;
    }

}

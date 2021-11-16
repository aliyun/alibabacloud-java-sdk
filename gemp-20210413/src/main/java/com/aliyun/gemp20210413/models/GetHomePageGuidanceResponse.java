// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetHomePageGuidanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHomePageGuidanceResponseBody body;

    public static GetHomePageGuidanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHomePageGuidanceResponse self = new GetHomePageGuidanceResponse();
        return TeaModel.build(map, self);
    }

    public GetHomePageGuidanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHomePageGuidanceResponse setBody(GetHomePageGuidanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHomePageGuidanceResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApgroupIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetApgroupIdResponseBody body;

    public static GetApgroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApgroupIdResponse self = new GetApgroupIdResponse();
        return TeaModel.build(map, self);
    }

    public GetApgroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApgroupIdResponse setBody(GetApgroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApgroupIdResponseBody getBody() {
        return this.body;
    }

}

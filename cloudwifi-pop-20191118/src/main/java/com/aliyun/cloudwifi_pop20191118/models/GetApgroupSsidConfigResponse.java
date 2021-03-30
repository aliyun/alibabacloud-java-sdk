// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApgroupSsidConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetApgroupSsidConfigResponseBody body;

    public static GetApgroupSsidConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApgroupSsidConfigResponse self = new GetApgroupSsidConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetApgroupSsidConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApgroupSsidConfigResponse setBody(GetApgroupSsidConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApgroupSsidConfigResponseBody getBody() {
        return this.body;
    }

}

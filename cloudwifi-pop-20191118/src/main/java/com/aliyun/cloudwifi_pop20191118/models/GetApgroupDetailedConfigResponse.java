// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApgroupDetailedConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetApgroupDetailedConfigResponseBody body;

    public static GetApgroupDetailedConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApgroupDetailedConfigResponse self = new GetApgroupDetailedConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetApgroupDetailedConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApgroupDetailedConfigResponse setBody(GetApgroupDetailedConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApgroupDetailedConfigResponseBody getBody() {
        return this.body;
    }

}

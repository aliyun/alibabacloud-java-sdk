// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApgroupConfigByIdentityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetApgroupConfigByIdentityResponseBody body;

    public static GetApgroupConfigByIdentityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApgroupConfigByIdentityResponse self = new GetApgroupConfigByIdentityResponse();
        return TeaModel.build(map, self);
    }

    public GetApgroupConfigByIdentityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApgroupConfigByIdentityResponse setBody(GetApgroupConfigByIdentityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApgroupConfigByIdentityResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenInterRegionTrafficQosPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCenInterRegionTrafficQosPolicyResponseBody body;

    public static CreateCenInterRegionTrafficQosPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCenInterRegionTrafficQosPolicyResponse self = new CreateCenInterRegionTrafficQosPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateCenInterRegionTrafficQosPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCenInterRegionTrafficQosPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCenInterRegionTrafficQosPolicyResponse setBody(CreateCenInterRegionTrafficQosPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCenInterRegionTrafficQosPolicyResponseBody getBody() {
        return this.body;
    }

}

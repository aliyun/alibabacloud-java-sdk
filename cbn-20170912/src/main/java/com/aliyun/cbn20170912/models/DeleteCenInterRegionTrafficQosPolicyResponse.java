// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteCenInterRegionTrafficQosPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCenInterRegionTrafficQosPolicyResponseBody body;

    public static DeleteCenInterRegionTrafficQosPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCenInterRegionTrafficQosPolicyResponse self = new DeleteCenInterRegionTrafficQosPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCenInterRegionTrafficQosPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCenInterRegionTrafficQosPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCenInterRegionTrafficQosPolicyResponse setBody(DeleteCenInterRegionTrafficQosPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCenInterRegionTrafficQosPolicyResponseBody getBody() {
        return this.body;
    }

}

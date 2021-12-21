// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteCenInterRegionTrafficQosPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteCenInterRegionTrafficQosPolicyResponse setBody(DeleteCenInterRegionTrafficQosPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCenInterRegionTrafficQosPolicyResponseBody getBody() {
        return this.body;
    }

}

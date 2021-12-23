// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerAddressTypeConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLoadBalancerAddressTypeConfigResponseBody body;

    public static UpdateLoadBalancerAddressTypeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerAddressTypeConfigResponse self = new UpdateLoadBalancerAddressTypeConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerAddressTypeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLoadBalancerAddressTypeConfigResponse setBody(UpdateLoadBalancerAddressTypeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLoadBalancerAddressTypeConfigResponseBody getBody() {
        return this.body;
    }

}

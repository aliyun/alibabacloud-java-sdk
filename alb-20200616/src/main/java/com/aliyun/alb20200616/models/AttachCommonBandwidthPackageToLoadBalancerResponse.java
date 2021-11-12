// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class AttachCommonBandwidthPackageToLoadBalancerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachCommonBandwidthPackageToLoadBalancerResponseBody body;

    public static AttachCommonBandwidthPackageToLoadBalancerResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachCommonBandwidthPackageToLoadBalancerResponse self = new AttachCommonBandwidthPackageToLoadBalancerResponse();
        return TeaModel.build(map, self);
    }

    public AttachCommonBandwidthPackageToLoadBalancerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachCommonBandwidthPackageToLoadBalancerResponse setBody(AttachCommonBandwidthPackageToLoadBalancerResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachCommonBandwidthPackageToLoadBalancerResponseBody getBody() {
        return this.body;
    }

}

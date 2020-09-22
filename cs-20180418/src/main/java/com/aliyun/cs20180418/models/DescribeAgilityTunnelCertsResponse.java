// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DescribeAgilityTunnelCertsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DescribeAgilityTunnelCertsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgilityTunnelCertsResponse self = new DescribeAgilityTunnelCertsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAgilityTunnelCertsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}

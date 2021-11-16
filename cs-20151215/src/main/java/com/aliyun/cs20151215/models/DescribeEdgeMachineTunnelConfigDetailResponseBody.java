// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEdgeMachineTunnelConfigDetailResponseBody extends TeaModel {
    // device name
    @NameInMap("device_name")
    public String deviceName;

    // Id of the request
    @NameInMap("model")
    public String model;

    // product key
    @NameInMap("product_key")
    public String productKey;

    // request id
    @NameInMap("request_id")
    public String requestId;

    // sn
    @NameInMap("sn")
    public String sn;

    // token
    @NameInMap("token")
    public String token;

    // tunnel endpoint
    @NameInMap("tunnel_endpoint")
    public String tunnelEndpoint;

    public static DescribeEdgeMachineTunnelConfigDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdgeMachineTunnelConfigDetailResponseBody self = new DescribeEdgeMachineTunnelConfigDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEdgeMachineTunnelConfigDetailResponseBody setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public DescribeEdgeMachineTunnelConfigDetailResponseBody setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public DescribeEdgeMachineTunnelConfigDetailResponseBody setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public DescribeEdgeMachineTunnelConfigDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEdgeMachineTunnelConfigDetailResponseBody setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public DescribeEdgeMachineTunnelConfigDetailResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public DescribeEdgeMachineTunnelConfigDetailResponseBody setTunnelEndpoint(String tunnelEndpoint) {
        this.tunnelEndpoint = tunnelEndpoint;
        return this;
    }
    public String getTunnelEndpoint() {
        return this.tunnelEndpoint;
    }

}

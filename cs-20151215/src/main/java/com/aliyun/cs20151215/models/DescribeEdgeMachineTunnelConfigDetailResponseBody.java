// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEdgeMachineTunnelConfigDetailResponseBody extends TeaModel {
    /**
     * <p>The name of the cloud-native box.</p>
     */
    @NameInMap("device_name")
    public String deviceName;

    /**
     * <p>The model of the cloud-native box.</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>The product key.</p>
     */
    @NameInMap("product_key")
    public String productKey;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <p>The serial number of the cloud-native box.</p>
     */
    @NameInMap("sn")
    public String sn;

    /**
     * <p>The token.</p>
     */
    @NameInMap("token")
    public String token;

    /**
     * <p>The backend endpoint of the tunnel.</p>
     */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeL7RsPolicyResponseBody extends TeaModel {
    /**
     * <p>The details of the parameters for back-to-origin.</p>
     */
    @NameInMap("Attributes")
    public java.util.List<DescribeL7RsPolicyResponseBodyAttributes> attributes;

    /**
     * <p>The scheduling algorithm for back-to-origin traffic. Valid values:</p>
     * <br>
     * <p>*   **ip_hash**: the IP hash algorithm. This algorithm is used to redirect the requests from the same IP address to the same origin server.</p>
     * <p>*   **rr**: the round-robin algorithm. This algorithm is used to redirect requests to origin servers in turn.</p>
     * <p>*   **least_time**: the least response time algorithm. This algorithm is used to minimize the latency when requests are forwarded from Anti-DDoS Pro or Anti-DDoS Premium instances to origin servers based on the intelligent DNS resolution feature.</p>
     */
    @NameInMap("ProxyMode")
    public String proxyMode;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeL7RsPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeL7RsPolicyResponseBody self = new DescribeL7RsPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeL7RsPolicyResponseBody setAttributes(java.util.List<DescribeL7RsPolicyResponseBodyAttributes> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.List<DescribeL7RsPolicyResponseBodyAttributes> getAttributes() {
        return this.attributes;
    }

    public DescribeL7RsPolicyResponseBody setProxyMode(String proxyMode) {
        this.proxyMode = proxyMode;
        return this;
    }
    public String getProxyMode() {
        return this.proxyMode;
    }

    public DescribeL7RsPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeL7RsPolicyResponseBodyAttributesAttribute extends TeaModel {
        /**
         * <p>The weight of the origin server. This parameter takes effect only when **ProxyMode** is set to **rr**.</p>
         * <br>
         * <p>Valid values: **1** to **100**. Default value: **100**. A server with a higher weight receives more requests.</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static DescribeL7RsPolicyResponseBodyAttributesAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeL7RsPolicyResponseBodyAttributesAttribute self = new DescribeL7RsPolicyResponseBodyAttributesAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeL7RsPolicyResponseBodyAttributesAttribute setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeL7RsPolicyResponseBodyAttributes extends TeaModel {
        /**
         * <p>The parameter for back-to-origin.</p>
         */
        @NameInMap("Attribute")
        public DescribeL7RsPolicyResponseBodyAttributesAttribute attribute;

        /**
         * <p>The address of the origin server.</p>
         */
        @NameInMap("RealServer")
        public String realServer;

        /**
         * <p>The address type of the origin server. Valid values:</p>
         * <br>
         * <p>*   **0**: IP address</p>
         * <p>*   **1**: domain name</p>
         */
        @NameInMap("RsType")
        public Integer rsType;

        public static DescribeL7RsPolicyResponseBodyAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeL7RsPolicyResponseBodyAttributes self = new DescribeL7RsPolicyResponseBodyAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeL7RsPolicyResponseBodyAttributes setAttribute(DescribeL7RsPolicyResponseBodyAttributesAttribute attribute) {
            this.attribute = attribute;
            return this;
        }
        public DescribeL7RsPolicyResponseBodyAttributesAttribute getAttribute() {
            return this.attribute;
        }

        public DescribeL7RsPolicyResponseBodyAttributes setRealServer(String realServer) {
            this.realServer = realServer;
            return this;
        }
        public String getRealServer() {
            return this.realServer;
        }

        public DescribeL7RsPolicyResponseBodyAttributes setRsType(Integer rsType) {
            this.rsType = rsType;
            return this;
        }
        public Integer getRsType() {
            return this.rsType;
        }

    }

}

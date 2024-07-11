// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeL7RsPolicyResponseBody extends TeaModel {
    /**
     * <p>The details about the parameters for back-to-origin processing.</p>
     */
    @NameInMap("Attributes")
    public java.util.List<DescribeL7RsPolicyResponseBodyAttributes> attributes;

    /**
     * <p>The scheduling algorithm for back-to-origin traffic. Valid values:</p>
     * <ul>
     * <li><strong>ip_hash</strong>: the IP hash algorithm. This algorithm is used to redirect the requests from the same IP address to the same origin server.</li>
     * <li><strong>rr</strong>: the round-robin algorithm. This algorithm is used to redirect requests to origin servers in turn.</li>
     * <li><strong>least_time</strong>: the least response time algorithm. This algorithm is used to minimize the latency when requests are forwarded from Anti-DDoS Pro or Anti-DDoS Premium instances to origin servers based on the intelligent DNS resolution feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rr</p>
     */
    @NameInMap("ProxyMode")
    public String proxyMode;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9E7F6B2C-03F2-462F-9076-B782CF0DD502</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The back-to-origin retry switch. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: on</li>
     * <li><strong>0</strong>: off</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UpstreamRetry")
    public Integer upstreamRetry;

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

    public DescribeL7RsPolicyResponseBody setUpstreamRetry(Integer upstreamRetry) {
        this.upstreamRetry = upstreamRetry;
        return this;
    }
    public Integer getUpstreamRetry() {
        return this.upstreamRetry;
    }

    public static class DescribeL7RsPolicyResponseBodyAttributesAttribute extends TeaModel {
        /**
         * <p>The timeout period for a new connection. Valid values: <strong>1</strong> to <strong>10</strong>. Unit: seconds. Default value: <strong>5</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ConnectTimeout")
        public Integer connectTimeout;

        /**
         * <p>The expiration time of a connection, in seconds. If the number of failures at the origin server exceeds the <strong>MaxFails</strong> value, the address of the origin server is set to down and the expiration time is <strong>FailTimeout</strong>. The final value is the maximum value of <strong>ConnectTimeout</strong> and <strong>FailTimeout</strong>. Valid values: <strong>1</strong> to <strong>3600</strong>. Unit: seconds. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FailTimeout")
        public Integer failTimeout;

        /**
         * <p>The maximum number of failures. This parameter is related to health check. Valid values: <strong>1</strong> to <strong>10</strong>. Unit: seconds. Default value: <strong>3</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxFails")
        public Integer maxFails;

        /**
         * <p>The primary/secondary flag. Valid values:</p>
         * <ul>
         * <li><strong>active</strong>: primary</li>
         * <li><strong>backup</strong>: secondary</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The timeout period for a read connection. Valid values: <strong>10</strong> to <strong>300</strong>. Unit: seconds. Default value: <strong>120</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("ReadTimeout")
        public Integer readTimeout;

        /**
         * <p>The timeout period for a write connection. Valid values: <strong>10</strong> to <strong>300</strong>. Unit: seconds. Default value: <strong>120</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("SendTimeout")
        public Integer sendTimeout;

        /**
         * <p>The weight of the origin server. This parameter takes effect only when <strong>ProxyMode</strong> is set to <strong>rr</strong>.</p>
         * <p>Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>100</strong>. A server with a higher weight receives more requests.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static DescribeL7RsPolicyResponseBodyAttributesAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeL7RsPolicyResponseBodyAttributesAttribute self = new DescribeL7RsPolicyResponseBodyAttributesAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeL7RsPolicyResponseBodyAttributesAttribute setConnectTimeout(Integer connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }
        public Integer getConnectTimeout() {
            return this.connectTimeout;
        }

        public DescribeL7RsPolicyResponseBodyAttributesAttribute setFailTimeout(Integer failTimeout) {
            this.failTimeout = failTimeout;
            return this;
        }
        public Integer getFailTimeout() {
            return this.failTimeout;
        }

        public DescribeL7RsPolicyResponseBodyAttributesAttribute setMaxFails(Integer maxFails) {
            this.maxFails = maxFails;
            return this;
        }
        public Integer getMaxFails() {
            return this.maxFails;
        }

        public DescribeL7RsPolicyResponseBodyAttributesAttribute setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeL7RsPolicyResponseBodyAttributesAttribute setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }
        public Integer getReadTimeout() {
            return this.readTimeout;
        }

        public DescribeL7RsPolicyResponseBodyAttributesAttribute setSendTimeout(Integer sendTimeout) {
            this.sendTimeout = sendTimeout;
            return this;
        }
        public Integer getSendTimeout() {
            return this.sendTimeout;
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
         * <p>The parameter for back-to-origin processing.</p>
         */
        @NameInMap("Attribute")
        public DescribeL7RsPolicyResponseBodyAttributesAttribute attribute;

        /**
         * <p>The address of the origin server.</p>
         * 
         * <strong>example:</strong>
         * <p>1.<em><strong>.</strong></em>.1</p>
         */
        @NameInMap("RealServer")
        public String realServer;

        /**
         * <p>The address type of the origin server. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: IP address</li>
         * <li><strong>1</strong>: domain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeL7RsPolicyResponseBody extends TeaModel {
    @NameInMap("Attributes")
    public java.util.List<DescribeL7RsPolicyResponseBodyAttributes> attributes;

    @NameInMap("ProxyMode")
    public String proxyMode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RsAttrRwTimeoutMax")
    public Long rsAttrRwTimeoutMax;

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

    public DescribeL7RsPolicyResponseBody setRsAttrRwTimeoutMax(Long rsAttrRwTimeoutMax) {
        this.rsAttrRwTimeoutMax = rsAttrRwTimeoutMax;
        return this;
    }
    public Long getRsAttrRwTimeoutMax() {
        return this.rsAttrRwTimeoutMax;
    }

    public DescribeL7RsPolicyResponseBody setUpstreamRetry(Integer upstreamRetry) {
        this.upstreamRetry = upstreamRetry;
        return this;
    }
    public Integer getUpstreamRetry() {
        return this.upstreamRetry;
    }

    public static class DescribeL7RsPolicyResponseBodyAttributesAttribute extends TeaModel {
        @NameInMap("ConnectTimeout")
        public Integer connectTimeout;

        @NameInMap("FailTimeout")
        public Integer failTimeout;

        @NameInMap("MaxFails")
        public Integer maxFails;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("ReadTimeout")
        public Integer readTimeout;

        @NameInMap("SendTimeout")
        public Integer sendTimeout;

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
        @NameInMap("Attribute")
        public DescribeL7RsPolicyResponseBodyAttributesAttribute attribute;

        @NameInMap("RealServer")
        public String realServer;

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

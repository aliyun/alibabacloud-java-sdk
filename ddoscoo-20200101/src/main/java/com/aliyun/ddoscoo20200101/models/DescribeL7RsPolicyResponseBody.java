// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeL7RsPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Attributes")
    public java.util.List<DescribeL7RsPolicyResponseBodyAttributes> attributes;

    @NameInMap("ProxyMode")
    public String proxyMode;

    public static DescribeL7RsPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeL7RsPolicyResponseBody self = new DescribeL7RsPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeL7RsPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public static class DescribeL7RsPolicyResponseBodyAttributesAttribute extends TeaModel {
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
        @NameInMap("RsType")
        public Integer rsType;

        @NameInMap("Attribute")
        public DescribeL7RsPolicyResponseBodyAttributesAttribute attribute;

        @NameInMap("RealServer")
        public String realServer;

        public static DescribeL7RsPolicyResponseBodyAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeL7RsPolicyResponseBodyAttributes self = new DescribeL7RsPolicyResponseBodyAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeL7RsPolicyResponseBodyAttributes setRsType(Integer rsType) {
            this.rsType = rsType;
            return this;
        }
        public Integer getRsType() {
            return this.rsType;
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

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCustomPortsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WebCustomPorts")
    public java.util.List<DescribeWebCustomPortsResponseBodyWebCustomPorts> webCustomPorts;

    public static DescribeWebCustomPortsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebCustomPortsResponseBody self = new DescribeWebCustomPortsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebCustomPortsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebCustomPortsResponseBody setWebCustomPorts(java.util.List<DescribeWebCustomPortsResponseBodyWebCustomPorts> webCustomPorts) {
        this.webCustomPorts = webCustomPorts;
        return this;
    }
    public java.util.List<DescribeWebCustomPortsResponseBodyWebCustomPorts> getWebCustomPorts() {
        return this.webCustomPorts;
    }

    public static class DescribeWebCustomPortsResponseBodyWebCustomPorts extends TeaModel {
        @NameInMap("ProxyPorts")
        public java.util.List<String> proxyPorts;

        @NameInMap("ProxyType")
        public String proxyType;

        public static DescribeWebCustomPortsResponseBodyWebCustomPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebCustomPortsResponseBodyWebCustomPorts self = new DescribeWebCustomPortsResponseBodyWebCustomPorts();
            return TeaModel.build(map, self);
        }

        public DescribeWebCustomPortsResponseBodyWebCustomPorts setProxyPorts(java.util.List<String> proxyPorts) {
            this.proxyPorts = proxyPorts;
            return this;
        }
        public java.util.List<String> getProxyPorts() {
            return this.proxyPorts;
        }

        public DescribeWebCustomPortsResponseBodyWebCustomPorts setProxyType(String proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        public String getProxyType() {
            return this.proxyType;
        }

    }

}

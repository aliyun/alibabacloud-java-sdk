// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCustomPortsResponseBody extends TeaModel {
    /**
     * <p>The ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>0bcf28g5-d57c-11e7-9bs0-d89d6717dxbc</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The custom port information for website services.</p>
     */
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
        /**
         * <p>The available port range.</p>
         */
        @NameInMap("ProxyPorts")
        public java.util.List<String> proxyPorts;

        /**
         * <p>The Protocol Type. Valid values:</p>
         * <ul>
         * <li><p><strong>http</strong></p>
         * </li>
         * <li><p><strong>https</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
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

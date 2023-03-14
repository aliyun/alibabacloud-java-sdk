// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ListLayer7CustomPortsResponseBody extends TeaModel {
    @NameInMap("Layer7CustomPorts")
    public java.util.List<ListLayer7CustomPortsResponseBodyLayer7CustomPorts> layer7CustomPorts;

    @NameInMap("RequestId")
    public String requestId;

    public static ListLayer7CustomPortsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLayer7CustomPortsResponseBody self = new ListLayer7CustomPortsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLayer7CustomPortsResponseBody setLayer7CustomPorts(java.util.List<ListLayer7CustomPortsResponseBodyLayer7CustomPorts> layer7CustomPorts) {
        this.layer7CustomPorts = layer7CustomPorts;
        return this;
    }
    public java.util.List<ListLayer7CustomPortsResponseBodyLayer7CustomPorts> getLayer7CustomPorts() {
        return this.layer7CustomPorts;
    }

    public ListLayer7CustomPortsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLayer7CustomPortsResponseBodyLayer7CustomPorts extends TeaModel {
        @NameInMap("Flag")
        public String flag;

        @NameInMap("ProxyPorts")
        public java.util.List<String> proxyPorts;

        @NameInMap("ProxyType")
        public String proxyType;

        public static ListLayer7CustomPortsResponseBodyLayer7CustomPorts build(java.util.Map<String, ?> map) throws Exception {
            ListLayer7CustomPortsResponseBodyLayer7CustomPorts self = new ListLayer7CustomPortsResponseBodyLayer7CustomPorts();
            return TeaModel.build(map, self);
        }

        public ListLayer7CustomPortsResponseBodyLayer7CustomPorts setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public ListLayer7CustomPortsResponseBodyLayer7CustomPorts setProxyPorts(java.util.List<String> proxyPorts) {
            this.proxyPorts = proxyPorts;
            return this;
        }
        public java.util.List<String> getProxyPorts() {
            return this.proxyPorts;
        }

        public ListLayer7CustomPortsResponseBodyLayer7CustomPorts setProxyType(String proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        public String getProxyType() {
            return this.proxyType;
        }

    }

}

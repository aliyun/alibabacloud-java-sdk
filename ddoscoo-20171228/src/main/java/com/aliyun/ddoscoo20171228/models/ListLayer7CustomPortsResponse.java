// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ListLayer7CustomPortsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Layer7CustomPorts")
    @Validation(required = true)
    public java.util.List<ListLayer7CustomPortsResponseLayer7CustomPorts> layer7CustomPorts;

    public static ListLayer7CustomPortsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLayer7CustomPortsResponse self = new ListLayer7CustomPortsResponse();
        return TeaModel.build(map, self);
    }

    public ListLayer7CustomPortsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLayer7CustomPortsResponse setLayer7CustomPorts(java.util.List<ListLayer7CustomPortsResponseLayer7CustomPorts> layer7CustomPorts) {
        this.layer7CustomPorts = layer7CustomPorts;
        return this;
    }
    public java.util.List<ListLayer7CustomPortsResponseLayer7CustomPorts> getLayer7CustomPorts() {
        return this.layer7CustomPorts;
    }

    public static class ListLayer7CustomPortsResponseLayer7CustomPorts extends TeaModel {
        @NameInMap("ProxyType")
        @Validation(required = true)
        public String proxyType;

        @NameInMap("ProxyPorts")
        @Validation(required = true)
        public java.util.List<String> proxyPorts;

        public static ListLayer7CustomPortsResponseLayer7CustomPorts build(java.util.Map<String, ?> map) throws Exception {
            ListLayer7CustomPortsResponseLayer7CustomPorts self = new ListLayer7CustomPortsResponseLayer7CustomPorts();
            return TeaModel.build(map, self);
        }

        public ListLayer7CustomPortsResponseLayer7CustomPorts setProxyType(String proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        public String getProxyType() {
            return this.proxyType;
        }

        public ListLayer7CustomPortsResponseLayer7CustomPorts setProxyPorts(java.util.List<String> proxyPorts) {
            this.proxyPorts = proxyPorts;
            return this;
        }
        public java.util.List<String> getProxyPorts() {
            return this.proxyPorts;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class ListGreInterfacesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IoTCloudConnectorGatewayId")
    public String ioTCloudConnectorGatewayId;

    @NameInMap("GreInterface")
    public java.util.List<ListGreInterfacesResponseBodyGreInterface> greInterface;

    public static ListGreInterfacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGreInterfacesResponseBody self = new ListGreInterfacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGreInterfacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGreInterfacesResponseBody setIoTCloudConnectorGatewayId(String ioTCloudConnectorGatewayId) {
        this.ioTCloudConnectorGatewayId = ioTCloudConnectorGatewayId;
        return this;
    }
    public String getIoTCloudConnectorGatewayId() {
        return this.ioTCloudConnectorGatewayId;
    }

    public ListGreInterfacesResponseBody setGreInterface(java.util.List<ListGreInterfacesResponseBodyGreInterface> greInterface) {
        this.greInterface = greInterface;
        return this;
    }
    public java.util.List<ListGreInterfacesResponseBodyGreInterface> getGreInterface() {
        return this.greInterface;
    }

    public static class ListGreInterfacesResponseBodyGreInterface extends TeaModel {
        @NameInMap("CustomerIp")
        public String customerIp;

        @NameInMap("CustomerTunnelIp")
        public String customerTunnelIp;

        @NameInMap("LocalTunnelIp")
        public String localTunnelIp;

        @NameInMap("State")
        public String state;

        @NameInMap("EnableKeepalive")
        public Boolean enableKeepalive;

        @NameInMap("GreGwId")
        public String greGwId;

        @NameInMap("ForwardingUnitId")
        public String forwardingUnitId;

        @NameInMap("LocalIp")
        public String localIp;

        @NameInMap("GreInterfaceId")
        public String greInterfaceId;

        @NameInMap("GreCidrs")
        public String greCidrs;

        @NameInMap("IoTCloudConnectorGatewayId")
        public String ioTCloudConnectorGatewayId;

        public static ListGreInterfacesResponseBodyGreInterface build(java.util.Map<String, ?> map) throws Exception {
            ListGreInterfacesResponseBodyGreInterface self = new ListGreInterfacesResponseBodyGreInterface();
            return TeaModel.build(map, self);
        }

        public ListGreInterfacesResponseBodyGreInterface setCustomerIp(String customerIp) {
            this.customerIp = customerIp;
            return this;
        }
        public String getCustomerIp() {
            return this.customerIp;
        }

        public ListGreInterfacesResponseBodyGreInterface setCustomerTunnelIp(String customerTunnelIp) {
            this.customerTunnelIp = customerTunnelIp;
            return this;
        }
        public String getCustomerTunnelIp() {
            return this.customerTunnelIp;
        }

        public ListGreInterfacesResponseBodyGreInterface setLocalTunnelIp(String localTunnelIp) {
            this.localTunnelIp = localTunnelIp;
            return this;
        }
        public String getLocalTunnelIp() {
            return this.localTunnelIp;
        }

        public ListGreInterfacesResponseBodyGreInterface setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListGreInterfacesResponseBodyGreInterface setEnableKeepalive(Boolean enableKeepalive) {
            this.enableKeepalive = enableKeepalive;
            return this;
        }
        public Boolean getEnableKeepalive() {
            return this.enableKeepalive;
        }

        public ListGreInterfacesResponseBodyGreInterface setGreGwId(String greGwId) {
            this.greGwId = greGwId;
            return this;
        }
        public String getGreGwId() {
            return this.greGwId;
        }

        public ListGreInterfacesResponseBodyGreInterface setForwardingUnitId(String forwardingUnitId) {
            this.forwardingUnitId = forwardingUnitId;
            return this;
        }
        public String getForwardingUnitId() {
            return this.forwardingUnitId;
        }

        public ListGreInterfacesResponseBodyGreInterface setLocalIp(String localIp) {
            this.localIp = localIp;
            return this;
        }
        public String getLocalIp() {
            return this.localIp;
        }

        public ListGreInterfacesResponseBodyGreInterface setGreInterfaceId(String greInterfaceId) {
            this.greInterfaceId = greInterfaceId;
            return this;
        }
        public String getGreInterfaceId() {
            return this.greInterfaceId;
        }

        public ListGreInterfacesResponseBodyGreInterface setGreCidrs(String greCidrs) {
            this.greCidrs = greCidrs;
            return this;
        }
        public String getGreCidrs() {
            return this.greCidrs;
        }

        public ListGreInterfacesResponseBodyGreInterface setIoTCloudConnectorGatewayId(String ioTCloudConnectorGatewayId) {
            this.ioTCloudConnectorGatewayId = ioTCloudConnectorGatewayId;
            return this;
        }
        public String getIoTCloudConnectorGatewayId() {
            return this.ioTCloudConnectorGatewayId;
        }

    }

}

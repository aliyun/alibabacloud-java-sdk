// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerAttributeResponseBody extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    @NameInMap("BackendServers")
    public java.util.List<DescribeLoadBalancerAttributeResponseBodyBackendServers> backendServers;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("ListenerPorts")
    public java.util.List<String> listenerPorts;

    @NameInMap("ListenerPortsAndProtocols")
    public java.util.List<DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocols> listenerPortsAndProtocols;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    @NameInMap("LoadBalancerSpec")
    public String loadBalancerSpec;

    @NameInMap("LoadBalancerStatus")
    public String loadBalancerStatus;

    @NameInMap("NetworkId")
    public String networkId;

    @NameInMap("PayType")
    public String payType;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static DescribeLoadBalancerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerAttributeResponseBody self = new DescribeLoadBalancerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerAttributeResponseBody setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public DescribeLoadBalancerAttributeResponseBody setAddressIPVersion(String addressIPVersion) {
        this.addressIPVersion = addressIPVersion;
        return this;
    }
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    public DescribeLoadBalancerAttributeResponseBody setBackendServers(java.util.List<DescribeLoadBalancerAttributeResponseBodyBackendServers> backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public java.util.List<DescribeLoadBalancerAttributeResponseBodyBackendServers> getBackendServers() {
        return this.backendServers;
    }

    public DescribeLoadBalancerAttributeResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeLoadBalancerAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeLoadBalancerAttributeResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLoadBalancerAttributeResponseBody setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeLoadBalancerAttributeResponseBody setListenerPorts(java.util.List<String> listenerPorts) {
        this.listenerPorts = listenerPorts;
        return this;
    }
    public java.util.List<String> getListenerPorts() {
        return this.listenerPorts;
    }

    public DescribeLoadBalancerAttributeResponseBody setListenerPortsAndProtocols(java.util.List<DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocols> listenerPortsAndProtocols) {
        this.listenerPortsAndProtocols = listenerPortsAndProtocols;
        return this;
    }
    public java.util.List<DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocols> getListenerPortsAndProtocols() {
        return this.listenerPortsAndProtocols;
    }

    public DescribeLoadBalancerAttributeResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeLoadBalancerAttributeResponseBody setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public DescribeLoadBalancerAttributeResponseBody setLoadBalancerSpec(String loadBalancerSpec) {
        this.loadBalancerSpec = loadBalancerSpec;
        return this;
    }
    public String getLoadBalancerSpec() {
        return this.loadBalancerSpec;
    }

    public DescribeLoadBalancerAttributeResponseBody setLoadBalancerStatus(String loadBalancerStatus) {
        this.loadBalancerStatus = loadBalancerStatus;
        return this;
    }
    public String getLoadBalancerStatus() {
        return this.loadBalancerStatus;
    }

    public DescribeLoadBalancerAttributeResponseBody setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public DescribeLoadBalancerAttributeResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeLoadBalancerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadBalancerAttributeResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class DescribeLoadBalancerAttributeResponseBodyBackendServers extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("Port")
        public String port;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public Integer weight;

        public static DescribeLoadBalancerAttributeResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerAttributeResponseBodyBackendServers self = new DescribeLoadBalancerAttributeResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerAttributeResponseBodyBackendServers setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeLoadBalancerAttributeResponseBodyBackendServers setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeLoadBalancerAttributeResponseBodyBackendServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public DescribeLoadBalancerAttributeResponseBodyBackendServers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeLoadBalancerAttributeResponseBodyBackendServers setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocols extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("ForwardPort")
        public Integer forwardPort;

        @NameInMap("ListenerForward")
        public String listenerForward;

        @NameInMap("ListenerPort")
        public Integer listenerPort;

        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

        public static DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocols build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocols self = new DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocols();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocols setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocols setForwardPort(Integer forwardPort) {
            this.forwardPort = forwardPort;
            return this;
        }
        public Integer getForwardPort() {
            return this.forwardPort;
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocols setListenerForward(String listenerForward) {
            this.listenerForward = listenerForward;
            return this;
        }
        public String getListenerForward() {
            return this.listenerForward;
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocols setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocols setListenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
            return this;
        }
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayLoadBalancerRequest extends TeaModel {
    /**
     * <p>The load balancer operation DTO.</p>
     */
    @NameInMap("loadBalancerDTO")
    public UpdateGatewayLoadBalancerRequestLoadBalancerDTO loadBalancerDTO;

    /**
     * <p>The operation type. If this parameter is left empty or not specified, only the listening ports are updated (only the ports field is used).</p>
     * 
     * <strong>example:</strong>
     * <p>Add</p>
     */
    @NameInMap("option")
    public String option;

    /**
     * <p>The port list.</p>
     */
    @NameInMap("ports")
    public java.util.List<UpdateGatewayLoadBalancerRequestPorts> ports;

    public static UpdateGatewayLoadBalancerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayLoadBalancerRequest self = new UpdateGatewayLoadBalancerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayLoadBalancerRequest setLoadBalancerDTO(UpdateGatewayLoadBalancerRequestLoadBalancerDTO loadBalancerDTO) {
        this.loadBalancerDTO = loadBalancerDTO;
        return this;
    }
    public UpdateGatewayLoadBalancerRequestLoadBalancerDTO getLoadBalancerDTO() {
        return this.loadBalancerDTO;
    }

    public UpdateGatewayLoadBalancerRequest setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

    public UpdateGatewayLoadBalancerRequest setPorts(java.util.List<UpdateGatewayLoadBalancerRequestPorts> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<UpdateGatewayLoadBalancerRequestPorts> getPorts() {
        return this.ports;
    }

    public static class UpdateGatewayLoadBalancerRequestLoadBalancerDTOVirtualServiceList extends TeaModel {
        /**
         * <p>The port number. Valid values: 1 to 65535. An error is returned if an invalid value is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("port")
        public Long port;

        /**
         * <p>The protocol. This parameter is required for CLB. If this parameter is not specified for CLB, the error message &quot;protocol is missing for CLB&quot; is returned. No backend enumeration validation is performed. Valid values: tcp, udp, http, https, and tls.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The CLB VServerGroupId or NLB ServerGroupId. This parameter is required. If a duplicate group ID is specified, an error is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-xxxx</p>
         */
        @NameInMap("virtualServiceGroupId")
        public String virtualServiceGroupId;

        /**
         * <p>The group name. This parameter is required. If this parameter is not specified, the error message &quot;virtual service parameter is missing&quot; is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>80-tcp</p>
         */
        @NameInMap("virtualServiceGroupName")
        public String virtualServiceGroupName;

        public static UpdateGatewayLoadBalancerRequestLoadBalancerDTOVirtualServiceList build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayLoadBalancerRequestLoadBalancerDTOVirtualServiceList self = new UpdateGatewayLoadBalancerRequestLoadBalancerDTOVirtualServiceList();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayLoadBalancerRequestLoadBalancerDTOVirtualServiceList setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public UpdateGatewayLoadBalancerRequestLoadBalancerDTOVirtualServiceList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateGatewayLoadBalancerRequestLoadBalancerDTOVirtualServiceList setVirtualServiceGroupId(String virtualServiceGroupId) {
            this.virtualServiceGroupId = virtualServiceGroupId;
            return this;
        }
        public String getVirtualServiceGroupId() {
            return this.virtualServiceGroupId;
        }

        public UpdateGatewayLoadBalancerRequestLoadBalancerDTOVirtualServiceList setVirtualServiceGroupName(String virtualServiceGroupName) {
            this.virtualServiceGroupName = virtualServiceGroupName;
            return this;
        }
        public String getVirtualServiceGroupName() {
            return this.virtualServiceGroupName;
        }

    }

    public static class UpdateGatewayLoadBalancerRequestLoadBalancerDTO extends TeaModel {
        /**
         * <p>The load balancer instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1xxxx</p>
         */
        @NameInMap("loadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The load balancer type.</p>
         * 
         * <strong>example:</strong>
         * <p>CLB</p>
         */
        @NameInMap("loadBalancerType")
        public String loadBalancerType;

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        @NameInMap("networkType")
        public String networkType;

        /**
         * <p>The service weight. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("serviceWeight")
        public Long serviceWeight;

        /**
         * <p>The backend server group bindings.</p>
         */
        @NameInMap("virtualServiceList")
        public java.util.List<UpdateGatewayLoadBalancerRequestLoadBalancerDTOVirtualServiceList> virtualServiceList;

        public static UpdateGatewayLoadBalancerRequestLoadBalancerDTO build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayLoadBalancerRequestLoadBalancerDTO self = new UpdateGatewayLoadBalancerRequestLoadBalancerDTO();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayLoadBalancerRequestLoadBalancerDTO setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public UpdateGatewayLoadBalancerRequestLoadBalancerDTO setLoadBalancerType(String loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
            return this;
        }
        public String getLoadBalancerType() {
            return this.loadBalancerType;
        }

        public UpdateGatewayLoadBalancerRequestLoadBalancerDTO setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public UpdateGatewayLoadBalancerRequestLoadBalancerDTO setServiceWeight(Long serviceWeight) {
            this.serviceWeight = serviceWeight;
            return this;
        }
        public Long getServiceWeight() {
            return this.serviceWeight;
        }

        public UpdateGatewayLoadBalancerRequestLoadBalancerDTO setVirtualServiceList(java.util.List<UpdateGatewayLoadBalancerRequestLoadBalancerDTOVirtualServiceList> virtualServiceList) {
            this.virtualServiceList = virtualServiceList;
            return this;
        }
        public java.util.List<UpdateGatewayLoadBalancerRequestLoadBalancerDTOVirtualServiceList> getVirtualServiceList() {
            return this.virtualServiceList;
        }

    }

    public static class UpdateGatewayLoadBalancerRequestPortsGatewayLoadBalancerPorts extends TeaModel {
        /**
         * <p>The listening port. Valid values: 0 to 65535. A maximum of 50 custom ports can be configured in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        public static UpdateGatewayLoadBalancerRequestPortsGatewayLoadBalancerPorts build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayLoadBalancerRequestPortsGatewayLoadBalancerPorts self = new UpdateGatewayLoadBalancerRequestPortsGatewayLoadBalancerPorts();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayLoadBalancerRequestPortsGatewayLoadBalancerPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateGatewayLoadBalancerRequestPortsGatewayLoadBalancerPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class UpdateGatewayLoadBalancerRequestPorts extends TeaModel {
        /**
         * <p>The listening ports.</p>
         */
        @NameInMap("gatewayLoadBalancerPorts")
        public java.util.List<UpdateGatewayLoadBalancerRequestPortsGatewayLoadBalancerPorts> gatewayLoadBalancerPorts;

        /**
         * <p>The load balancer type.</p>
         * 
         * <strong>example:</strong>
         * <p>NLB</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateGatewayLoadBalancerRequestPorts build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayLoadBalancerRequestPorts self = new UpdateGatewayLoadBalancerRequestPorts();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayLoadBalancerRequestPorts setGatewayLoadBalancerPorts(java.util.List<UpdateGatewayLoadBalancerRequestPortsGatewayLoadBalancerPorts> gatewayLoadBalancerPorts) {
            this.gatewayLoadBalancerPorts = gatewayLoadBalancerPorts;
            return this;
        }
        public java.util.List<UpdateGatewayLoadBalancerRequestPortsGatewayLoadBalancerPorts> getGatewayLoadBalancerPorts() {
            return this.gatewayLoadBalancerPorts;
        }

        public UpdateGatewayLoadBalancerRequestPorts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayLoadBalancerResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public UpdateGatewayLoadBalancerResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CEB8F71F-F889-599E-9D03-250978412350</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateGatewayLoadBalancerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayLoadBalancerResponseBody self = new UpdateGatewayLoadBalancerResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayLoadBalancerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateGatewayLoadBalancerResponseBody setData(UpdateGatewayLoadBalancerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateGatewayLoadBalancerResponseBodyData getData() {
        return this.data;
    }

    public UpdateGatewayLoadBalancerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateGatewayLoadBalancerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateGatewayLoadBalancerResponseBodyDataVirtualServiceList extends TeaModel {
        /**
         * <p>The port. When an NLB instance is associated, two placeholder entries with ports 80 and 443 are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("port")
        public String port;

        /**
         * <p>The protocol. When an NLB instance is associated, HTTP and HTTPS are returned as placeholders. For CLB, the value is deserialized from the stored vServerGroupMetaInfo.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The VServerGroup or ServerGroup ID. When an NLB instance is associated, this field is an empty string placeholder.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-xxxx</p>
         */
        @NameInMap("virtualServiceGroupId")
        public String virtualServiceGroupId;

        /**
         * <p>The group name. When an NLB instance is associated, this field is an empty string placeholder.</p>
         * 
         * <strong>example:</strong>
         * <p>80-tcp</p>
         */
        @NameInMap("virtualServiceGroupName")
        public String virtualServiceGroupName;

        public static UpdateGatewayLoadBalancerResponseBodyDataVirtualServiceList build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayLoadBalancerResponseBodyDataVirtualServiceList self = new UpdateGatewayLoadBalancerResponseBodyDataVirtualServiceList();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayLoadBalancerResponseBodyDataVirtualServiceList setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public UpdateGatewayLoadBalancerResponseBodyDataVirtualServiceList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateGatewayLoadBalancerResponseBodyDataVirtualServiceList setVirtualServiceGroupId(String virtualServiceGroupId) {
            this.virtualServiceGroupId = virtualServiceGroupId;
            return this;
        }
        public String getVirtualServiceGroupId() {
            return this.virtualServiceGroupId;
        }

        public UpdateGatewayLoadBalancerResponseBodyDataVirtualServiceList setVirtualServiceGroupName(String virtualServiceGroupName) {
            this.virtualServiceGroupName = virtualServiceGroupName;
            return this;
        }
        public String getVirtualServiceGroupName() {
            return this.virtualServiceGroupName;
        }

    }

    public static class UpdateGatewayLoadBalancerResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the load balancer can be edited. This serves as the edit toggle for a load balancer that is being migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("editEnable")
        public Boolean editEnable;

        /**
         * <p>The load balancer address.</p>
         * 
         * <strong>example:</strong>
         * <p>47.x.x.x</p>
         */
        @NameInMap("loadBalancerAddress")
        public String loadBalancerAddress;

        /**
         * <p>The load balancer instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1xxxx</p>
         */
        @NameInMap("loadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The load balancer name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-clb</p>
         */
        @NameInMap("loadBalancerName")
        public String loadBalancerName;

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
         * <p>The port information.</p>
         */
        @NameInMap("ports")
        public java.util.List<Integer> ports;

        /**
         * <p>The gateway service weight for traffic shifting during migration. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("serviceWeight")
        public Long serviceWeight;

        /**
         * <p>The status description.</p>
         * 
         * <strong>example:</strong>
         * <p>Status description</p>
         */
        @NameInMap("statusDescription")
        public String statusDescription;

        /**
         * <p>The backend server group bindings.</p>
         */
        @NameInMap("virtualServiceList")
        public java.util.List<UpdateGatewayLoadBalancerResponseBodyDataVirtualServiceList> virtualServiceList;

        public static UpdateGatewayLoadBalancerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayLoadBalancerResponseBodyData self = new UpdateGatewayLoadBalancerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayLoadBalancerResponseBodyData setEditEnable(Boolean editEnable) {
            this.editEnable = editEnable;
            return this;
        }
        public Boolean getEditEnable() {
            return this.editEnable;
        }

        public UpdateGatewayLoadBalancerResponseBodyData setLoadBalancerAddress(String loadBalancerAddress) {
            this.loadBalancerAddress = loadBalancerAddress;
            return this;
        }
        public String getLoadBalancerAddress() {
            return this.loadBalancerAddress;
        }

        public UpdateGatewayLoadBalancerResponseBodyData setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public UpdateGatewayLoadBalancerResponseBodyData setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public UpdateGatewayLoadBalancerResponseBodyData setLoadBalancerType(String loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
            return this;
        }
        public String getLoadBalancerType() {
            return this.loadBalancerType;
        }

        public UpdateGatewayLoadBalancerResponseBodyData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public UpdateGatewayLoadBalancerResponseBodyData setPorts(java.util.List<Integer> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<Integer> getPorts() {
            return this.ports;
        }

        public UpdateGatewayLoadBalancerResponseBodyData setServiceWeight(Long serviceWeight) {
            this.serviceWeight = serviceWeight;
            return this;
        }
        public Long getServiceWeight() {
            return this.serviceWeight;
        }

        public UpdateGatewayLoadBalancerResponseBodyData setStatusDescription(String statusDescription) {
            this.statusDescription = statusDescription;
            return this;
        }
        public String getStatusDescription() {
            return this.statusDescription;
        }

        public UpdateGatewayLoadBalancerResponseBodyData setVirtualServiceList(java.util.List<UpdateGatewayLoadBalancerResponseBodyDataVirtualServiceList> virtualServiceList) {
            this.virtualServiceList = virtualServiceList;
            return this;
        }
        public java.util.List<UpdateGatewayLoadBalancerResponseBodyDataVirtualServiceList> getVirtualServiceList() {
            return this.virtualServiceList;
        }

    }

}

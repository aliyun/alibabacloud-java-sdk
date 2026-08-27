// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayLoadBalancersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListGatewayLoadBalancersResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C7C7C3EB-00B6-509A-B6A3-5462EE759047</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListGatewayLoadBalancersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayLoadBalancersResponseBody self = new ListGatewayLoadBalancersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayLoadBalancersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGatewayLoadBalancersResponseBody setData(ListGatewayLoadBalancersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGatewayLoadBalancersResponseBodyData getData() {
        return this.data;
    }

    public ListGatewayLoadBalancersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewayLoadBalancersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappingsLoadBalancerAddresses extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>eip-bp1xxxx</p>
         */
        @NameInMap("allocationId")
        public String allocationId;

        /**
         * <strong>example:</strong>
         * <p>eni-bp1xxxx</p>
         */
        @NameInMap("eniId")
        public String eniId;

        @NameInMap("ipv4LocalAddresses")
        public java.util.List<String> ipv4LocalAddresses;

        /**
         * <strong>example:</strong>
         * <p>2408:xxxx</p>
         */
        @NameInMap("ipv6Address")
        public String ipv6Address;

        @NameInMap("ipv6LocalAddresses")
        public java.util.List<String> ipv6LocalAddresses;

        /**
         * <strong>example:</strong>
         * <p>192.168.x.x</p>
         */
        @NameInMap("privateIPv4Address")
        public String privateIPv4Address;

        /**
         * <strong>example:</strong>
         * <p>Healthy</p>
         */
        @NameInMap("privateIPv4HcStatus")
        public String privateIPv4HcStatus;

        /**
         * <strong>example:</strong>
         * <p>Healthy</p>
         */
        @NameInMap("privateIPv6HcStatus")
        public String privateIPv6HcStatus;

        /**
         * <strong>example:</strong>
         * <p>47.x.x.x</p>
         */
        @NameInMap("publicIPv4Address")
        public String publicIPv4Address;

        public static ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappingsLoadBalancerAddresses build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappingsLoadBalancerAddresses self = new ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappingsLoadBalancerAddresses();
            return TeaModel.build(map, self);
        }

        public ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappingsLoadBalancerAddresses setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappingsLoadBalancerAddresses setEniId(String eniId) {
            this.eniId = eniId;
            return this;
        }
        public String getEniId() {
            return this.eniId;
        }

        public ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappingsLoadBalancerAddresses setIpv4LocalAddresses(java.util.List<String> ipv4LocalAddresses) {
            this.ipv4LocalAddresses = ipv4LocalAddresses;
            return this;
        }
        public java.util.List<String> getIpv4LocalAddresses() {
            return this.ipv4LocalAddresses;
        }

        public ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappingsLoadBalancerAddresses setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        public ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappingsLoadBalancerAddresses setIpv6LocalAddresses(java.util.List<String> ipv6LocalAddresses) {
            this.ipv6LocalAddresses = ipv6LocalAddresses;
            return this;
        }
        public java.util.List<String> getIpv6LocalAddresses() {
            return this.ipv6LocalAddresses;
        }

        public ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappingsLoadBalancerAddresses setPrivateIPv4Address(String privateIPv4Address) {
            this.privateIPv4Address = privateIPv4Address;
            return this;
        }
        public String getPrivateIPv4Address() {
            return this.privateIPv4Address;
        }

        public ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappingsLoadBalancerAddresses setPrivateIPv4HcStatus(String privateIPv4HcStatus) {
            this.privateIPv4HcStatus = privateIPv4HcStatus;
            return this;
        }
        public String getPrivateIPv4HcStatus() {
            return this.privateIPv4HcStatus;
        }

        public ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappingsLoadBalancerAddresses setPrivateIPv6HcStatus(String privateIPv6HcStatus) {
            this.privateIPv6HcStatus = privateIPv6HcStatus;
            return this;
        }
        public String getPrivateIPv6HcStatus() {
            return this.privateIPv6HcStatus;
        }

        public ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappingsLoadBalancerAddresses setPublicIPv4Address(String publicIPv4Address) {
            this.publicIPv4Address = publicIPv4Address;
            return this;
        }
        public String getPublicIPv4Address() {
            return this.publicIPv4Address;
        }

    }

    public static class ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappings extends TeaModel {
        @NameInMap("loadBalancerAddresses")
        public java.util.List<ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappingsLoadBalancerAddresses> loadBalancerAddresses;

        /**
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>vsw-bp1xxxx</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappings self = new ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappings();
            return TeaModel.build(map, self);
        }

        public ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappings setLoadBalancerAddresses(java.util.List<ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappingsLoadBalancerAddresses> loadBalancerAddresses) {
            this.loadBalancerAddresses = loadBalancerAddresses;
            return this;
        }
        public java.util.List<ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappingsLoadBalancerAddresses> getLoadBalancerAddresses() {
            return this.loadBalancerAddresses;
        }

        public ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappings setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListGatewayLoadBalancersResponseBodyDataItemsPorts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>https</p>
         */
        @NameInMap("protocol")
        public String protocol;

        public static ListGatewayLoadBalancersResponseBodyDataItemsPorts build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayLoadBalancersResponseBodyDataItemsPorts self = new ListGatewayLoadBalancersResponseBodyDataItemsPorts();
            return TeaModel.build(map, self);
        }

        public ListGatewayLoadBalancersResponseBodyDataItemsPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListGatewayLoadBalancersResponseBodyDataItemsPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class ListGatewayLoadBalancersResponseBodyDataItemsVirtualServerGroupListListeners extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>https</p>
         */
        @NameInMap("protocol")
        public String protocol;

        public static ListGatewayLoadBalancersResponseBodyDataItemsVirtualServerGroupListListeners build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayLoadBalancersResponseBodyDataItemsVirtualServerGroupListListeners self = new ListGatewayLoadBalancersResponseBodyDataItemsVirtualServerGroupListListeners();
            return TeaModel.build(map, self);
        }

        public ListGatewayLoadBalancersResponseBodyDataItemsVirtualServerGroupListListeners setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListGatewayLoadBalancersResponseBodyDataItemsVirtualServerGroupListListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class ListGatewayLoadBalancersResponseBodyDataItemsVirtualServerGroupList extends TeaModel {
        @NameInMap("listeners")
        public java.util.List<ListGatewayLoadBalancersResponseBodyDataItemsVirtualServerGroupListListeners> listeners;

        /**
         * <strong>example:</strong>
         * <p>rsp-xxxx</p>
         */
        @NameInMap("virtualServiceGroupId")
        public String virtualServiceGroupId;

        /**
         * <strong>example:</strong>
         * <p>80-tcp</p>
         */
        @NameInMap("virtualServiceGroupName")
        public String virtualServiceGroupName;

        public static ListGatewayLoadBalancersResponseBodyDataItemsVirtualServerGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayLoadBalancersResponseBodyDataItemsVirtualServerGroupList self = new ListGatewayLoadBalancersResponseBodyDataItemsVirtualServerGroupList();
            return TeaModel.build(map, self);
        }

        public ListGatewayLoadBalancersResponseBodyDataItemsVirtualServerGroupList setListeners(java.util.List<ListGatewayLoadBalancersResponseBodyDataItemsVirtualServerGroupListListeners> listeners) {
            this.listeners = listeners;
            return this;
        }
        public java.util.List<ListGatewayLoadBalancersResponseBodyDataItemsVirtualServerGroupListListeners> getListeners() {
            return this.listeners;
        }

        public ListGatewayLoadBalancersResponseBodyDataItemsVirtualServerGroupList setVirtualServiceGroupId(String virtualServiceGroupId) {
            this.virtualServiceGroupId = virtualServiceGroupId;
            return this;
        }
        public String getVirtualServiceGroupId() {
            return this.virtualServiceGroupId;
        }

        public ListGatewayLoadBalancersResponseBodyDataItemsVirtualServerGroupList setVirtualServiceGroupName(String virtualServiceGroupName) {
            this.virtualServiceGroupName = virtualServiceGroupName;
            return this;
        }
        public String getVirtualServiceGroupName() {
            return this.virtualServiceGroupName;
        }

    }

    public static class ListGatewayLoadBalancersResponseBodyDataItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("defaultGatewayIngress")
        public Boolean defaultGatewayIngress;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("editEnable")
        public Boolean editEnable;

        /**
         * <strong>example:</strong>
         * <p>gw-xxxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <strong>example:</strong>
         * <p>47.x.x.x</p>
         */
        @NameInMap("loadBalancerAddress")
        public String loadBalancerAddress;

        /**
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("loadBalancerAddressIpVersion")
        public String loadBalancerAddressIpVersion;

        /**
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        @NameInMap("loadBalancerAddressType")
        public String loadBalancerAddressType;

        /**
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("loadBalancerAvailableStatus")
        public String loadBalancerAvailableStatus;

        /**
         * <strong>example:</strong>
         * <p>lb-bp1xxxx / nlb-xxxx</p>
         */
        @NameInMap("loadBalancerId")
        public String loadBalancerId;

        /**
         * <strong>example:</strong>
         * <p>Managed</p>
         */
        @NameInMap("loadBalancerMode")
        public String loadBalancerMode;

        /**
         * <strong>example:</strong>
         * <p>my-nlb</p>
         */
        @NameInMap("loadBalancerName")
        public String loadBalancerName;

        /**
         * <strong>example:</strong>
         * <p>slb.s2.small</p>
         */
        @NameInMap("loadBalancerSpec")
        public String loadBalancerSpec;

        /**
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("loadBalancerStatus")
        public String loadBalancerStatus;

        /**
         * <strong>example:</strong>
         * <p>NLB</p>
         */
        @NameInMap("loadBalancerType")
        public String loadBalancerType;

        @NameInMap("loadBalancerZoneMappings")
        public java.util.List<ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappings> loadBalancerZoneMappings;

        @NameInMap("ports")
        public java.util.List<ListGatewayLoadBalancersResponseBodyDataItemsPorts> ports;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("serviceWeight")
        public Long serviceWeight;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("vServerGroupMetaInfo")
        public String vServerGroupMetaInfo;

        @NameInMap("virtualServerGroupList")
        public java.util.List<ListGatewayLoadBalancersResponseBodyDataItemsVirtualServerGroupList> virtualServerGroupList;

        public static ListGatewayLoadBalancersResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayLoadBalancersResponseBodyDataItems self = new ListGatewayLoadBalancersResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListGatewayLoadBalancersResponseBodyDataItems setDefaultGatewayIngress(Boolean defaultGatewayIngress) {
            this.defaultGatewayIngress = defaultGatewayIngress;
            return this;
        }
        public Boolean getDefaultGatewayIngress() {
            return this.defaultGatewayIngress;
        }

        public ListGatewayLoadBalancersResponseBodyDataItems setEditEnable(Boolean editEnable) {
            this.editEnable = editEnable;
            return this;
        }
        public Boolean getEditEnable() {
            return this.editEnable;
        }

        public ListGatewayLoadBalancersResponseBodyDataItems setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public ListGatewayLoadBalancersResponseBodyDataItems setLoadBalancerAddress(String loadBalancerAddress) {
            this.loadBalancerAddress = loadBalancerAddress;
            return this;
        }
        public String getLoadBalancerAddress() {
            return this.loadBalancerAddress;
        }

        public ListGatewayLoadBalancersResponseBodyDataItems setLoadBalancerAddressIpVersion(String loadBalancerAddressIpVersion) {
            this.loadBalancerAddressIpVersion = loadBalancerAddressIpVersion;
            return this;
        }
        public String getLoadBalancerAddressIpVersion() {
            return this.loadBalancerAddressIpVersion;
        }

        public ListGatewayLoadBalancersResponseBodyDataItems setLoadBalancerAddressType(String loadBalancerAddressType) {
            this.loadBalancerAddressType = loadBalancerAddressType;
            return this;
        }
        public String getLoadBalancerAddressType() {
            return this.loadBalancerAddressType;
        }

        public ListGatewayLoadBalancersResponseBodyDataItems setLoadBalancerAvailableStatus(String loadBalancerAvailableStatus) {
            this.loadBalancerAvailableStatus = loadBalancerAvailableStatus;
            return this;
        }
        public String getLoadBalancerAvailableStatus() {
            return this.loadBalancerAvailableStatus;
        }

        public ListGatewayLoadBalancersResponseBodyDataItems setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public ListGatewayLoadBalancersResponseBodyDataItems setLoadBalancerMode(String loadBalancerMode) {
            this.loadBalancerMode = loadBalancerMode;
            return this;
        }
        public String getLoadBalancerMode() {
            return this.loadBalancerMode;
        }

        public ListGatewayLoadBalancersResponseBodyDataItems setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public ListGatewayLoadBalancersResponseBodyDataItems setLoadBalancerSpec(String loadBalancerSpec) {
            this.loadBalancerSpec = loadBalancerSpec;
            return this;
        }
        public String getLoadBalancerSpec() {
            return this.loadBalancerSpec;
        }

        public ListGatewayLoadBalancersResponseBodyDataItems setLoadBalancerStatus(String loadBalancerStatus) {
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }
        public String getLoadBalancerStatus() {
            return this.loadBalancerStatus;
        }

        public ListGatewayLoadBalancersResponseBodyDataItems setLoadBalancerType(String loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
            return this;
        }
        public String getLoadBalancerType() {
            return this.loadBalancerType;
        }

        public ListGatewayLoadBalancersResponseBodyDataItems setLoadBalancerZoneMappings(java.util.List<ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappings> loadBalancerZoneMappings) {
            this.loadBalancerZoneMappings = loadBalancerZoneMappings;
            return this;
        }
        public java.util.List<ListGatewayLoadBalancersResponseBodyDataItemsLoadBalancerZoneMappings> getLoadBalancerZoneMappings() {
            return this.loadBalancerZoneMappings;
        }

        public ListGatewayLoadBalancersResponseBodyDataItems setPorts(java.util.List<ListGatewayLoadBalancersResponseBodyDataItemsPorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<ListGatewayLoadBalancersResponseBodyDataItemsPorts> getPorts() {
            return this.ports;
        }

        public ListGatewayLoadBalancersResponseBodyDataItems setServiceWeight(Long serviceWeight) {
            this.serviceWeight = serviceWeight;
            return this;
        }
        public Long getServiceWeight() {
            return this.serviceWeight;
        }

        public ListGatewayLoadBalancersResponseBodyDataItems setVServerGroupMetaInfo(String vServerGroupMetaInfo) {
            this.vServerGroupMetaInfo = vServerGroupMetaInfo;
            return this;
        }
        public String getVServerGroupMetaInfo() {
            return this.vServerGroupMetaInfo;
        }

        public ListGatewayLoadBalancersResponseBodyDataItems setVirtualServerGroupList(java.util.List<ListGatewayLoadBalancersResponseBodyDataItemsVirtualServerGroupList> virtualServerGroupList) {
            this.virtualServerGroupList = virtualServerGroupList;
            return this;
        }
        public java.util.List<ListGatewayLoadBalancersResponseBodyDataItemsVirtualServerGroupList> getVirtualServerGroupList() {
            return this.virtualServerGroupList;
        }

    }

    public static class ListGatewayLoadBalancersResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<ListGatewayLoadBalancersResponseBodyDataItems> items;

        public static ListGatewayLoadBalancersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayLoadBalancersResponseBodyData self = new ListGatewayLoadBalancersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayLoadBalancersResponseBodyData setItems(java.util.List<ListGatewayLoadBalancersResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListGatewayLoadBalancersResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}

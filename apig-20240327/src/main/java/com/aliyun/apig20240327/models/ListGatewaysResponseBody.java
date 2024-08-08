// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewaysResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListGatewaysResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>5B626361-070A-56A7-B127-ADAC8F3655DB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewaysResponseBody self = new ListGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewaysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGatewaysResponseBody setData(ListGatewaysResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGatewaysResponseBodyData getData() {
        return this.data;
    }

    public ListGatewaysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGatewaysResponseBodyDataItemsLoadBalancersPorts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        public static ListGatewaysResponseBodyDataItemsLoadBalancersPorts build(java.util.Map<String, ?> map) throws Exception {
            ListGatewaysResponseBodyDataItemsLoadBalancersPorts self = new ListGatewaysResponseBodyDataItemsLoadBalancersPorts();
            return TeaModel.build(map, self);
        }

        public ListGatewaysResponseBodyDataItemsLoadBalancersPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListGatewaysResponseBodyDataItemsLoadBalancersPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class ListGatewaysResponseBodyDataItemsLoadBalancers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>nlb-xoh3pghr***.cn-hangzhou.nlb.aliyuncs.com</p>
         */
        @NameInMap("address")
        public String address;

        /**
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("addressIpVersion")
        public String addressIpVersion;

        /**
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        @NameInMap("addressType")
        public String addressType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("gatewayDefault")
        public Boolean gatewayDefault;

        /**
         * <strong>example:</strong>
         * <p>nlb-xqwioje1c91r***</p>
         */
        @NameInMap("loadBalancerId")
        public String loadBalancerId;

        /**
         * <strong>example:</strong>
         * <p>Managed</p>
         */
        @NameInMap("mode")
        public String mode;

        @NameInMap("ports")
        public java.util.List<ListGatewaysResponseBodyDataItemsLoadBalancersPorts> ports;

        /**
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>NLB</p>
         */
        @NameInMap("type")
        public String type;

        public static ListGatewaysResponseBodyDataItemsLoadBalancers build(java.util.Map<String, ?> map) throws Exception {
            ListGatewaysResponseBodyDataItemsLoadBalancers self = new ListGatewaysResponseBodyDataItemsLoadBalancers();
            return TeaModel.build(map, self);
        }

        public ListGatewaysResponseBodyDataItemsLoadBalancers setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListGatewaysResponseBodyDataItemsLoadBalancers setAddressIpVersion(String addressIpVersion) {
            this.addressIpVersion = addressIpVersion;
            return this;
        }
        public String getAddressIpVersion() {
            return this.addressIpVersion;
        }

        public ListGatewaysResponseBodyDataItemsLoadBalancers setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public ListGatewaysResponseBodyDataItemsLoadBalancers setGatewayDefault(Boolean gatewayDefault) {
            this.gatewayDefault = gatewayDefault;
            return this;
        }
        public Boolean getGatewayDefault() {
            return this.gatewayDefault;
        }

        public ListGatewaysResponseBodyDataItemsLoadBalancers setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public ListGatewaysResponseBodyDataItemsLoadBalancers setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListGatewaysResponseBodyDataItemsLoadBalancers setPorts(java.util.List<ListGatewaysResponseBodyDataItemsLoadBalancersPorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<ListGatewaysResponseBodyDataItemsLoadBalancersPorts> getPorts() {
            return this.ports;
        }

        public ListGatewaysResponseBodyDataItemsLoadBalancers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListGatewaysResponseBodyDataItemsLoadBalancers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListGatewaysResponseBodyDataItemsSecurityGroup extends TeaModel {
        @NameInMap("securityGroupId")
        public String securityGroupId;

        public static ListGatewaysResponseBodyDataItemsSecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            ListGatewaysResponseBodyDataItemsSecurityGroup self = new ListGatewaysResponseBodyDataItemsSecurityGroup();
            return TeaModel.build(map, self);
        }

        public ListGatewaysResponseBodyDataItemsSecurityGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class ListGatewaysResponseBodyDataItemsVSwitch extends TeaModel {
        @NameInMap("vSwitchId")
        public String vSwitchId;

        public static ListGatewaysResponseBodyDataItemsVSwitch build(java.util.Map<String, ?> map) throws Exception {
            ListGatewaysResponseBodyDataItemsVSwitch self = new ListGatewaysResponseBodyDataItemsVSwitch();
            return TeaModel.build(map, self);
        }

        public ListGatewaysResponseBodyDataItemsVSwitch setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class ListGatewaysResponseBodyDataItemsVpc extends TeaModel {
        @NameInMap("vpcId")
        public String vpcId;

        public static ListGatewaysResponseBodyDataItemsVpc build(java.util.Map<String, ?> map) throws Exception {
            ListGatewaysResponseBodyDataItemsVpc self = new ListGatewaysResponseBodyDataItemsVpc();
            return TeaModel.build(map, self);
        }

        public ListGatewaysResponseBodyDataItemsVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListGatewaysResponseBodyDataItemsZonesVSwitch extends TeaModel {
        @NameInMap("vSwitchId")
        public String vSwitchId;

        public static ListGatewaysResponseBodyDataItemsZonesVSwitch build(java.util.Map<String, ?> map) throws Exception {
            ListGatewaysResponseBodyDataItemsZonesVSwitch self = new ListGatewaysResponseBodyDataItemsZonesVSwitch();
            return TeaModel.build(map, self);
        }

        public ListGatewaysResponseBodyDataItemsZonesVSwitch setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class ListGatewaysResponseBodyDataItemsZones extends TeaModel {
        @NameInMap("vSwitch")
        public ListGatewaysResponseBodyDataItemsZonesVSwitch vSwitch;

        @NameInMap("zoneId")
        public String zoneId;

        public static ListGatewaysResponseBodyDataItemsZones build(java.util.Map<String, ?> map) throws Exception {
            ListGatewaysResponseBodyDataItemsZones self = new ListGatewaysResponseBodyDataItemsZones();
            return TeaModel.build(map, self);
        }

        public ListGatewaysResponseBodyDataItemsZones setVSwitch(ListGatewaysResponseBodyDataItemsZonesVSwitch vSwitch) {
            this.vSwitch = vSwitch;
            return this;
        }
        public ListGatewaysResponseBodyDataItemsZonesVSwitch getVSwitch() {
            return this.vSwitch;
        }

        public ListGatewaysResponseBodyDataItemsZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListGatewaysResponseBodyDataItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>Console</p>
         */
        @NameInMap("createFrom")
        public String createFrom;

        /**
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        /**
         * <strong>example:</strong>
         * <p>172086834548</p>
         */
        @NameInMap("expireTimestamp")
        public Long expireTimestamp;

        /**
         * <strong>example:</strong>
         * <p>gw-cpv54p5***</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        @NameInMap("loadBalancers")
        public java.util.List<ListGatewaysResponseBodyDataItemsLoadBalancers> loadBalancers;

        /**
         * <strong>example:</strong>
         * <p>itemcenter-gateway</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("replicas")
        public String replicas;

        @NameInMap("securityGroup")
        public ListGatewaysResponseBodyDataItemsSecurityGroup securityGroup;

        /**
         * <strong>example:</strong>
         * <p>apigw.small.x1</p>
         */
        @NameInMap("spec")
        public String spec;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2.0.2</p>
         */
        @NameInMap("targetVersion")
        public String targetVersion;

        /**
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("updateTimestamp")
        public Long updateTimestamp;

        @NameInMap("vSwitch")
        public ListGatewaysResponseBodyDataItemsVSwitch vSwitch;

        /**
         * <strong>example:</strong>
         * <p>2.0.2</p>
         */
        @NameInMap("version")
        public String version;

        @NameInMap("vpc")
        public ListGatewaysResponseBodyDataItemsVpc vpc;

        @NameInMap("zones")
        public java.util.List<ListGatewaysResponseBodyDataItemsZones> zones;

        public static ListGatewaysResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListGatewaysResponseBodyDataItems self = new ListGatewaysResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListGatewaysResponseBodyDataItems setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListGatewaysResponseBodyDataItems setCreateFrom(String createFrom) {
            this.createFrom = createFrom;
            return this;
        }
        public String getCreateFrom() {
            return this.createFrom;
        }

        public ListGatewaysResponseBodyDataItems setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListGatewaysResponseBodyDataItems setExpireTimestamp(Long expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        public ListGatewaysResponseBodyDataItems setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public ListGatewaysResponseBodyDataItems setLoadBalancers(java.util.List<ListGatewaysResponseBodyDataItemsLoadBalancers> loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }
        public java.util.List<ListGatewaysResponseBodyDataItemsLoadBalancers> getLoadBalancers() {
            return this.loadBalancers;
        }

        public ListGatewaysResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewaysResponseBodyDataItems setReplicas(String replicas) {
            this.replicas = replicas;
            return this;
        }
        public String getReplicas() {
            return this.replicas;
        }

        public ListGatewaysResponseBodyDataItems setSecurityGroup(ListGatewaysResponseBodyDataItemsSecurityGroup securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public ListGatewaysResponseBodyDataItemsSecurityGroup getSecurityGroup() {
            return this.securityGroup;
        }

        public ListGatewaysResponseBodyDataItems setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListGatewaysResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListGatewaysResponseBodyDataItems setTargetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            return this;
        }
        public String getTargetVersion() {
            return this.targetVersion;
        }

        public ListGatewaysResponseBodyDataItems setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public ListGatewaysResponseBodyDataItems setVSwitch(ListGatewaysResponseBodyDataItemsVSwitch vSwitch) {
            this.vSwitch = vSwitch;
            return this;
        }
        public ListGatewaysResponseBodyDataItemsVSwitch getVSwitch() {
            return this.vSwitch;
        }

        public ListGatewaysResponseBodyDataItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListGatewaysResponseBodyDataItems setVpc(ListGatewaysResponseBodyDataItemsVpc vpc) {
            this.vpc = vpc;
            return this;
        }
        public ListGatewaysResponseBodyDataItemsVpc getVpc() {
            return this.vpc;
        }

        public ListGatewaysResponseBodyDataItems setZones(java.util.List<ListGatewaysResponseBodyDataItemsZones> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<ListGatewaysResponseBodyDataItemsZones> getZones() {
            return this.zones;
        }

    }

    public static class ListGatewaysResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<ListGatewaysResponseBodyDataItems> items;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("totalSize")
        public Long totalSize;

        public static ListGatewaysResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewaysResponseBodyData self = new ListGatewaysResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewaysResponseBodyData setItems(java.util.List<ListGatewaysResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListGatewaysResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListGatewaysResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGatewaysResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGatewaysResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}

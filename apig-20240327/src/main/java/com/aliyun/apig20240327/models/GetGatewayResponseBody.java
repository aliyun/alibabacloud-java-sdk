// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayResponseBody extends TeaModel {
    /**
     * <p>The environment alias.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The security group of the instance.</p>
     */
    @NameInMap("data")
    public GetGatewayResponseBodyData data;

    /**
     * <p>Default environment</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The environment name.</p>
     * 
     * <strong>example:</strong>
     * <p>0F138FFC-6E2B-56C1-9BAB-A67462E339D1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayResponseBody self = new GetGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGatewayResponseBody setData(GetGatewayResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGatewayResponseBodyData getData() {
        return this.data;
    }

    public GetGatewayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGatewayResponseBodyDataEnvironments extends TeaModel {
        /**
         * <p>The port information.</p>
         * 
         * <strong>example:</strong>
         * <p>The protocol. Valid values:</p>
         * <ul>
         * <li>TCP</li>
         * <li>UDP</li>
         * </ul>
         */
        @NameInMap("alias")
        public String alias;

        /**
         * <p>The load balancer type. Valid values:</p>
         * <ul>
         * <li>NLB: Network Load Balancer</li>
         * <li>CLB: Classic Load Balancer</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>env-cp9uhudlht***</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        /**
         * <p>The list of listened ports.</p>
         * 
         * <strong>example:</strong>
         * <p>default-gw-cp9ugg5***</p>
         */
        @NameInMap("name")
        public String name;

        public static GetGatewayResponseBodyDataEnvironments build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataEnvironments self = new GetGatewayResponseBodyDataEnvironments();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataEnvironments setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetGatewayResponseBodyDataEnvironments setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public GetGatewayResponseBodyDataEnvironments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetGatewayResponseBodyDataLoadBalancersPorts extends TeaModel {
        /**
         * <p>The listening port number</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The protocol of the port</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        public static GetGatewayResponseBodyDataLoadBalancersPorts build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataLoadBalancersPorts self = new GetGatewayResponseBodyDataLoadBalancersPorts();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataLoadBalancersPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetGatewayResponseBodyDataLoadBalancersPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class GetGatewayResponseBodyDataLoadBalancers extends TeaModel {
        /**
         * <p>The IP address of the load balancer</p>
         * 
         * <strong>example:</strong>
         * <p>nlb-xoh3pghr***.cn-hangzhou.nlb.aliyuncs.com</p>
         */
        @NameInMap("address")
        public String address;

        /**
         * <p>The IP version of the load balancer address</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("addressIpVersion")
        public String addressIpVersion;

        /**
         * <p>The address type of the load balancer</p>
         * 
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        @NameInMap("addressType")
        public String addressType;

        /**
         * <p>Whether this is the default gateway ingress</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("gatewayDefault")
        public Boolean gatewayDefault;

        /**
         * <p>List of IPv4 addresses</p>
         */
        @NameInMap("ipv4Addresses")
        public java.util.List<String> ipv4Addresses;

        /**
         * <p>List of IPv6 addresses</p>
         */
        @NameInMap("ipv6Addresses")
        public java.util.List<String> ipv6Addresses;

        /**
         * <p>The unique identifier of the load balancer</p>
         * 
         * <strong>example:</strong>
         * <p>nlb-xoh3pghru7c***</p>
         */
        @NameInMap("loadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The mode of the load balancer</p>
         * 
         * <strong>example:</strong>
         * <p>Managed</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <p>List of port configurations for the load balancer</p>
         */
        @NameInMap("ports")
        public java.util.List<GetGatewayResponseBodyDataLoadBalancersPorts> ports;

        /**
         * <p>The current status of the load balancer</p>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The type of load balancer</p>
         * 
         * <strong>example:</strong>
         * <p>NLB</p>
         */
        @NameInMap("type")
        public String type;

        public static GetGatewayResponseBodyDataLoadBalancers build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataLoadBalancers self = new GetGatewayResponseBodyDataLoadBalancers();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataLoadBalancers setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetGatewayResponseBodyDataLoadBalancers setAddressIpVersion(String addressIpVersion) {
            this.addressIpVersion = addressIpVersion;
            return this;
        }
        public String getAddressIpVersion() {
            return this.addressIpVersion;
        }

        public GetGatewayResponseBodyDataLoadBalancers setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public GetGatewayResponseBodyDataLoadBalancers setGatewayDefault(Boolean gatewayDefault) {
            this.gatewayDefault = gatewayDefault;
            return this;
        }
        public Boolean getGatewayDefault() {
            return this.gatewayDefault;
        }

        public GetGatewayResponseBodyDataLoadBalancers setIpv4Addresses(java.util.List<String> ipv4Addresses) {
            this.ipv4Addresses = ipv4Addresses;
            return this;
        }
        public java.util.List<String> getIpv4Addresses() {
            return this.ipv4Addresses;
        }

        public GetGatewayResponseBodyDataLoadBalancers setIpv6Addresses(java.util.List<String> ipv6Addresses) {
            this.ipv6Addresses = ipv6Addresses;
            return this;
        }
        public java.util.List<String> getIpv6Addresses() {
            return this.ipv6Addresses;
        }

        public GetGatewayResponseBodyDataLoadBalancers setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public GetGatewayResponseBodyDataLoadBalancers setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetGatewayResponseBodyDataLoadBalancers setPorts(java.util.List<GetGatewayResponseBodyDataLoadBalancersPorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<GetGatewayResponseBodyDataLoadBalancersPorts> getPorts() {
            return this.ports;
        }

        public GetGatewayResponseBodyDataLoadBalancers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetGatewayResponseBodyDataLoadBalancers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetGatewayResponseBodyDataMaintenancePeriod extends TeaModel {
        /**
         * <p>The maintenance end time</p>
         * 
         * <strong>example:</strong>
         * <p>06:00</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <p>The maintenance start time</p>
         * 
         * <strong>example:</strong>
         * <p>02:00</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static GetGatewayResponseBodyDataMaintenancePeriod build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataMaintenancePeriod self = new GetGatewayResponseBodyDataMaintenancePeriod();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataMaintenancePeriod setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetGatewayResponseBodyDataMaintenancePeriod setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetGatewayResponseBodyDataSecurityGroup extends TeaModel {
        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>APIG-sg-gw-cq7ke5ll***</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The load balancer status. Valid values:</p>
         * <ul>
         * <li>Ready: The load balancer is available.</li>
         * <li>NotCreate: The load balancer is not associated with the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sg-bp16tafq9***</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        public static GetGatewayResponseBodyDataSecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataSecurityGroup self = new GetGatewayResponseBodyDataSecurityGroup();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataSecurityGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayResponseBodyDataSecurityGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class GetGatewayResponseBodyDataTags extends TeaModel {
        /**
         * <p>The tag key</p>
         * 
         * <strong>example:</strong>
         * <p>owner</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("value")
        public String value;

        public static GetGatewayResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataTags self = new GetGatewayResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetGatewayResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetGatewayResponseBodyDataVSwitch extends TeaModel {
        /**
         * <p>The resource tags.</p>
         * 
         * <strong>example:</strong>
         * <p>The resource tag.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1c7ggkj***</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        public static GetGatewayResponseBodyDataVSwitch build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataVSwitch self = new GetGatewayResponseBodyDataVSwitch();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataVSwitch setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayResponseBodyDataVSwitch setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class GetGatewayResponseBodyDataVpc extends TeaModel {
        /**
         * <p>=</p>
         * 
         * <strong>example:</strong>
         * <p>$.errorCode</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Query Gateway Details</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1llj52lvj6xc***</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static GetGatewayResponseBodyDataVpc build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataVpc self = new GetGatewayResponseBodyDataVpc();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataVpc setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayResponseBodyDataVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetGatewayResponseBodyDataZonesVSwitch extends TeaModel {
        /**
         * <p>The VSwitch name</p>
         * 
         * <strong>example:</strong>
         * <p>vswitch-name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The VSwitch ID</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1c7ggkj***</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        public static GetGatewayResponseBodyDataZonesVSwitch build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataZonesVSwitch self = new GetGatewayResponseBodyDataZonesVSwitch();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataZonesVSwitch setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayResponseBodyDataZonesVSwitch setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class GetGatewayResponseBodyDataZones extends TeaModel {
        /**
         * <p>The zone name</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou Zone I</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The VSwitch information in the zone</p>
         */
        @NameInMap("vSwitch")
        public GetGatewayResponseBodyDataZonesVSwitch vSwitch;

        /**
         * <p>The zone ID</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-e</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static GetGatewayResponseBodyDataZones build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataZones self = new GetGatewayResponseBodyDataZones();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataZones setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayResponseBodyDataZones setVSwitch(GetGatewayResponseBodyDataZonesVSwitch vSwitch) {
            this.vSwitch = vSwitch;
            return this;
        }
        public GetGatewayResponseBodyDataZonesVSwitch getVSwitch() {
            return this.vSwitch;
        }

        public GetGatewayResponseBodyDataZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class GetGatewayResponseBodyData extends TeaModel {
        /**
         * <p>The vSwitch associated with the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <p>The mode in which the load balancer is provided. Valid values:</p>
         * <ul>
         * <li>Managed: Cloud-native API Gateway manages and provides the load balancer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Console</p>
         */
        @NameInMap("createFrom")
        public String createFrom;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        /**
         * <p>The IP version of the address. Valid values:</p>
         * <ul>
         * <li>ipv4</li>
         * <li>ipv6</li>
         * </ul>
         */
        @NameInMap("environments")
        public java.util.List<GetGatewayResponseBodyDataEnvironments> environments;

        /**
         * <p>The ingress information.</p>
         * 
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("expireTimestamp")
        public Long expireTimestamp;

        /**
         * <p>gatewayEdition</p>
         * 
         * <strong>example:</strong>
         * <p>Serverless</p>
         */
        @NameInMap("gatewayEdition")
        public String gatewayEdition;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cq2vundlhtg***</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        @NameInMap("gatewayType")
        public String gatewayType;

        /**
         * <p>The ISP type for traffic routing</p>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        @NameInMap("isp")
        public String isp;

        /**
         * <p>loadBalancers</p>
         */
        @NameInMap("loadBalancers")
        public java.util.List<GetGatewayResponseBodyDataLoadBalancers> loadBalancers;

        /**
         * <p>The maintenance period configuration</p>
         */
        @NameInMap("maintenancePeriod")
        public GetGatewayResponseBodyDataMaintenancePeriod maintenancePeriod;

        /**
         * <p>The security group name.</p>
         * 
         * <strong>example:</strong>
         * <p>itemcenter-gateway</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>HangzhouZoneE</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("replicas")
        public String replicas;

        /**
         * <p>The resource group ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2ij6pwxsvua</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The port number.</p>
         */
        @NameInMap("securityGroup")
        public GetGatewayResponseBodyDataSecurityGroup securityGroup;

        /**
         * <p>The zone name.</p>
         * 
         * <strong>example:</strong>
         * <p>apigw.small.x1</p>
         */
        @NameInMap("spec")
        public String spec;

        /**
         * <p>The VPC associated with the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>List of tags associated with the gateway</p>
         */
        @NameInMap("tags")
        public java.util.List<GetGatewayResponseBodyDataTags> tags;

        /**
         * <p>The load balancer address type. Valid values:</p>
         * <ul>
         * <li>Internet</li>
         * <li>Intranet</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2.0.2</p>
         */
        @NameInMap("targetVersion")
        public String targetVersion;

        /**
         * <p>The ingress addresses of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("updateTimestamp")
        public Long updateTimestamp;

        /**
         * <p>rg-aek2s3cvc4jzfxi</p>
         */
        @NameInMap("vSwitch")
        public GetGatewayResponseBodyDataVSwitch vSwitch;

        /**
         * <p>The load balancer IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.2</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The tag key.</p>
         */
        @NameInMap("vpc")
        public GetGatewayResponseBodyDataVpc vpc;

        /**
         * <p>List of zone information</p>
         */
        @NameInMap("zones")
        public java.util.List<GetGatewayResponseBodyDataZones> zones;

        public static GetGatewayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyData self = new GetGatewayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyData setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public GetGatewayResponseBodyData setCreateFrom(String createFrom) {
            this.createFrom = createFrom;
            return this;
        }
        public String getCreateFrom() {
            return this.createFrom;
        }

        public GetGatewayResponseBodyData setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public GetGatewayResponseBodyData setEnvironments(java.util.List<GetGatewayResponseBodyDataEnvironments> environments) {
            this.environments = environments;
            return this;
        }
        public java.util.List<GetGatewayResponseBodyDataEnvironments> getEnvironments() {
            return this.environments;
        }

        public GetGatewayResponseBodyData setExpireTimestamp(Long expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        public GetGatewayResponseBodyData setGatewayEdition(String gatewayEdition) {
            this.gatewayEdition = gatewayEdition;
            return this;
        }
        public String getGatewayEdition() {
            return this.gatewayEdition;
        }

        public GetGatewayResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetGatewayResponseBodyData setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public GetGatewayResponseBodyData setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public GetGatewayResponseBodyData setLoadBalancers(java.util.List<GetGatewayResponseBodyDataLoadBalancers> loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }
        public java.util.List<GetGatewayResponseBodyDataLoadBalancers> getLoadBalancers() {
            return this.loadBalancers;
        }

        public GetGatewayResponseBodyData setMaintenancePeriod(GetGatewayResponseBodyDataMaintenancePeriod maintenancePeriod) {
            this.maintenancePeriod = maintenancePeriod;
            return this;
        }
        public GetGatewayResponseBodyDataMaintenancePeriod getMaintenancePeriod() {
            return this.maintenancePeriod;
        }

        public GetGatewayResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayResponseBodyData setReplicas(String replicas) {
            this.replicas = replicas;
            return this;
        }
        public String getReplicas() {
            return this.replicas;
        }

        public GetGatewayResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetGatewayResponseBodyData setSecurityGroup(GetGatewayResponseBodyDataSecurityGroup securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public GetGatewayResponseBodyDataSecurityGroup getSecurityGroup() {
            return this.securityGroup;
        }

        public GetGatewayResponseBodyData setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public GetGatewayResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetGatewayResponseBodyData setTags(java.util.List<GetGatewayResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetGatewayResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public GetGatewayResponseBodyData setTargetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            return this;
        }
        public String getTargetVersion() {
            return this.targetVersion;
        }

        public GetGatewayResponseBodyData setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public GetGatewayResponseBodyData setVSwitch(GetGatewayResponseBodyDataVSwitch vSwitch) {
            this.vSwitch = vSwitch;
            return this;
        }
        public GetGatewayResponseBodyDataVSwitch getVSwitch() {
            return this.vSwitch;
        }

        public GetGatewayResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetGatewayResponseBodyData setVpc(GetGatewayResponseBodyDataVpc vpc) {
            this.vpc = vpc;
            return this;
        }
        public GetGatewayResponseBodyDataVpc getVpc() {
            return this.vpc;
        }

        public GetGatewayResponseBodyData setZones(java.util.List<GetGatewayResponseBodyDataZones> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<GetGatewayResponseBodyDataZones> getZones() {
            return this.zones;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class NetworkConfig extends TeaModel {
    /**
     * <p>The number of load balancing instances in a single zone. This parameter is supported only for the HP_ALILB type.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("lbReplica")
    public Integer lbReplica;

    /**
     * <p>The list of vSwitch and load balancing configurations for each zone in the Network Load Balancer (NLB) architecture.</p>
     */
    @NameInMap("loadBalanceConfig")
    public java.util.List<NetworkConfigLoadBalanceConfig> loadBalanceConfig;

    /**
     * <p>The load balancing type. Default value: DEFAULT.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("loadBalanceType")
    public String loadBalanceType;

    /**
     * <p>The network type. Only VPC is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1xk0naij7jx4ph1****</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <p>The ID of the zone to which the network belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-e</p>
     */
    @NameInMap("vsArea")
    public String vsArea;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1ogpdintii5qvyx****</p>
     */
    @NameInMap("vswitchId")
    public String vswitchId;

    /**
     * <p>The IP whitelist group configuration. You do not need to specify this parameter when creating an instance, and it does not take effect during instance creation. You must use a separate API operation to configure whitelists for different roles.</p>
     */
    @NameInMap("whiteIpGroupList")
    public java.util.List<WhiteIpGroup> whiteIpGroupList;

    public static NetworkConfig build(java.util.Map<String, ?> map) throws Exception {
        NetworkConfig self = new NetworkConfig();
        return TeaModel.build(map, self);
    }

    public NetworkConfig setLbReplica(Integer lbReplica) {
        this.lbReplica = lbReplica;
        return this;
    }
    public Integer getLbReplica() {
        return this.lbReplica;
    }

    public NetworkConfig setLoadBalanceConfig(java.util.List<NetworkConfigLoadBalanceConfig> loadBalanceConfig) {
        this.loadBalanceConfig = loadBalanceConfig;
        return this;
    }
    public java.util.List<NetworkConfigLoadBalanceConfig> getLoadBalanceConfig() {
        return this.loadBalanceConfig;
    }

    public NetworkConfig setLoadBalanceType(String loadBalanceType) {
        this.loadBalanceType = loadBalanceType;
        return this;
    }
    public String getLoadBalanceType() {
        return this.loadBalanceType;
    }

    public NetworkConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public NetworkConfig setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public NetworkConfig setVsArea(String vsArea) {
        this.vsArea = vsArea;
        return this;
    }
    public String getVsArea() {
        return this.vsArea;
    }

    public NetworkConfig setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public NetworkConfig setWhiteIpGroupList(java.util.List<WhiteIpGroup> whiteIpGroupList) {
        this.whiteIpGroupList = whiteIpGroupList;
        return this;
    }
    public java.util.List<WhiteIpGroup> getWhiteIpGroupList() {
        return this.whiteIpGroupList;
    }

    public static class NetworkConfigLoadBalanceConfig extends TeaModel {
        /**
         * <p>The zone information, such as cn-hangzhou-i.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("vsArea")
        public String vsArea;

        /**
         * <p>vswitchId</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxxx</p>
         */
        @NameInMap("vswitchId")
        public String vswitchId;

        public static NetworkConfigLoadBalanceConfig build(java.util.Map<String, ?> map) throws Exception {
            NetworkConfigLoadBalanceConfig self = new NetworkConfigLoadBalanceConfig();
            return TeaModel.build(map, self);
        }

        public NetworkConfigLoadBalanceConfig setVsArea(String vsArea) {
            this.vsArea = vsArea;
            return this;
        }
        public String getVsArea() {
            return this.vsArea;
        }

        public NetworkConfigLoadBalanceConfig setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

}

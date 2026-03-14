// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class NetworkConfig extends TeaModel {
    @NameInMap("lbReplica")
    public Integer lbReplica;

    @NameInMap("loadBalanceConfig")
    public java.util.List<NetworkConfigLoadBalanceConfig> loadBalanceConfig;

    /**
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("loadBalanceType")
    public String loadBalanceType;

    /**
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>vpc-bp1xk0naij7jx4ph1****</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-e</p>
     */
    @NameInMap("vsArea")
    public String vsArea;

    /**
     * <strong>example:</strong>
     * <p>vsw-bp1ogpdintii5qvyx****</p>
     */
    @NameInMap("vswitchId")
    public String vswitchId;

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
        @NameInMap("vsArea")
        public String vsArea;

        /**
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

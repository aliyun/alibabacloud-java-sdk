// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateGroupRequest extends TeaModel {
    /**
     * <p>The user-defined labels.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:null}</p>
     */
    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    /**
     * <p>The VPC configuration.</p>
     */
    @NameInMap("Network")
    public UpdateGroupRequestNetwork network;

    /**
     * <p>The traffic mode. Valid values: auto and customized. In auto mode, weights are automatically allocated based on the proportion of instances. In customized mode, traffic is distributed based on custom fixed weights.</p>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("TrafficMode")
    public String trafficMode;

    public static UpdateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupRequest self = new UpdateGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGroupRequest setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public UpdateGroupRequest setNetwork(UpdateGroupRequestNetwork network) {
        this.network = network;
        return this;
    }
    public UpdateGroupRequestNetwork getNetwork() {
        return this.network;
    }

    public UpdateGroupRequest setTrafficMode(String trafficMode) {
        this.trafficMode = trafficMode;
        return this;
    }
    public String getTrafficMode() {
        return this.trafficMode;
    }

    public static class UpdateGroupRequestNetwork extends TeaModel {
        /**
         * <p>The dedicated gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-rcgxxxxxxzytgq9zrj</p>
         */
        @NameInMap("GatewayId")
        public String gatewayId;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-uf6xxxxxxc3lysxabg72i</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1xxxxxxjeqwbo3z2pux</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1xxxxxx17e0qrykjr9b</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static UpdateGroupRequestNetwork build(java.util.Map<String, ?> map) throws Exception {
            UpdateGroupRequestNetwork self = new UpdateGroupRequestNetwork();
            return TeaModel.build(map, self);
        }

        public UpdateGroupRequestNetwork setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public UpdateGroupRequestNetwork setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateGroupRequestNetwork setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public UpdateGroupRequestNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}

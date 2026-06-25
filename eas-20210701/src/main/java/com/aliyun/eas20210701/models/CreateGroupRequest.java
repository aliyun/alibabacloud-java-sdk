// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateGroupRequest extends TeaModel {
    /**
     * <p>The user-defined labels.</p>
     */
    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    /**
     * <p>The name of the group.</p>
     * 
     * <strong>example:</strong>
     * <p>foo</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The virtual private cloud (VPC) configuration.</p>
     */
    @NameInMap("Network")
    public CreateGroupRequestNetwork network;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12xx34</p>
     */
    @NameInMap("WorkSpaceId")
    public String workSpaceId;

    public static CreateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupRequest self = new CreateGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupRequest setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public CreateGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGroupRequest setNetwork(CreateGroupRequestNetwork network) {
        this.network = network;
        return this;
    }
    public CreateGroupRequestNetwork getNetwork() {
        return this.network;
    }

    public CreateGroupRequest setWorkSpaceId(String workSpaceId) {
        this.workSpaceId = workSpaceId;
        return this;
    }
    public String getWorkSpaceId() {
        return this.workSpaceId;
    }

    public static class CreateGroupRequestNetwork extends TeaModel {
        /**
         * <p>The dedicated gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-248xxxxxxvlkhtbrda</p>
         */
        @NameInMap("GatewayId")
        public String gatewayId;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-584xxxxxx7h08llvoww5tv5gl</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1xxxxxxwmssgq28gye8</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1xxxxxx0qrykjr9b</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static CreateGroupRequestNetwork build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupRequestNetwork self = new CreateGroupRequestNetwork();
            return TeaModel.build(map, self);
        }

        public CreateGroupRequestNetwork setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public CreateGroupRequestNetwork setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateGroupRequestNetwork setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateGroupRequestNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}

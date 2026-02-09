// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GatewayInfo extends TeaModel {
    /**
     * <p>The instance engine version.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.7</p>
     */
    @NameInMap("engineVersion")
    public String engineVersion;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cq7og15lhtgi6qasrj60</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>apitest-gw</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The virtual private cloud (VPC) information.</p>
     */
    @NameInMap("vpcInfo")
    public GatewayInfoVpcInfo vpcInfo;

    public static GatewayInfo build(java.util.Map<String, ?> map) throws Exception {
        GatewayInfo self = new GatewayInfo();
        return TeaModel.build(map, self);
    }

    public GatewayInfo setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public GatewayInfo setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public GatewayInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GatewayInfo setVpcInfo(GatewayInfoVpcInfo vpcInfo) {
        this.vpcInfo = vpcInfo;
        return this;
    }
    public GatewayInfoVpcInfo getVpcInfo() {
        return this.vpcInfo;
    }

    public static class GatewayInfoVpcInfo extends TeaModel {
        /**
         * <p>The VPC name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-vpc</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf664nyle5kh***</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static GatewayInfoVpcInfo build(java.util.Map<String, ?> map) throws Exception {
            GatewayInfoVpcInfo self = new GatewayInfoVpcInfo();
            return TeaModel.build(map, self);
        }

        public GatewayInfoVpcInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GatewayInfoVpcInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}

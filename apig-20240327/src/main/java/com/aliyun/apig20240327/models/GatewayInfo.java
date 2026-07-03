// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GatewayInfo extends TeaModel {
    /**
     * <p>The gateway DPI engine version.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.7</p>
     */
    @NameInMap("engineVersion")
    public String engineVersion;

    /**
     * <p>The gateway instance edition. Valid values:</p>
     * <ul>
     * <li>Professional: standard instance.</li>
     * <li>Serverless: Serverless.</li>
     * <li>MultiTenantServerless: multi-tenant Serverless.</li>
     * <li>Unknown: unknown.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MultiTenantServerless</p>
     */
    @NameInMap("gatewayEdition")
    public String gatewayEdition;

    /**
     * <p>The gateway ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cq7og15lhtgi6qasrj60</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The gateway name.</p>
     * 
     * <strong>example:</strong>
     * <p>apitest-gw</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The VPC information.</p>
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

    public GatewayInfo setGatewayEdition(String gatewayEdition) {
        this.gatewayEdition = gatewayEdition;
        return this;
    }
    public String getGatewayEdition() {
        return this.gatewayEdition;
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
         * <p>商品中心预发环境专有网络</p>
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

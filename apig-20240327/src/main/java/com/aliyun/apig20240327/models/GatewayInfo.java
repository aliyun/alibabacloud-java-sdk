// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GatewayInfo extends TeaModel {
    @NameInMap("engineVersion")
    public String engineVersion;

    @NameInMap("gatewayId")
    public String gatewayId;

    @NameInMap("name")
    public String name;

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
        @NameInMap("name")
        public String name;

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

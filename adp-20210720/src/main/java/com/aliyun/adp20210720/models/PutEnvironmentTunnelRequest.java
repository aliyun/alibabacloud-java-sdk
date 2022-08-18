// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class PutEnvironmentTunnelRequest extends TeaModel {
    @NameInMap("tunnelConfig")
    public PutEnvironmentTunnelRequestTunnelConfig tunnelConfig;

    @NameInMap("tunnelType")
    public String tunnelType;

    public static PutEnvironmentTunnelRequest build(java.util.Map<String, ?> map) throws Exception {
        PutEnvironmentTunnelRequest self = new PutEnvironmentTunnelRequest();
        return TeaModel.build(map, self);
    }

    public PutEnvironmentTunnelRequest setTunnelConfig(PutEnvironmentTunnelRequestTunnelConfig tunnelConfig) {
        this.tunnelConfig = tunnelConfig;
        return this;
    }
    public PutEnvironmentTunnelRequestTunnelConfig getTunnelConfig() {
        return this.tunnelConfig;
    }

    public PutEnvironmentTunnelRequest setTunnelType(String tunnelType) {
        this.tunnelType = tunnelType;
        return this;
    }
    public String getTunnelType() {
        return this.tunnelType;
    }

    public static class PutEnvironmentTunnelRequestTunnelConfig extends TeaModel {
        @NameInMap("hostname")
        public String hostname;

        @NameInMap("password")
        public String password;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("sshPort")
        public Integer sshPort;

        @NameInMap("username")
        public String username;

        @NameInMap("vpcId")
        public String vpcId;

        public static PutEnvironmentTunnelRequestTunnelConfig build(java.util.Map<String, ?> map) throws Exception {
            PutEnvironmentTunnelRequestTunnelConfig self = new PutEnvironmentTunnelRequestTunnelConfig();
            return TeaModel.build(map, self);
        }

        public PutEnvironmentTunnelRequestTunnelConfig setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public PutEnvironmentTunnelRequestTunnelConfig setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public PutEnvironmentTunnelRequestTunnelConfig setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public PutEnvironmentTunnelRequestTunnelConfig setSshPort(Integer sshPort) {
            this.sshPort = sshPort;
            return this;
        }
        public Integer getSshPort() {
            return this.sshPort;
        }

        public PutEnvironmentTunnelRequestTunnelConfig setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public PutEnvironmentTunnelRequestTunnelConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}

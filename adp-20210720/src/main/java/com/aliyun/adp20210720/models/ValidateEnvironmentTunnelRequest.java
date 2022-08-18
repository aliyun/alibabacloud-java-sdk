// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ValidateEnvironmentTunnelRequest extends TeaModel {
    @NameInMap("tunnelConfig")
    public ValidateEnvironmentTunnelRequestTunnelConfig tunnelConfig;

    @NameInMap("tunnelType")
    public String tunnelType;

    public static ValidateEnvironmentTunnelRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateEnvironmentTunnelRequest self = new ValidateEnvironmentTunnelRequest();
        return TeaModel.build(map, self);
    }

    public ValidateEnvironmentTunnelRequest setTunnelConfig(ValidateEnvironmentTunnelRequestTunnelConfig tunnelConfig) {
        this.tunnelConfig = tunnelConfig;
        return this;
    }
    public ValidateEnvironmentTunnelRequestTunnelConfig getTunnelConfig() {
        return this.tunnelConfig;
    }

    public ValidateEnvironmentTunnelRequest setTunnelType(String tunnelType) {
        this.tunnelType = tunnelType;
        return this;
    }
    public String getTunnelType() {
        return this.tunnelType;
    }

    public static class ValidateEnvironmentTunnelRequestTunnelConfig extends TeaModel {
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

        public static ValidateEnvironmentTunnelRequestTunnelConfig build(java.util.Map<String, ?> map) throws Exception {
            ValidateEnvironmentTunnelRequestTunnelConfig self = new ValidateEnvironmentTunnelRequestTunnelConfig();
            return TeaModel.build(map, self);
        }

        public ValidateEnvironmentTunnelRequestTunnelConfig setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ValidateEnvironmentTunnelRequestTunnelConfig setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ValidateEnvironmentTunnelRequestTunnelConfig setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ValidateEnvironmentTunnelRequestTunnelConfig setSshPort(Integer sshPort) {
            this.sshPort = sshPort;
            return this;
        }
        public Integer getSshPort() {
            return this.sshPort;
        }

        public ValidateEnvironmentTunnelRequestTunnelConfig setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ValidateEnvironmentTunnelRequestTunnelConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}

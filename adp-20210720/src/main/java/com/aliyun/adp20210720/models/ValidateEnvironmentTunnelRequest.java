// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ValidateEnvironmentTunnelRequest extends TeaModel {
    // 通道配置
    @NameInMap("tunnelConfig")
    public ValidateEnvironmentTunnelRequestTunnelConfig tunnelConfig;

    // 通道类型
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
        // 跳板机hostname
        @NameInMap("hostname")
        public String hostname;

        // 跳板机密码
        @NameInMap("password")
        public String password;

        // 直连地域id
        @NameInMap("regionId")
        public String regionId;

        // 跳板机ssh端口号
        @NameInMap("sshPort")
        public Integer sshPort;

        // 跳板机用户名
        @NameInMap("username")
        public String username;

        // 直连vpcId
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

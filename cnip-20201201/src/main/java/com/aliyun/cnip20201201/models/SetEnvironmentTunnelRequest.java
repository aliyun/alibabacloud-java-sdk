// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class SetEnvironmentTunnelRequest extends TeaModel {
    // 通道类型
    @NameInMap("tunnelType")
    public String tunnelType;

    // 通道配置
    @NameInMap("tunnelConfig")
    public SetEnvironmentTunnelRequestTunnelConfig tunnelConfig;

    public static SetEnvironmentTunnelRequest build(java.util.Map<String, ?> map) throws Exception {
        SetEnvironmentTunnelRequest self = new SetEnvironmentTunnelRequest();
        return TeaModel.build(map, self);
    }

    public SetEnvironmentTunnelRequest setTunnelType(String tunnelType) {
        this.tunnelType = tunnelType;
        return this;
    }
    public String getTunnelType() {
        return this.tunnelType;
    }

    public SetEnvironmentTunnelRequest setTunnelConfig(SetEnvironmentTunnelRequestTunnelConfig tunnelConfig) {
        this.tunnelConfig = tunnelConfig;
        return this;
    }
    public SetEnvironmentTunnelRequestTunnelConfig getTunnelConfig() {
        return this.tunnelConfig;
    }

    public static class SetEnvironmentTunnelRequestTunnelConfig extends TeaModel {
        // 跳板机ssh端口号
        @NameInMap("sshPort")
        public Integer sshPort;

        // 跳板机hostname
        @NameInMap("hostname")
        public String hostname;

        // 跳板机用户名
        @NameInMap("username")
        public String username;

        // 跳板机密码
        @NameInMap("password")
        public String password;

        // 直连vpcId
        @NameInMap("vpcId")
        public String vpcId;

        // 直连地域id
        @NameInMap("regionId")
        public String regionId;

        public static SetEnvironmentTunnelRequestTunnelConfig build(java.util.Map<String, ?> map) throws Exception {
            SetEnvironmentTunnelRequestTunnelConfig self = new SetEnvironmentTunnelRequestTunnelConfig();
            return TeaModel.build(map, self);
        }

        public SetEnvironmentTunnelRequestTunnelConfig setSshPort(Integer sshPort) {
            this.sshPort = sshPort;
            return this;
        }
        public Integer getSshPort() {
            return this.sshPort;
        }

        public SetEnvironmentTunnelRequestTunnelConfig setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public SetEnvironmentTunnelRequestTunnelConfig setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public SetEnvironmentTunnelRequestTunnelConfig setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public SetEnvironmentTunnelRequestTunnelConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public SetEnvironmentTunnelRequestTunnelConfig setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}

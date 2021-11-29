// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListEnvironmentTunnelsResponseBody extends TeaModel {
    // 错误码
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListEnvironmentTunnelsResponseBodyData data;

    // 错误信息
    @NameInMap("msg")
    public String msg;

    public static ListEnvironmentTunnelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentTunnelsResponseBody self = new ListEnvironmentTunnelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentTunnelsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEnvironmentTunnelsResponseBody setData(ListEnvironmentTunnelsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvironmentTunnelsResponseBodyData getData() {
        return this.data;
    }

    public ListEnvironmentTunnelsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class ListEnvironmentTunnelsResponseBodyDataListTunnelConfig extends TeaModel {
        // 跳板机hostname
        @NameInMap("hostname")
        public String hostname;

        // 跳板机密码
        @NameInMap("password")
        public String password;

        // 直连regionId
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

        public static ListEnvironmentTunnelsResponseBodyDataListTunnelConfig build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentTunnelsResponseBodyDataListTunnelConfig self = new ListEnvironmentTunnelsResponseBodyDataListTunnelConfig();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentTunnelsResponseBodyDataListTunnelConfig setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListEnvironmentTunnelsResponseBodyDataListTunnelConfig setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ListEnvironmentTunnelsResponseBodyDataListTunnelConfig setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListEnvironmentTunnelsResponseBodyDataListTunnelConfig setSshPort(Integer sshPort) {
            this.sshPort = sshPort;
            return this;
        }
        public Integer getSshPort() {
            return this.sshPort;
        }

        public ListEnvironmentTunnelsResponseBodyDataListTunnelConfig setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListEnvironmentTunnelsResponseBodyDataListTunnelConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListEnvironmentTunnelsResponseBodyDataList extends TeaModel {
        @NameInMap("tunnelConfig")
        public ListEnvironmentTunnelsResponseBodyDataListTunnelConfig tunnelConfig;

        // 通道类型
        @NameInMap("tunnelType")
        public String tunnelType;

        public static ListEnvironmentTunnelsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentTunnelsResponseBodyDataList self = new ListEnvironmentTunnelsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentTunnelsResponseBodyDataList setTunnelConfig(ListEnvironmentTunnelsResponseBodyDataListTunnelConfig tunnelConfig) {
            this.tunnelConfig = tunnelConfig;
            return this;
        }
        public ListEnvironmentTunnelsResponseBodyDataListTunnelConfig getTunnelConfig() {
            return this.tunnelConfig;
        }

        public ListEnvironmentTunnelsResponseBodyDataList setTunnelType(String tunnelType) {
            this.tunnelType = tunnelType;
            return this;
        }
        public String getTunnelType() {
            return this.tunnelType;
        }

    }

    public static class ListEnvironmentTunnelsResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListEnvironmentTunnelsResponseBodyDataList> list;

        public static ListEnvironmentTunnelsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentTunnelsResponseBodyData self = new ListEnvironmentTunnelsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentTunnelsResponseBodyData setList(java.util.List<ListEnvironmentTunnelsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListEnvironmentTunnelsResponseBodyDataList> getList() {
            return this.list;
        }

    }

}

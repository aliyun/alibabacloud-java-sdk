// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvironmentTunnelResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errCode")
    public String errCode;

    // 错误信息
    @NameInMap("errMsg")
    public String errMsg;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    @NameInMap("data")
    public ListEnvironmentTunnelResponseBodyData data;

    public static ListEnvironmentTunnelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentTunnelResponseBody self = new ListEnvironmentTunnelResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentTunnelResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListEnvironmentTunnelResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ListEnvironmentTunnelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListEnvironmentTunnelResponseBody setData(ListEnvironmentTunnelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvironmentTunnelResponseBodyData getData() {
        return this.data;
    }

    public static class ListEnvironmentTunnelResponseBodyDataListTunnelConfig extends TeaModel {
        // 跳板机hostname
        @NameInMap("hostname")
        public String hostname;

        // 跳板机ssh端口号
        @NameInMap("sshPort")
        public Integer sshPort;

        // 跳板机用户名
        @NameInMap("username")
        public String username;

        // 跳板机密码
        @NameInMap("password")
        public String password;

        // 直连vpcId
        @NameInMap("vpcId")
        public String vpcId;

        // 直连regionId
        @NameInMap("regionId")
        public String regionId;

        public static ListEnvironmentTunnelResponseBodyDataListTunnelConfig build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentTunnelResponseBodyDataListTunnelConfig self = new ListEnvironmentTunnelResponseBodyDataListTunnelConfig();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentTunnelResponseBodyDataListTunnelConfig setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListEnvironmentTunnelResponseBodyDataListTunnelConfig setSshPort(Integer sshPort) {
            this.sshPort = sshPort;
            return this;
        }
        public Integer getSshPort() {
            return this.sshPort;
        }

        public ListEnvironmentTunnelResponseBodyDataListTunnelConfig setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListEnvironmentTunnelResponseBodyDataListTunnelConfig setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ListEnvironmentTunnelResponseBodyDataListTunnelConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListEnvironmentTunnelResponseBodyDataListTunnelConfig setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListEnvironmentTunnelResponseBodyDataList extends TeaModel {
        // 通道类型
        @NameInMap("tunnelType")
        public String tunnelType;

        @NameInMap("tunnelConfig")
        public ListEnvironmentTunnelResponseBodyDataListTunnelConfig tunnelConfig;

        public static ListEnvironmentTunnelResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentTunnelResponseBodyDataList self = new ListEnvironmentTunnelResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentTunnelResponseBodyDataList setTunnelType(String tunnelType) {
            this.tunnelType = tunnelType;
            return this;
        }
        public String getTunnelType() {
            return this.tunnelType;
        }

        public ListEnvironmentTunnelResponseBodyDataList setTunnelConfig(ListEnvironmentTunnelResponseBodyDataListTunnelConfig tunnelConfig) {
            this.tunnelConfig = tunnelConfig;
            return this;
        }
        public ListEnvironmentTunnelResponseBodyDataListTunnelConfig getTunnelConfig() {
            return this.tunnelConfig;
        }

    }

    public static class ListEnvironmentTunnelResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListEnvironmentTunnelResponseBodyDataList> list;

        public static ListEnvironmentTunnelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentTunnelResponseBodyData self = new ListEnvironmentTunnelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentTunnelResponseBodyData setList(java.util.List<ListEnvironmentTunnelResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListEnvironmentTunnelResponseBodyDataList> getList() {
            return this.list;
        }

    }

}

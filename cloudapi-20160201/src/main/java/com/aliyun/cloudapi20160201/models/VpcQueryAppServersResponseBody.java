// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class VpcQueryAppServersResponseBody extends TeaModel {
    @NameInMap("AppServerInfos")
    public VpcQueryAppServersResponseBodyAppServerInfos appServerInfos;

    @NameInMap("RequestId")
    public String requestId;

    public static VpcQueryAppServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VpcQueryAppServersResponseBody self = new VpcQueryAppServersResponseBody();
        return TeaModel.build(map, self);
    }

    public VpcQueryAppServersResponseBody setAppServerInfos(VpcQueryAppServersResponseBodyAppServerInfos appServerInfos) {
        this.appServerInfos = appServerInfos;
        return this;
    }
    public VpcQueryAppServersResponseBodyAppServerInfos getAppServerInfos() {
        return this.appServerInfos;
    }

    public VpcQueryAppServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class VpcQueryAppServersResponseBodyAppServerInfosAppServerInfo extends TeaModel {
        @NameInMap("AddressPoolId")
        public String addressPoolId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("ServerMappingIp")
        public String serverMappingIp;

        @NameInMap("ServerType")
        public String serverType;

        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        public static VpcQueryAppServersResponseBodyAppServerInfosAppServerInfo build(java.util.Map<String, ?> map) throws Exception {
            VpcQueryAppServersResponseBodyAppServerInfosAppServerInfo self = new VpcQueryAppServersResponseBodyAppServerInfosAppServerInfo();
            return TeaModel.build(map, self);
        }

        public VpcQueryAppServersResponseBodyAppServerInfosAppServerInfo setAddressPoolId(String addressPoolId) {
            this.addressPoolId = addressPoolId;
            return this;
        }
        public String getAddressPoolId() {
            return this.addressPoolId;
        }

        public VpcQueryAppServersResponseBodyAppServerInfosAppServerInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public VpcQueryAppServersResponseBodyAppServerInfosAppServerInfo setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public VpcQueryAppServersResponseBodyAppServerInfosAppServerInfo setServerMappingIp(String serverMappingIp) {
            this.serverMappingIp = serverMappingIp;
            return this;
        }
        public String getServerMappingIp() {
            return this.serverMappingIp;
        }

        public VpcQueryAppServersResponseBodyAppServerInfosAppServerInfo setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

        public VpcQueryAppServersResponseBodyAppServerInfosAppServerInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public VpcQueryAppServersResponseBodyAppServerInfosAppServerInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class VpcQueryAppServersResponseBodyAppServerInfos extends TeaModel {
        @NameInMap("AppServerInfo")
        public java.util.List<VpcQueryAppServersResponseBodyAppServerInfosAppServerInfo> appServerInfo;

        public static VpcQueryAppServersResponseBodyAppServerInfos build(java.util.Map<String, ?> map) throws Exception {
            VpcQueryAppServersResponseBodyAppServerInfos self = new VpcQueryAppServersResponseBodyAppServerInfos();
            return TeaModel.build(map, self);
        }

        public VpcQueryAppServersResponseBodyAppServerInfos setAppServerInfo(java.util.List<VpcQueryAppServersResponseBodyAppServerInfosAppServerInfo> appServerInfo) {
            this.appServerInfo = appServerInfo;
            return this;
        }
        public java.util.List<VpcQueryAppServersResponseBodyAppServerInfosAppServerInfo> getAppServerInfo() {
            return this.appServerInfo;
        }

    }

}

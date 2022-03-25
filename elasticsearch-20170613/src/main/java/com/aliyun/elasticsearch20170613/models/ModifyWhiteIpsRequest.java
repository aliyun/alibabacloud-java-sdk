// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ModifyWhiteIpsRequest extends TeaModel {
    // 修改方式，取值含义如下：
    // 
    // Cover（默认值）：使用ips参数的值覆盖原IP白名单。
    // 
    // Append：在原IP白名单中增加ips参数中输入的IP地址。
    // 
    // Delete：Delete：在原IP白名单中删除ips参数中输入的IP地址，至少需要保留一个IP地址。
    @NameInMap("modifyMode")
    public String modifyMode;

    // 网络类型。可选值：PRIVATE（私网）、PUBLIC（公网）。如果选填了whiteIpList参数，则该参数必填。
    @NameInMap("networkType")
    public String networkType;

    // 节点类型。可选值：WORKER（Elasticsearch集群）、KIBANA（Kibana集群）。如果选填了whiteIpList参数，则该参数必填。
    @NameInMap("nodeType")
    public String nodeType;

    // 以白名单组whiteIpGroup传参方式，更新实例白名单安全配置。仅支持更新一个白名单组。
    @NameInMap("whiteIpGroup")
    public ModifyWhiteIpsRequestWhiteIpGroup whiteIpGroup;

    // 白名单列表。whiteIpGroup为空时可用，更改默认分组白名单
    @NameInMap("whiteIpList")
    public java.util.List<String> whiteIpList;

    @NameInMap("clientToken")
    public String clientToken;

    public static ModifyWhiteIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWhiteIpsRequest self = new ModifyWhiteIpsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWhiteIpsRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

    public ModifyWhiteIpsRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public ModifyWhiteIpsRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public ModifyWhiteIpsRequest setWhiteIpGroup(ModifyWhiteIpsRequestWhiteIpGroup whiteIpGroup) {
        this.whiteIpGroup = whiteIpGroup;
        return this;
    }
    public ModifyWhiteIpsRequestWhiteIpGroup getWhiteIpGroup() {
        return this.whiteIpGroup;
    }

    public ModifyWhiteIpsRequest setWhiteIpList(java.util.List<String> whiteIpList) {
        this.whiteIpList = whiteIpList;
        return this;
    }
    public java.util.List<String> getWhiteIpList() {
        return this.whiteIpList;
    }

    public ModifyWhiteIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class ModifyWhiteIpsRequestWhiteIpGroup extends TeaModel {
        // 白名单组的组名。如果选填了whiteIpGroup参数，则该参数必填。
        @NameInMap("groupName")
        public String groupName;

        // 白名单组中的IP列表。如果选填了whiteIpGroup参数，则该参数必填。
        @NameInMap("ips")
        public java.util.List<String> ips;

        // ip白名单的类型
        @NameInMap("whiteIpType")
        public String whiteIpType;

        public static ModifyWhiteIpsRequestWhiteIpGroup build(java.util.Map<String, ?> map) throws Exception {
            ModifyWhiteIpsRequestWhiteIpGroup self = new ModifyWhiteIpsRequestWhiteIpGroup();
            return TeaModel.build(map, self);
        }

        public ModifyWhiteIpsRequestWhiteIpGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ModifyWhiteIpsRequestWhiteIpGroup setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

        public ModifyWhiteIpsRequestWhiteIpGroup setWhiteIpType(String whiteIpType) {
            this.whiteIpType = whiteIpType;
            return this;
        }
        public String getWhiteIpType() {
            return this.whiteIpType;
        }

    }

}

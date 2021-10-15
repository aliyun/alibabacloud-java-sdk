// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ModifyWhiteIpsRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("nodeType")
    public String nodeType;

    @NameInMap("networkType")
    public String networkType;

    @NameInMap("modifyMode")
    public String modifyMode;

    @NameInMap("whiteIpList")
    public java.util.List<String> whiteIpList;

    @NameInMap("whiteIpGroup")
    public ModifyWhiteIpsRequestWhiteIpGroup whiteIpGroup;

    public static ModifyWhiteIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWhiteIpsRequest self = new ModifyWhiteIpsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWhiteIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyWhiteIpsRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public ModifyWhiteIpsRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public ModifyWhiteIpsRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

    public ModifyWhiteIpsRequest setWhiteIpList(java.util.List<String> whiteIpList) {
        this.whiteIpList = whiteIpList;
        return this;
    }
    public java.util.List<String> getWhiteIpList() {
        return this.whiteIpList;
    }

    public ModifyWhiteIpsRequest setWhiteIpGroup(ModifyWhiteIpsRequestWhiteIpGroup whiteIpGroup) {
        this.whiteIpGroup = whiteIpGroup;
        return this;
    }
    public ModifyWhiteIpsRequestWhiteIpGroup getWhiteIpGroup() {
        return this.whiteIpGroup;
    }

    public static class ModifyWhiteIpsRequestWhiteIpGroup extends TeaModel {
        @NameInMap("groupName")
        public String groupName;

        @NameInMap("ips")
        public java.util.List<String> ips;

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

    }

}

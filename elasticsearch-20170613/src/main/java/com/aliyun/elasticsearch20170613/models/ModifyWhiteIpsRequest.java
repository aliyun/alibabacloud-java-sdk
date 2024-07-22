// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ModifyWhiteIpsRequest extends TeaModel {
    /**
     * <p>The information about the IP address whitelist that you want to update. You can specify only one whitelist.</p>
     * <blockquote>
     * <p>You cannot configure both the whiteIpList and whiteIpGroup parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("modifyMode")
    public String modifyMode;

    /**
     * <p>The IP addresses in the whitelist. This parameter is available if the whiteIpGroup parameter is left empty. The default IP address whitelist is updated based on the value of this parameter.</p>
     * <blockquote>
     * <p>You cannot configure both the whiteIpList and whiteIpGroup parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("networkType")
    public String networkType;

    /**
     * <p>The IP addresses in the whitelist. This parameter is available if the whiteIpGroup parameter is left empty. The default IP address whitelist is updated based on the value of this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>WORKER</p>
     */
    @NameInMap("nodeType")
    public String nodeType;

    /**
     * <p>The IP addresses in the whitelist. This parameter is required if you configure the whiteIpGroup parameter.</p>
     */
    @NameInMap("whiteIpGroup")
    public ModifyWhiteIpsRequestWhiteIpGroup whiteIpGroup;

    /**
     * <p>The name of the whitelist. This parameter is required if you configure the whiteIpGroup parameter.</p>
     */
    @NameInMap("whiteIpList")
    public java.util.List<String> whiteIpList;

    /**
     * <p>The network type. This parameter is required if you configure the whiteIpList parameter. Valid values:</p>
     * <ul>
     * <li>PRIVATE</li>
     * <li>PUBLIC</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
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
        /**
         * <p>The type of the IP address whitelist. Valid values:</p>
         * <ul>
         * <li>PRIVATE_KIBANA</li>
         * <li>PRIVATE_ES</li>
         * <li>PUBLIC_ES</li>
         * <li>PUBLIC_KIBANA</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test_group</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <p>The returned result.</p>
         */
        @NameInMap("ips")
        public java.util.List<String> ips;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE_ES</p>
         */
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

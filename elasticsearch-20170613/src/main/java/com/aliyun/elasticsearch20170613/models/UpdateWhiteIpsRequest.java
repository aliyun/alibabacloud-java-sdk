// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateWhiteIpsRequest extends TeaModel {
    @NameInMap("esIPWhitelist")
    public java.util.List<String> esIPWhitelist;

    @NameInMap("whiteIpGroup")
    public UpdateWhiteIpsRequestWhiteIpGroup whiteIpGroup;

    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("modifyMode")
    public String modifyMode;

    public static UpdateWhiteIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWhiteIpsRequest self = new UpdateWhiteIpsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWhiteIpsRequest setEsIPWhitelist(java.util.List<String> esIPWhitelist) {
        this.esIPWhitelist = esIPWhitelist;
        return this;
    }
    public java.util.List<String> getEsIPWhitelist() {
        return this.esIPWhitelist;
    }

    public UpdateWhiteIpsRequest setWhiteIpGroup(UpdateWhiteIpsRequestWhiteIpGroup whiteIpGroup) {
        this.whiteIpGroup = whiteIpGroup;
        return this;
    }
    public UpdateWhiteIpsRequestWhiteIpGroup getWhiteIpGroup() {
        return this.whiteIpGroup;
    }

    public UpdateWhiteIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateWhiteIpsRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

    public static class UpdateWhiteIpsRequestWhiteIpGroup extends TeaModel {
        @NameInMap("groupName")
        public String groupName;

        @NameInMap("ips")
        public java.util.List<String> ips;

        @NameInMap("whiteIpType")
        public String whiteIpType;

        public static UpdateWhiteIpsRequestWhiteIpGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateWhiteIpsRequestWhiteIpGroup self = new UpdateWhiteIpsRequestWhiteIpGroup();
            return TeaModel.build(map, self);
        }

        public UpdateWhiteIpsRequestWhiteIpGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateWhiteIpsRequestWhiteIpGroup setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

        public UpdateWhiteIpsRequestWhiteIpGroup setWhiteIpType(String whiteIpType) {
            this.whiteIpType = whiteIpType;
            return this;
        }
        public String getWhiteIpType() {
            return this.whiteIpType;
        }

    }

}

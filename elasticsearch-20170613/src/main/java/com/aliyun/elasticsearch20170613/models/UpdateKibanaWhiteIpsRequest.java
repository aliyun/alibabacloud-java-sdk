// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateKibanaWhiteIpsRequest extends TeaModel {
    @NameInMap("kibanaIPWhitelist")
    public java.util.List<String> kibanaIPWhitelist;

    @NameInMap("whiteIpGroup")
    public UpdateKibanaWhiteIpsRequestWhiteIpGroup whiteIpGroup;

    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("modifyMode")
    public String modifyMode;

    public static UpdateKibanaWhiteIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKibanaWhiteIpsRequest self = new UpdateKibanaWhiteIpsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKibanaWhiteIpsRequest setKibanaIPWhitelist(java.util.List<String> kibanaIPWhitelist) {
        this.kibanaIPWhitelist = kibanaIPWhitelist;
        return this;
    }
    public java.util.List<String> getKibanaIPWhitelist() {
        return this.kibanaIPWhitelist;
    }

    public UpdateKibanaWhiteIpsRequest setWhiteIpGroup(UpdateKibanaWhiteIpsRequestWhiteIpGroup whiteIpGroup) {
        this.whiteIpGroup = whiteIpGroup;
        return this;
    }
    public UpdateKibanaWhiteIpsRequestWhiteIpGroup getWhiteIpGroup() {
        return this.whiteIpGroup;
    }

    public UpdateKibanaWhiteIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateKibanaWhiteIpsRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

    public static class UpdateKibanaWhiteIpsRequestWhiteIpGroup extends TeaModel {
        @NameInMap("groupName")
        public String groupName;

        @NameInMap("ips")
        public java.util.List<String> ips;

        @NameInMap("whiteIpType")
        public String whiteIpType;

        public static UpdateKibanaWhiteIpsRequestWhiteIpGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateKibanaWhiteIpsRequestWhiteIpGroup self = new UpdateKibanaWhiteIpsRequestWhiteIpGroup();
            return TeaModel.build(map, self);
        }

        public UpdateKibanaWhiteIpsRequestWhiteIpGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateKibanaWhiteIpsRequestWhiteIpGroup setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

        public UpdateKibanaWhiteIpsRequestWhiteIpGroup setWhiteIpType(String whiteIpType) {
            this.whiteIpType = whiteIpType;
            return this;
        }
        public String getWhiteIpType() {
            return this.whiteIpType;
        }

    }

}

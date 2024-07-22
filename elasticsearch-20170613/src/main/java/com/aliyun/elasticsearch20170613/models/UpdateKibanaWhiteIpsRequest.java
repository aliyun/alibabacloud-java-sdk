// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateKibanaWhiteIpsRequest extends TeaModel {
    /**
     * <p>The IP address whitelists. This parameter is available if the whiteIpGroup parameter is left empty. The default IP address whitelist is updated based on the value of this parameter.</p>
     * <p>You cannot configure both the kibanaIPWhitelist and whiteIpGroup parameters.</p>
     */
    @NameInMap("kibanaIPWhitelist")
    public java.util.List<String> kibanaIPWhitelist;

    /**
     * <p>The name of the whitelist. This parameter is required if you configure the whiteIpGroup parameter.</p>
     */
    @NameInMap("whiteIpGroup")
    public UpdateKibanaWhiteIpsRequestWhiteIpGroup whiteIpGroup;

    /**
     * <p>The update mode. Valid values:</p>
     * <ul>
     * <li>Cover: overwrites the IP addresses in the specified IP address whitelist with the IP addresses specified by using the ips parameter. This is the default value.</li>
     * <li>Append: adds the IP addresses specified by using the ips parameter to the specified IP address whitelist.</li>
     * <li>Delete: deletes the IP addresses specified by using the ips parameter from the specified IP address whitelist. At least one IP address must be retained for the whitelist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The body of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
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
        /**
         * <p>The type of the whitelist. Set the value to PUBLIC_KIBANA. This value indicates a public IP address whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>test_group_name</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <p>The IP addresses in the whitelist. This parameter is required if you configure the whiteIpGroup parameter.</p>
         */
        @NameInMap("ips")
        public java.util.List<String> ips;

        /**
         * <p>The IP addresses in the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC_KIBANA</p>
         */
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

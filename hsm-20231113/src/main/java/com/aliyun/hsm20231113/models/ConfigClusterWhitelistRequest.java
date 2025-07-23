// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ConfigClusterWhitelistRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-729dm40FG****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The IP address whitelist of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>18.68.XX.XX</p>
     */
    @NameInMap("Whitelist")
    public String whitelist;

    public static ConfigClusterWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigClusterWhitelistRequest self = new ConfigClusterWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public ConfigClusterWhitelistRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ConfigClusterWhitelistRequest setWhitelist(String whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public String getWhitelist() {
        return this.whitelist;
    }

}

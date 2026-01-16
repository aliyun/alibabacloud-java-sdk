// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UpgradeClusterAddonsShrinkRequest extends TeaModel {
    @NameInMap("Addons")
    public String addonsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eck-xxxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static UpgradeClusterAddonsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeClusterAddonsShrinkRequest self = new UpgradeClusterAddonsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeClusterAddonsShrinkRequest setAddonsShrink(String addonsShrink) {
        this.addonsShrink = addonsShrink;
        return this;
    }
    public String getAddonsShrink() {
        return this.addonsShrink;
    }

    public UpgradeClusterAddonsShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

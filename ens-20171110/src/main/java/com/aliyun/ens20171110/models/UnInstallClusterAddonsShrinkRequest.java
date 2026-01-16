// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnInstallClusterAddonsShrinkRequest extends TeaModel {
    @NameInMap("Addons")
    public String addonsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eck-xxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static UnInstallClusterAddonsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UnInstallClusterAddonsShrinkRequest self = new UnInstallClusterAddonsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UnInstallClusterAddonsShrinkRequest setAddonsShrink(String addonsShrink) {
        this.addonsShrink = addonsShrink;
        return this;
    }
    public String getAddonsShrink() {
        return this.addonsShrink;
    }

    public UnInstallClusterAddonsShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class InstallClusterAddonsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
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

    public static InstallClusterAddonsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallClusterAddonsShrinkRequest self = new InstallClusterAddonsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InstallClusterAddonsShrinkRequest setAddonsShrink(String addonsShrink) {
        this.addonsShrink = addonsShrink;
        return this;
    }
    public String getAddonsShrink() {
        return this.addonsShrink;
    }

    public InstallClusterAddonsShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

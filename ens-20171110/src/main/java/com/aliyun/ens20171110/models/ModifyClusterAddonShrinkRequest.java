// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyClusterAddonShrinkRequest extends TeaModel {
    @NameInMap("Addon")
    public String addonShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eck-xxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>edge-csi-lite</p>
     */
    @NameInMap("ComponentName")
    public String componentName;

    public static ModifyClusterAddonShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterAddonShrinkRequest self = new ModifyClusterAddonShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterAddonShrinkRequest setAddonShrink(String addonShrink) {
        this.addonShrink = addonShrink;
        return this;
    }
    public String getAddonShrink() {
        return this.addonShrink;
    }

    public ModifyClusterAddonShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyClusterAddonShrinkRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

}

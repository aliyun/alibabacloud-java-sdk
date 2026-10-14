// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeAddonRequest extends TeaModel {
    /**
     * <p>The name of the add-on.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>edge-csi-lite</p>
     */
    @NameInMap("AddonName")
    public String addonName;

    /**
     * <p>The version of the add-on. If you do not specify a version, all available versions are returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("AddonVersion")
    public String addonVersion;

    public static DescribeAddonRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddonRequest self = new DescribeAddonRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAddonRequest setAddonName(String addonName) {
        this.addonName = addonName;
        return this;
    }
    public String getAddonName() {
        return this.addonName;
    }

    public DescribeAddonRequest setAddonVersion(String addonVersion) {
        this.addonVersion = addonVersion;
        return this;
    }
    public String getAddonVersion() {
        return this.addonVersion;
    }

}

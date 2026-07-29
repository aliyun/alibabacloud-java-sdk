// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateAutoUpgradeRequest extends TeaModel {
    /**
     * <p>The upgrade type. Valid values: <code>auto</code> and <code>manual</code>. A value of auto specifies to enable automatic minor version upgrades. A value of manual specifies to disable automatic minor version upgrades.</p>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("autoUpgrade")
    public String autoUpgrade;

    public static UpdateAutoUpgradeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoUpgradeRequest self = new UpdateAutoUpgradeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAutoUpgradeRequest setAutoUpgrade(String autoUpgrade) {
        this.autoUpgrade = autoUpgrade;
        return this;
    }
    public String getAutoUpgrade() {
        return this.autoUpgrade;
    }

}

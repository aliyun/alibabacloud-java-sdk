// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateAutoUpgradeRequest extends TeaModel {
    /**
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

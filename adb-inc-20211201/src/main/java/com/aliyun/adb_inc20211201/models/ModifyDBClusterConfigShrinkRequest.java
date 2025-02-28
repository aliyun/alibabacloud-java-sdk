// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class ModifyDBClusterConfigShrinkRequest extends TeaModel {
    @NameInMap("Configs")
    public String configsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static ModifyDBClusterConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterConfigShrinkRequest self = new ModifyDBClusterConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterConfigShrinkRequest setConfigsShrink(String configsShrink) {
        this.configsShrink = configsShrink;
        return this;
    }
    public String getConfigsShrink() {
        return this.configsShrink;
    }

    public ModifyDBClusterConfigShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}

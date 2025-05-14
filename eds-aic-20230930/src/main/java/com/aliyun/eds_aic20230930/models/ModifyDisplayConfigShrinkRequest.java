// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyDisplayConfigShrinkRequest extends TeaModel {
    @NameInMap("AndroidInstanceIds")
    public java.util.List<String> androidInstanceIds;

    @NameInMap("DisplayConfig")
    public String displayConfigShrink;

    public static ModifyDisplayConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDisplayConfigShrinkRequest self = new ModifyDisplayConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDisplayConfigShrinkRequest setAndroidInstanceIds(java.util.List<String> androidInstanceIds) {
        this.androidInstanceIds = androidInstanceIds;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    public ModifyDisplayConfigShrinkRequest setDisplayConfigShrink(String displayConfigShrink) {
        this.displayConfigShrink = displayConfigShrink;
        return this;
    }
    public String getDisplayConfigShrink() {
        return this.displayConfigShrink;
    }

}

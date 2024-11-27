// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class MountInstanceSDGShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sdg-xxxx</p>
     */
    @NameInMap("SDGId")
    public String SDGId;

    public static MountInstanceSDGShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        MountInstanceSDGShrinkRequest self = new MountInstanceSDGShrinkRequest();
        return TeaModel.build(map, self);
    }

    public MountInstanceSDGShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public MountInstanceSDGShrinkRequest setSDGId(String SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public String getSDGId() {
        return this.SDGId;
    }

}

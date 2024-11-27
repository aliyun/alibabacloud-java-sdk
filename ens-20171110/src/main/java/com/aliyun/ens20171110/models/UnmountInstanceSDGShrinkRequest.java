// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnmountInstanceSDGShrinkRequest extends TeaModel {
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

    public static UnmountInstanceSDGShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UnmountInstanceSDGShrinkRequest self = new UnmountInstanceSDGShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UnmountInstanceSDGShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public UnmountInstanceSDGShrinkRequest setSDGId(String SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public String getSDGId() {
        return this.SDGId;
    }

}

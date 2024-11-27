// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DetachInstanceSDGShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sdg-xxxxx</p>
     */
    @NameInMap("SDGId")
    public String SDGId;

    public static DetachInstanceSDGShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachInstanceSDGShrinkRequest self = new DetachInstanceSDGShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DetachInstanceSDGShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public DetachInstanceSDGShrinkRequest setSDGId(String SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public String getSDGId() {
        return this.SDGId;
    }

}

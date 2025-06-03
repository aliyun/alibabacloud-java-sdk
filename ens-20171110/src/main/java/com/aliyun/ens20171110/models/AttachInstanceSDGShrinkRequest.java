// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AttachInstanceSDGShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of the instances.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    @NameInMap("LoadOpt")
    public String loadOptShrink;

    /**
     * <p>The ID of the SDG.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sdg-xxxx</p>
     */
    @NameInMap("SDGId")
    public String SDGId;

    public static AttachInstanceSDGShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachInstanceSDGShrinkRequest self = new AttachInstanceSDGShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AttachInstanceSDGShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public AttachInstanceSDGShrinkRequest setLoadOptShrink(String loadOptShrink) {
        this.loadOptShrink = loadOptShrink;
        return this;
    }
    public String getLoadOptShrink() {
        return this.loadOptShrink;
    }

    public AttachInstanceSDGShrinkRequest setSDGId(String SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public String getSDGId() {
        return this.SDGId;
    }

}

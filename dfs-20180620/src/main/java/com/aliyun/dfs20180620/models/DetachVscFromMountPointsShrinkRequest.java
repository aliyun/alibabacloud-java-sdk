// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DetachVscFromMountPointsShrinkRequest extends TeaModel {
    @NameInMap("DetachInfos")
    public String detachInfosShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

    @NameInMap("UseAssumeRoleChkServerPerm")
    public Boolean useAssumeRoleChkServerPerm;

    public static DetachVscFromMountPointsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachVscFromMountPointsShrinkRequest self = new DetachVscFromMountPointsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DetachVscFromMountPointsShrinkRequest setDetachInfosShrink(String detachInfosShrink) {
        this.detachInfosShrink = detachInfosShrink;
        return this;
    }
    public String getDetachInfosShrink() {
        return this.detachInfosShrink;
    }

    public DetachVscFromMountPointsShrinkRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public DetachVscFromMountPointsShrinkRequest setUseAssumeRoleChkServerPerm(Boolean useAssumeRoleChkServerPerm) {
        this.useAssumeRoleChkServerPerm = useAssumeRoleChkServerPerm;
        return this;
    }
    public Boolean getUseAssumeRoleChkServerPerm() {
        return this.useAssumeRoleChkServerPerm;
    }

}

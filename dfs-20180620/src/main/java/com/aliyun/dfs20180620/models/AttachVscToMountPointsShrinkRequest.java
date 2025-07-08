// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class AttachVscToMountPointsShrinkRequest extends TeaModel {
    @NameInMap("AttachInfos")
    public String attachInfosShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseAssumeRoleChkServerPerm")
    public Boolean useAssumeRoleChkServerPerm;

    public static AttachVscToMountPointsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachVscToMountPointsShrinkRequest self = new AttachVscToMountPointsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AttachVscToMountPointsShrinkRequest setAttachInfosShrink(String attachInfosShrink) {
        this.attachInfosShrink = attachInfosShrink;
        return this;
    }
    public String getAttachInfosShrink() {
        return this.attachInfosShrink;
    }

    public AttachVscToMountPointsShrinkRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public AttachVscToMountPointsShrinkRequest setUseAssumeRoleChkServerPerm(Boolean useAssumeRoleChkServerPerm) {
        this.useAssumeRoleChkServerPerm = useAssumeRoleChkServerPerm;
        return this;
    }
    public Boolean getUseAssumeRoleChkServerPerm() {
        return this.useAssumeRoleChkServerPerm;
    }

}

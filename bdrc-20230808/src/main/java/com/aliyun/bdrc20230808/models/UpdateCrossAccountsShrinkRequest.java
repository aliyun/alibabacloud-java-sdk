// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class UpdateCrossAccountsShrinkRequest extends TeaModel {
    @NameInMap("CreateTargets")
    public String createTargetsShrink;

    @NameInMap("DeleteTargets")
    public String deleteTargetsShrink;

    public static UpdateCrossAccountsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCrossAccountsShrinkRequest self = new UpdateCrossAccountsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCrossAccountsShrinkRequest setCreateTargetsShrink(String createTargetsShrink) {
        this.createTargetsShrink = createTargetsShrink;
        return this;
    }
    public String getCreateTargetsShrink() {
        return this.createTargetsShrink;
    }

    public UpdateCrossAccountsShrinkRequest setDeleteTargetsShrink(String deleteTargetsShrink) {
        this.deleteTargetsShrink = deleteTargetsShrink;
        return this;
    }
    public String getDeleteTargetsShrink() {
        return this.deleteTargetsShrink;
    }

}

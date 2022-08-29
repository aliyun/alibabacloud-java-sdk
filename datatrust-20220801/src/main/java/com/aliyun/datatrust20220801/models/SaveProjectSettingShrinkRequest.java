// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class SaveProjectSettingShrinkRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("Switchs")
    public String switchsShrink;

    public static SaveProjectSettingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveProjectSettingShrinkRequest self = new SaveProjectSettingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SaveProjectSettingShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public SaveProjectSettingShrinkRequest setSwitchsShrink(String switchsShrink) {
        this.switchsShrink = switchsShrink;
        return this;
    }
    public String getSwitchsShrink() {
        return this.switchsShrink;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListAvatarProjectShrinkRequest extends TeaModel {
    @NameInMap("projectIdList")
    public String projectIdListShrink;

    public static ListAvatarProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvatarProjectShrinkRequest self = new ListAvatarProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAvatarProjectShrinkRequest setProjectIdListShrink(String projectIdListShrink) {
        this.projectIdListShrink = projectIdListShrink;
        return this;
    }
    public String getProjectIdListShrink() {
        return this.projectIdListShrink;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApplicationsForPrivateAccessTagShrinkRequest extends TeaModel {
    @NameInMap("TagIds")
    public String tagIdsShrink;

    public static ListApplicationsForPrivateAccessTagShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForPrivateAccessTagShrinkRequest self = new ListApplicationsForPrivateAccessTagShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForPrivateAccessTagShrinkRequest setTagIdsShrink(String tagIdsShrink) {
        this.tagIdsShrink = tagIdsShrink;
        return this;
    }
    public String getTagIdsShrink() {
        return this.tagIdsShrink;
    }

}

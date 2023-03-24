// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPolicesForUserGroupShrinkRequest extends TeaModel {
    @NameInMap("UserGroupIds")
    public String userGroupIdsShrink;

    public static ListPolicesForUserGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPolicesForUserGroupShrinkRequest self = new ListPolicesForUserGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPolicesForUserGroupShrinkRequest setUserGroupIdsShrink(String userGroupIdsShrink) {
        this.userGroupIdsShrink = userGroupIdsShrink;
        return this;
    }
    public String getUserGroupIdsShrink() {
        return this.userGroupIdsShrink;
    }

}

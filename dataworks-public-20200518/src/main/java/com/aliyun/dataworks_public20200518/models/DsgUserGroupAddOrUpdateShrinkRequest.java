// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgUserGroupAddOrUpdateShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserGroups")
    public String userGroupsShrink;

    public static DsgUserGroupAddOrUpdateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgUserGroupAddOrUpdateShrinkRequest self = new DsgUserGroupAddOrUpdateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DsgUserGroupAddOrUpdateShrinkRequest setUserGroupsShrink(String userGroupsShrink) {
        this.userGroupsShrink = userGroupsShrink;
        return this;
    }
    public String getUserGroupsShrink() {
        return this.userGroupsShrink;
    }

}

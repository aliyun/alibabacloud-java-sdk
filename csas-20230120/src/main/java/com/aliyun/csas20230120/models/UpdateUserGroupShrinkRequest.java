// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateUserGroupShrinkRequest extends TeaModel {
    @NameInMap("Attributes")
    public String attributesShrink;

    @NameInMap("Description")
    public String description;

    @NameInMap("ModifyType")
    public String modifyType;

    @NameInMap("UserGroupId")
    public String userGroupId;

    public static UpdateUserGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserGroupShrinkRequest self = new UpdateUserGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserGroupShrinkRequest setAttributesShrink(String attributesShrink) {
        this.attributesShrink = attributesShrink;
        return this;
    }
    public String getAttributesShrink() {
        return this.attributesShrink;
    }

    public UpdateUserGroupShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateUserGroupShrinkRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public UpdateUserGroupShrinkRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}

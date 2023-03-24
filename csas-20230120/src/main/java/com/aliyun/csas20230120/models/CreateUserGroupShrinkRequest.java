// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateUserGroupShrinkRequest extends TeaModel {
    @NameInMap("Attributes")
    public String attributesShrink;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    public static CreateUserGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserGroupShrinkRequest self = new CreateUserGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserGroupShrinkRequest setAttributesShrink(String attributesShrink) {
        this.attributesShrink = attributesShrink;
        return this;
    }
    public String getAttributesShrink() {
        return this.attributesShrink;
    }

    public CreateUserGroupShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUserGroupShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

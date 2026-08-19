// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePrivateAccessTagRequest extends TeaModel {
    /**
     * <p>The description of the internal-facing access tag. The description must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), hyphens (-), and spaces. Chinese characters are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>This is an internal-facing access tag</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the internal-facing access tag. The name must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). Chinese characters are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tag_name</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreatePrivateAccessTagRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivateAccessTagRequest self = new CreatePrivateAccessTagRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrivateAccessTagRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePrivateAccessTagRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

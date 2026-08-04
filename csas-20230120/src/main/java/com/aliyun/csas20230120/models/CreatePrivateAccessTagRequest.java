// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePrivateAccessTagRequest extends TeaModel {
    /**
     * <p>Private access tag description. It can be 1 to 128 characters long. It supports Chinese characters, uppercase and lowercase English letters, numbers, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一条内网访问标签</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Private access tag name. It can be 1 to 128 characters long. It supports Chinese characters, uppercase and lowercase English letters, numbers, periods (.), underscores (_), and hyphens (-).</p>
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

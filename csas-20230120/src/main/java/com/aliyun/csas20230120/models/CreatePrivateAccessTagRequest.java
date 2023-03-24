// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePrivateAccessTagRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateAlgorithmRequest extends TeaModel {
    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Description")
    public String description;

    public static CreateAlgorithmRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlgorithmRequest self = new CreateAlgorithmRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlgorithmRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAlgorithmRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateSaseUserTagRequest extends TeaModel {
    /**
     * <p>The description of the employee tag.</p>
     * 
     * <strong>example:</strong>
     * <p>These are the company\&quot;s employees</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the user tag.</p>
     * 
     * <strong>example:</strong>
     * <p>boss</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateSaseUserTagRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSaseUserTagRequest self = new CreateSaseUserTagRequest();
        return TeaModel.build(map, self);
    }

    public CreateSaseUserTagRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSaseUserTagRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

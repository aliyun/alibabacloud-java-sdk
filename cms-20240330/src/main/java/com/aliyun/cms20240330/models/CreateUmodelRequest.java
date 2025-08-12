// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateUmodelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>workspace test</p>
     */
    @NameInMap("description")
    public String description;

    public static CreateUmodelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUmodelRequest self = new CreateUmodelRequest();
        return TeaModel.build(map, self);
    }

    public CreateUmodelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}

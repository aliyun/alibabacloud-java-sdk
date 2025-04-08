// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineRequest extends TeaModel {
    /**
     * <p>The routine description.</p>
     * 
     * <strong>example:</strong>
     * <p>the description of this routine</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The routine name, which must be unique in the same account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-routine1</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateRoutineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineRequest self = new CreateRoutineRequest();
        return TeaModel.build(map, self);
    }

    public CreateRoutineRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRoutineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

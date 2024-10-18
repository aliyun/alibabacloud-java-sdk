// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>the description of this routine</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>test-routine1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>5ms</p>
     */
    @NameInMap("SpecName")
    public String specName;

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

    public CreateRoutineRequest setSpecName(String specName) {
        this.specName = specName;
        return this;
    }
    public String getSpecName() {
        return this.specName;
    }

}

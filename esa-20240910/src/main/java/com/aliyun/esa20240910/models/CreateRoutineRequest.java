// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineRequest extends TeaModel {
    /**
     * <p>The description of the Edge Routine.</p>
     * 
     * <strong>example:</strong>
     * <p>the description of this routine</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the Edge Routine contains asset files.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HasAssets")
    public Boolean hasAssets;

    /**
     * <p>The name of the Edge Routine. The name must be unique within the same account.</p>
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

    public CreateRoutineRequest setHasAssets(Boolean hasAssets) {
        this.hasAssets = hasAssets;
        return this;
    }
    public Boolean getHasAssets() {
        return this.hasAssets;
    }

    public CreateRoutineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class EditRoutineConfShrinkRequest extends TeaModel {
    /**
     * <p>The description of the routine.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The configurations of the specified environment.</p>
     */
    @NameInMap("EnvConf")
    public String envConfShrink;

    /**
     * <p>The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.</p>
     */
    @NameInMap("Name")
    public String name;

    public static EditRoutineConfShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EditRoutineConfShrinkRequest self = new EditRoutineConfShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EditRoutineConfShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public EditRoutineConfShrinkRequest setEnvConfShrink(String envConfShrink) {
        this.envConfShrink = envConfShrink;
        return this;
    }
    public String getEnvConfShrink() {
        return this.envConfShrink;
    }

    public EditRoutineConfShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class EditRoutineConfShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("EnvConf")
    public String envConfShrink;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

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

    public EditRoutineConfShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}

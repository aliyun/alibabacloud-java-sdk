// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateRoutineShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("EnvConf")
    public String envConfShrink;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static CreateRoutineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineShrinkRequest self = new CreateRoutineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateRoutineShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRoutineShrinkRequest setEnvConfShrink(String envConfShrink) {
        this.envConfShrink = envConfShrink;
        return this;
    }
    public String getEnvConfShrink() {
        return this.envConfShrink;
    }

    public CreateRoutineShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRoutineShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteRoutineConfEnvsShrinkRequest extends TeaModel {
    @NameInMap("Envs")
    public String envsShrink;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DeleteRoutineConfEnvsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineConfEnvsShrinkRequest self = new DeleteRoutineConfEnvsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineConfEnvsShrinkRequest setEnvsShrink(String envsShrink) {
        this.envsShrink = envsShrink;
        return this;
    }
    public String getEnvsShrink() {
        return this.envsShrink;
    }

    public DeleteRoutineConfEnvsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteRoutineConfEnvsShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}

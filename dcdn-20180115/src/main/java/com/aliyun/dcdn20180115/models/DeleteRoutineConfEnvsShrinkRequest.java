// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteRoutineConfEnvsShrinkRequest extends TeaModel {
    /**
     * <p>The custom canary release environments that you want to delete.</p>
     */
    @NameInMap("Envs")
    public String envsShrink;

    /**
     * <p>The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.</p>
     */
    @NameInMap("Name")
    public String name;

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

}

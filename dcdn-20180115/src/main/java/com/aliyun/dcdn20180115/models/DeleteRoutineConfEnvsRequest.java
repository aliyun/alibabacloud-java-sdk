// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteRoutineConfEnvsRequest extends TeaModel {
    /**
     * <p>The custom canary release environments that you want to delete.</p>
     */
    @NameInMap("Envs")
    public java.util.Map<String, ?> envs;

    /**
     * <p>The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.</p>
     */
    @NameInMap("Name")
    public String name;

    public static DeleteRoutineConfEnvsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineConfEnvsRequest self = new DeleteRoutineConfEnvsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineConfEnvsRequest setEnvs(java.util.Map<String, ?> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.Map<String, ?> getEnvs() {
        return this.envs;
    }

    public DeleteRoutineConfEnvsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

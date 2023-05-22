// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteRoutineConfEnvsRequest extends TeaModel {
    /**
     * <p>The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.</p>
     */
    @NameInMap("Envs")
    public java.util.Map<String, ?> envs;

    /**
     * <p>> </p>
     * <p>*   This operation deletes only custom preset canary release environments. You cannot delete production or staging environments.</p>
     * <p>*   You can call this operation up to 100 times per second per account.</p>
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

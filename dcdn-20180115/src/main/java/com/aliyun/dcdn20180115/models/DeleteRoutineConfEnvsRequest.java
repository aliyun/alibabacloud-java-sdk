// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteRoutineConfEnvsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Envs")
    public java.util.Map<String, ?> envs;

    public static DeleteRoutineConfEnvsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineConfEnvsRequest self = new DeleteRoutineConfEnvsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineConfEnvsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteRoutineConfEnvsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteRoutineConfEnvsRequest setEnvs(java.util.Map<String, ?> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.Map<String, ?> getEnvs() {
        return this.envs;
    }

}

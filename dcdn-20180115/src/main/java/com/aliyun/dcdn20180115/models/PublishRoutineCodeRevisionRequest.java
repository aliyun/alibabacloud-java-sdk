// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class PublishRoutineCodeRevisionRequest extends TeaModel {
    @NameInMap("Envs")
    public java.util.Map<String, ?> envs;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SelectCodeRevision")
    public String selectCodeRevision;

    public static PublishRoutineCodeRevisionRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishRoutineCodeRevisionRequest self = new PublishRoutineCodeRevisionRequest();
        return TeaModel.build(map, self);
    }

    public PublishRoutineCodeRevisionRequest setEnvs(java.util.Map<String, ?> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.Map<String, ?> getEnvs() {
        return this.envs;
    }

    public PublishRoutineCodeRevisionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PublishRoutineCodeRevisionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PublishRoutineCodeRevisionRequest setSelectCodeRevision(String selectCodeRevision) {
        this.selectCodeRevision = selectCodeRevision;
        return this;
    }
    public String getSelectCodeRevision() {
        return this.selectCodeRevision;
    }

}

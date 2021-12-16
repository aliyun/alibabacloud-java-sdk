// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class PublishRoutineCodeRevisionShrinkRequest extends TeaModel {
    @NameInMap("Envs")
    public String envsShrink;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SelectCodeRevision")
    public String selectCodeRevision;

    public static PublishRoutineCodeRevisionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishRoutineCodeRevisionShrinkRequest self = new PublishRoutineCodeRevisionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PublishRoutineCodeRevisionShrinkRequest setEnvsShrink(String envsShrink) {
        this.envsShrink = envsShrink;
        return this;
    }
    public String getEnvsShrink() {
        return this.envsShrink;
    }

    public PublishRoutineCodeRevisionShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PublishRoutineCodeRevisionShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PublishRoutineCodeRevisionShrinkRequest setSelectCodeRevision(String selectCodeRevision) {
        this.selectCodeRevision = selectCodeRevision;
        return this;
    }
    public String getSelectCodeRevision() {
        return this.selectCodeRevision;
    }

}

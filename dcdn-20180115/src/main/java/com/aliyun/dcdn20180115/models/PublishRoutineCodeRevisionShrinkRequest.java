// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class PublishRoutineCodeRevisionShrinkRequest extends TeaModel {
    /**
     * <p>The environment to which you want to publish the code.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   production: the name of the environment, including the environment name (SpecName) and the domain name whitelist (AllowedHosts).</p>
     * <br>
     * <p>*   Preset_Canary_xx: You can add canary release environments based on your business requirements. This parameter is optional.</p>
     */
    @NameInMap("Envs")
    public String envsShrink;

    /**
     * <p>The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The version of the routine code that you want to publish.</p>
     */
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

    public PublishRoutineCodeRevisionShrinkRequest setSelectCodeRevision(String selectCodeRevision) {
        this.selectCodeRevision = selectCodeRevision;
        return this;
    }
    public String getSelectCodeRevision() {
        return this.selectCodeRevision;
    }

}

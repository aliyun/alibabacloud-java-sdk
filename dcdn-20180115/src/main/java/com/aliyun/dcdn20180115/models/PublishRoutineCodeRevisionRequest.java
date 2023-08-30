// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class PublishRoutineCodeRevisionRequest extends TeaModel {
    /**
     * <p>The environment to which you want to publish the code.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   production: the name of the environment, including the environment name (SpecName) and the domain name whitelist (AllowedHosts).</p>
     * <br>
     * <p>*   presetCanary: You can add canary release environments based on your business requirements. This parameter is optional.</p>
     */
    @NameInMap("Envs")
    public java.util.Map<String, ?> envs;

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

    public PublishRoutineCodeRevisionRequest setSelectCodeRevision(String selectCodeRevision) {
        this.selectCodeRevision = selectCodeRevision;
        return this;
    }
    public String getSelectCodeRevision() {
        return this.selectCodeRevision;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PublishRoutineCodeVersionShrinkRequest extends TeaModel {
    @NameInMap("CanaryAreaList")
    public String canaryAreaListShrink;

    @NameInMap("CanaryCodeVersion")
    public String canaryCodeVersion;

    @NameInMap("CodeVersion")
    public String codeVersion;

    @NameInMap("Env")
    public String env;

    /**
     * <strong>example:</strong>
     * <p>PublishRoutineCodeVersion</p>
     */
    @NameInMap("Name")
    public String name;

    public static PublishRoutineCodeVersionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishRoutineCodeVersionShrinkRequest self = new PublishRoutineCodeVersionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PublishRoutineCodeVersionShrinkRequest setCanaryAreaListShrink(String canaryAreaListShrink) {
        this.canaryAreaListShrink = canaryAreaListShrink;
        return this;
    }
    public String getCanaryAreaListShrink() {
        return this.canaryAreaListShrink;
    }

    public PublishRoutineCodeVersionShrinkRequest setCanaryCodeVersion(String canaryCodeVersion) {
        this.canaryCodeVersion = canaryCodeVersion;
        return this;
    }
    public String getCanaryCodeVersion() {
        return this.canaryCodeVersion;
    }

    public PublishRoutineCodeVersionShrinkRequest setCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }
    public String getCodeVersion() {
        return this.codeVersion;
    }

    public PublishRoutineCodeVersionShrinkRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public PublishRoutineCodeVersionShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

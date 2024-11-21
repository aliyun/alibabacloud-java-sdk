// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PublishRoutineCodeVersionRequest extends TeaModel {
    /**
     * <p>The regions for canary release.</p>
     */
    @NameInMap("CanaryAreaList")
    public java.util.List<String> canaryAreaList;

    /**
     * <p>The version number for canary release.</p>
     * 
     * <strong>example:</strong>
     * <p>1710120201067203242</p>
     */
    @NameInMap("CanaryCodeVersion")
    public String canaryCodeVersion;

    /**
     * <p>The code version to be released.</p>
     * 
     * <strong>example:</strong>
     * <p>1710120201067203242</p>
     */
    @NameInMap("CodeVersion")
    public String codeVersion;

    /**
     * <p>The environment name.</p>
     * 
     * <strong>example:</strong>
     * <p>production</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>The routine name.</p>
     * 
     * <strong>example:</strong>
     * <p>PublishRoutineCodeVersion</p>
     */
    @NameInMap("Name")
    public String name;

    public static PublishRoutineCodeVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishRoutineCodeVersionRequest self = new PublishRoutineCodeVersionRequest();
        return TeaModel.build(map, self);
    }

    public PublishRoutineCodeVersionRequest setCanaryAreaList(java.util.List<String> canaryAreaList) {
        this.canaryAreaList = canaryAreaList;
        return this;
    }
    public java.util.List<String> getCanaryAreaList() {
        return this.canaryAreaList;
    }

    public PublishRoutineCodeVersionRequest setCanaryCodeVersion(String canaryCodeVersion) {
        this.canaryCodeVersion = canaryCodeVersion;
        return this;
    }
    public String getCanaryCodeVersion() {
        return this.canaryCodeVersion;
    }

    public PublishRoutineCodeVersionRequest setCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }
    public String getCodeVersion() {
        return this.codeVersion;
    }

    public PublishRoutineCodeVersionRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public PublishRoutineCodeVersionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

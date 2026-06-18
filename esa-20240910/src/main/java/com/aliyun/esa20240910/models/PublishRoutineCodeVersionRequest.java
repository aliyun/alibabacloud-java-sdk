// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PublishRoutineCodeVersionRequest extends TeaModel {
    @NameInMap("CodeVersion")
    public String codeVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    public static PublishRoutineCodeVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishRoutineCodeVersionRequest self = new PublishRoutineCodeVersionRequest();
        return TeaModel.build(map, self);
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class Step extends TeaModel {
    /**
     * <p>The step parameters.</p>
     */
    @NameInMap("args")
    public java.util.List<String> args;

    /**
     * <p>The step type.</p>
     * 
     * <strong>example:</strong>
     * <p>USER, WORKDIR, ENV, RUN</p>
     */
    @NameInMap("type")
    public String type;

    public static Step build(java.util.Map<String, ?> map) throws Exception {
        Step self = new Step();
        return TeaModel.build(map, self);
    }

    public Step setArgs(java.util.List<String> args) {
        this.args = args;
        return this;
    }
    public java.util.List<String> getArgs() {
        return this.args;
    }

    public Step setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

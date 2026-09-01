// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateTemplateStep extends TeaModel {
    /**
     * <p>The list of step parameters.</p>
     */
    @NameInMap("args")
    public java.util.List<String> args;

    /**
     * <p>The step type.</p>
     * 
     * <strong>example:</strong>
     * <p>RUN</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateTemplateStep build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateStep self = new CreateTemplateStep();
        return TeaModel.build(map, self);
    }

    public CreateTemplateStep setArgs(java.util.List<String> args) {
        this.args = args;
        return this;
    }
    public java.util.List<String> getArgs() {
        return this.args;
    }

    public CreateTemplateStep setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

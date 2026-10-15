// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class PublicTemplateStep extends TeaModel {
    /**
     * <p>The build step parameter list.</p>
     */
    @NameInMap("args")
    public java.util.List<String> args;

    /**
     * <p>The build instruction type, such as RUN.</p>
     * 
     * <strong>example:</strong>
     * <p>RUN</p>
     */
    @NameInMap("type")
    public String type;

    public static PublicTemplateStep build(java.util.Map<String, ?> map) throws Exception {
        PublicTemplateStep self = new PublicTemplateStep();
        return TeaModel.build(map, self);
    }

    public PublicTemplateStep setArgs(java.util.List<String> args) {
        this.args = args;
        return this;
    }
    public java.util.List<String> getArgs() {
        return this.args;
    }

    public PublicTemplateStep setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class TransformInput extends TeaModel {
    @NameInMap("input")
    public Object input;

    @NameInMap("type")
    public String type;

    public static TransformInput build(java.util.Map<String, ?> map) throws Exception {
        TransformInput self = new TransformInput();
        return TeaModel.build(map, self);
    }

    public TransformInput setInput(Object input) {
        this.input = input;
        return this;
    }
    public Object getInput() {
        return this.input;
    }

    public TransformInput setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

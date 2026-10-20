// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class TransformInput extends TeaModel {
    /**
     * <p>The input content.</p>
     * 
     * <strong>example:</strong>
     * <p>INPUT</p>
     */
    @NameInMap("input")
    public Object input;

    /**
     * <p>The input type.</p>
     * 
     * <strong>example:</strong>
     * <p>LITERAL</p>
     */
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

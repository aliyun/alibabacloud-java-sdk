// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AiTransformField extends TeaModel {
    /**
     * <p>The value form. Currently uses JSONPATH.</p>
     * 
     * <strong>example:</strong>
     * <p>JSONPATH</p>
     */
    @NameInMap("Form")
    public String form;

    /**
     * <p>The JSONPath expression.</p>
     * 
     * <strong>example:</strong>
     * <p>$.data.message</p>
     */
    @NameInMap("Value")
    public String value;

    public static AiTransformField build(java.util.Map<String, ?> map) throws Exception {
        AiTransformField self = new AiTransformField();
        return TeaModel.build(map, self);
    }

    public AiTransformField setForm(String form) {
        this.form = form;
        return this;
    }
    public String getForm() {
        return this.form;
    }

    public AiTransformField setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}

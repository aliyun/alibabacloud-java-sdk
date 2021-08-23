// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class RuleMtopDTO extends TeaModel {
    // Strict
    @NameInMap("Strict")
    public Boolean strict;

    // Text
    @NameInMap("Text")
    public String text;

    // Warning
    @NameInMap("Warning")
    public java.util.List<String> warning;

    // Error
    @NameInMap("Error")
    public java.util.List<String> error;

    public static RuleMtopDTO build(java.util.Map<String, ?> map) throws Exception {
        RuleMtopDTO self = new RuleMtopDTO();
        return TeaModel.build(map, self);
    }

    public RuleMtopDTO setStrict(Boolean strict) {
        this.strict = strict;
        return this;
    }
    public Boolean getStrict() {
        return this.strict;
    }

    public RuleMtopDTO setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public RuleMtopDTO setWarning(java.util.List<String> warning) {
        this.warning = warning;
        return this;
    }
    public java.util.List<String> getWarning() {
        return this.warning;
    }

    public RuleMtopDTO setError(java.util.List<String> error) {
        this.error = error;
        return this;
    }
    public java.util.List<String> getError() {
        return this.error;
    }

}

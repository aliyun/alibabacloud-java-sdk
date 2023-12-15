// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class RuleMtopDTO extends TeaModel {
    @NameInMap("Error")
    public java.util.List<String> error;

    @NameInMap("Strict")
    public Boolean strict;

    @NameInMap("Text")
    public String text;

    @NameInMap("Warning")
    public java.util.List<String> warning;

    public static RuleMtopDTO build(java.util.Map<String, ?> map) throws Exception {
        RuleMtopDTO self = new RuleMtopDTO();
        return TeaModel.build(map, self);
    }

    public RuleMtopDTO setError(java.util.List<String> error) {
        this.error = error;
        return this;
    }
    public java.util.List<String> getError() {
        return this.error;
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

}

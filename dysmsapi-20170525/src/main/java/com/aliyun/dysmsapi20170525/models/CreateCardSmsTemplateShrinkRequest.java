// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateCardSmsTemplateShrinkRequest extends TeaModel {
    @NameInMap("Memo")
    public String memo;

    @NameInMap("Template")
    public String templateShrink;

    @NameInMap("TemplateName")
    public String templateName;

    public static CreateCardSmsTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCardSmsTemplateShrinkRequest self = new CreateCardSmsTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCardSmsTemplateShrinkRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public CreateCardSmsTemplateShrinkRequest setTemplateShrink(String templateShrink) {
        this.templateShrink = templateShrink;
        return this;
    }
    public String getTemplateShrink() {
        return this.templateShrink;
    }

    public CreateCardSmsTemplateShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddMessageTemplateRequest extends TeaModel {
    @NameInMap("TemplateDetail")
    public String templateDetail;

    @NameInMap("TemplateName")
    public String templateName;

    public static AddMessageTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMessageTemplateRequest self = new AddMessageTemplateRequest();
        return TeaModel.build(map, self);
    }

    public AddMessageTemplateRequest setTemplateDetail(String templateDetail) {
        this.templateDetail = templateDetail;
        return this;
    }
    public String getTemplateDetail() {
        return this.templateDetail;
    }

    public AddMessageTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}

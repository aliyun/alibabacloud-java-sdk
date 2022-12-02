// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteFaceImageTemplateRequest extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteFaceImageTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceImageTemplateRequest self = new DeleteFaceImageTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaceImageTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}

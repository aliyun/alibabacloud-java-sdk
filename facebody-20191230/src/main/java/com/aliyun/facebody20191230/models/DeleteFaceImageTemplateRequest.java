// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteFaceImageTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6cd509ea-54fa-4730-8e9d-c94cadcda048</p>
     */
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

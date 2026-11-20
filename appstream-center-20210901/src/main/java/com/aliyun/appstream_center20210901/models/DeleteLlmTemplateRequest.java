// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeleteLlmTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the model to be deleted. You can call <a href="~~ListLlmTemplates~~">ListLlmTemplates</a> to obtain the ID. Use the LlmTemplateId of the specific model. Do not use the model group ID or provider template ID.</p>
     * <p>The model must exist and be manageable by the current account. If the model has been deleted or does not exist, LlmTemplate.NotFound is returned. For instructions on how to handle default models, see the operation description.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llmt-xxxx</p>
     */
    @NameInMap("LlmTemplateId")
    public String llmTemplateId;

    public static DeleteLlmTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLlmTemplateRequest self = new DeleteLlmTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLlmTemplateRequest setLlmTemplateId(String llmTemplateId) {
        this.llmTemplateId = llmTemplateId;
        return this;
    }
    public String getLlmTemplateId() {
        return this.llmTemplateId;
    }

}

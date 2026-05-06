// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeleteLlmTemplateRequest extends TeaModel {
    /**
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>The ID of the target knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abc</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    public static DeleteKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKnowledgeBaseRequest self = new DeleteKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKnowledgeBaseRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

}

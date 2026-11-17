// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteKnowledgeObjectRequest extends TeaModel {
    /**
     * <p>The ID of the knowledge base to which the object belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abc</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The stable ID of the object to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>obj-document-001</p>
     */
    @NameInMap("KnowledgeObjectId")
    public String knowledgeObjectId;

    public static DeleteKnowledgeObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKnowledgeObjectRequest self = new DeleteKnowledgeObjectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKnowledgeObjectRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public DeleteKnowledgeObjectRequest setKnowledgeObjectId(String knowledgeObjectId) {
        this.knowledgeObjectId = knowledgeObjectId;
        return this;
    }
    public String getKnowledgeObjectId() {
        return this.knowledgeObjectId;
    }

}

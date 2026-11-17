// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteKnowledgeSourceRequest extends TeaModel {
    /**
     * <p>The ID of the knowledge base to which the source belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abc</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The ID of the source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>src-001</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    public static DeleteKnowledgeSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKnowledgeSourceRequest self = new DeleteKnowledgeSourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKnowledgeSourceRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public DeleteKnowledgeSourceRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

}

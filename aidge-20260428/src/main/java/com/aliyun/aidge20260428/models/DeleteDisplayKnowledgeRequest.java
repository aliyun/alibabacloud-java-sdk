// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class DeleteDisplayKnowledgeRequest extends TeaModel {
    /**
     * <p>The knowledge base ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rag_x x x</p>
     */
    @NameInMap("RagId")
    public String ragId;

    /**
     * <p>The IDs of the records to delete. You can specify up to 500 record IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordIds")
    public java.util.List<Long> recordIds;

    public static DeleteDisplayKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDisplayKnowledgeRequest self = new DeleteDisplayKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDisplayKnowledgeRequest setRagId(String ragId) {
        this.ragId = ragId;
        return this;
    }
    public String getRagId() {
        return this.ragId;
    }

    public DeleteDisplayKnowledgeRequest setRecordIds(java.util.List<Long> recordIds) {
        this.recordIds = recordIds;
        return this;
    }
    public java.util.List<Long> getRecordIds() {
        return this.recordIds;
    }

}

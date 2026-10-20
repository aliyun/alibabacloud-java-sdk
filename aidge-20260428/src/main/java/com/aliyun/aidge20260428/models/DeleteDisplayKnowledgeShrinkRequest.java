// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class DeleteDisplayKnowledgeShrinkRequest extends TeaModel {
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
    public String recordIdsShrink;

    public static DeleteDisplayKnowledgeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDisplayKnowledgeShrinkRequest self = new DeleteDisplayKnowledgeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDisplayKnowledgeShrinkRequest setRagId(String ragId) {
        this.ragId = ragId;
        return this;
    }
    public String getRagId() {
        return this.ragId;
    }

    public DeleteDisplayKnowledgeShrinkRequest setRecordIdsShrink(String recordIdsShrink) {
        this.recordIdsShrink = recordIdsShrink;
        return this;
    }
    public String getRecordIdsShrink() {
        return this.recordIdsShrink;
    }

}

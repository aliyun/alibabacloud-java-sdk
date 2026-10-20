// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class UpdateDisplayKnowledgeShrinkRequest extends TeaModel {
    /**
     * <p>The knowledge base ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rag_xxx</p>
     */
    @NameInMap("RagId")
    public String ragId;

    /**
     * <p>The records to update. A maximum of 500 records can be specified.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Records")
    public String recordsShrink;

    public static UpdateDisplayKnowledgeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDisplayKnowledgeShrinkRequest self = new UpdateDisplayKnowledgeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDisplayKnowledgeShrinkRequest setRagId(String ragId) {
        this.ragId = ragId;
        return this;
    }
    public String getRagId() {
        return this.ragId;
    }

    public UpdateDisplayKnowledgeShrinkRequest setRecordsShrink(String recordsShrink) {
        this.recordsShrink = recordsShrink;
        return this;
    }
    public String getRecordsShrink() {
        return this.recordsShrink;
    }

}

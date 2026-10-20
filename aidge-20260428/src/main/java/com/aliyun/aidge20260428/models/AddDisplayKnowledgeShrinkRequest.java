// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class AddDisplayKnowledgeShrinkRequest extends TeaModel {
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
     * <p>The records to add. A maximum of 500 records are supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Records")
    public String recordsShrink;

    public static AddDisplayKnowledgeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDisplayKnowledgeShrinkRequest self = new AddDisplayKnowledgeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddDisplayKnowledgeShrinkRequest setRagId(String ragId) {
        this.ragId = ragId;
        return this;
    }
    public String getRagId() {
        return this.ragId;
    }

    public AddDisplayKnowledgeShrinkRequest setRecordsShrink(String recordsShrink) {
        this.recordsShrink = recordsShrink;
        return this;
    }
    public String getRecordsShrink() {
        return this.recordsShrink;
    }

}

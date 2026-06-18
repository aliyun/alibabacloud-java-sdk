// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DeleteIndexDocumentShrinkRequest extends TeaModel {
    /**
     * <p>The list of file IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DocumentIds")
    public String documentIdsShrink;

    /**
     * <p>The knowledge base ID, which is the <code>Data.Id</code> returned by the <strong>CreateIndex</strong> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0alxxxx</p>
     */
    @NameInMap("IndexId")
    public String indexId;

    public static DeleteIndexDocumentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIndexDocumentShrinkRequest self = new DeleteIndexDocumentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIndexDocumentShrinkRequest setDocumentIdsShrink(String documentIdsShrink) {
        this.documentIdsShrink = documentIdsShrink;
        return this;
    }
    public String getDocumentIdsShrink() {
        return this.documentIdsShrink;
    }

    public DeleteIndexDocumentShrinkRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

}

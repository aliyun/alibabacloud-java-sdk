// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DeleteIndexDocumentShrinkRequest extends TeaModel {
    /**
     * <p>The list of the primary key IDs of the documents.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DocumentIds")
    public String documentIdsShrink;

    /**
     * <p>The primary key ID of the knowledge base, which is the <code>Data.Id</code> parameter returned by the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-createindex">CreateIndex</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0aly8zw</p>
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

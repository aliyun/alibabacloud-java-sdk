// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DeleteIndexDocumentRequest extends TeaModel {
    /**
     * <p>The list of file IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DocumentIds")
    public java.util.List<String> documentIds;

    /**
     * <p>The knowledge base ID, which is the <code>Data.Id</code> returned by the <strong>CreateIndex</strong> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0alxxxx</p>
     */
    @NameInMap("IndexId")
    public String indexId;

    public static DeleteIndexDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIndexDocumentRequest self = new DeleteIndexDocumentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIndexDocumentRequest setDocumentIds(java.util.List<String> documentIds) {
        this.documentIds = documentIds;
        return this;
    }
    public java.util.List<String> getDocumentIds() {
        return this.documentIds;
    }

    public DeleteIndexDocumentRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

}

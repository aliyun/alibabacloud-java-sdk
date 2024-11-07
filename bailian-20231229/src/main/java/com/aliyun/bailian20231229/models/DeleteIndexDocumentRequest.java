// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DeleteIndexDocumentRequest extends TeaModel {
    /**
     * <p>The list of the primary key IDs of the documents.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DocumentIds")
    public java.util.List<String> documentIds;

    /**
     * <p>The primary key ID of the knowledge base, which is the <code>Data.Id</code> parameter returned by the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-createindex">CreateIndex</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0aly8zw</p>
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

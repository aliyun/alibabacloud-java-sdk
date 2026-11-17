// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetKnowledgeObjectRequest extends TeaModel {
    /**
     * <p>The ID of the knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abc</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The ID of the long-term business object.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>obj-001</p>
     */
    @NameInMap("KnowledgeObjectId")
    public String knowledgeObjectId;

    /**
     * <p>Applies only to semantic models. Specifies the version to read. If omitted, the operation returns the published version if available, or the latest version otherwise.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VersionNo")
    public Long versionNo;

    public static GetKnowledgeObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeObjectRequest self = new GetKnowledgeObjectRequest();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeObjectRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public GetKnowledgeObjectRequest setKnowledgeObjectId(String knowledgeObjectId) {
        this.knowledgeObjectId = knowledgeObjectId;
        return this;
    }
    public String getKnowledgeObjectId() {
        return this.knowledgeObjectId;
    }

    public GetKnowledgeObjectRequest setVersionNo(Long versionNo) {
        this.versionNo = versionNo;
        return this;
    }
    public Long getVersionNo() {
        return this.versionNo;
    }

}

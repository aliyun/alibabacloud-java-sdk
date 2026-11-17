// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RevokeKnowledgeBaseRetrievalRequest extends TeaModel {
    /**
     * <p>The knowledge base ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abc</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The DataWorks user ID of the target user. This is neither the RAM UID nor the caller identity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000000000</p>
     */
    @NameInMap("PrincipalId")
    public String principalId;

    /**
     * <p>The type of the principal that receives the share. This parameter is optional. If omitted, the default value is USER. Only USER is supported in the initial phase.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    public static RevokeKnowledgeBaseRetrievalRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeKnowledgeBaseRetrievalRequest self = new RevokeKnowledgeBaseRetrievalRequest();
        return TeaModel.build(map, self);
    }

    public RevokeKnowledgeBaseRetrievalRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public RevokeKnowledgeBaseRetrievalRequest setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
    public String getPrincipalId() {
        return this.principalId;
    }

    public RevokeKnowledgeBaseRetrievalRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

}

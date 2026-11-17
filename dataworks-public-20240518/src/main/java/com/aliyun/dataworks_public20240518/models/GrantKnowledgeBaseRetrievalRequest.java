// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GrantKnowledgeBaseRetrievalRequest extends TeaModel {
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
     * <p>The DataWorks user ID of the target user. This is not the RAM UID or the caller identity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000000000</p>
     */
    @NameInMap("PrincipalId")
    public String principalId;

    /**
     * <p>The type of the principal that receives the share. This parameter is optional and defaults to USER. Currently, only USER is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    public static GrantKnowledgeBaseRetrievalRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantKnowledgeBaseRetrievalRequest self = new GrantKnowledgeBaseRetrievalRequest();
        return TeaModel.build(map, self);
    }

    public GrantKnowledgeBaseRetrievalRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public GrantKnowledgeBaseRetrievalRequest setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
    public String getPrincipalId() {
        return this.principalId;
    }

    public GrantKnowledgeBaseRetrievalRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

}

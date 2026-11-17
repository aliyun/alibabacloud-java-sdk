// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RemoveKnowledgeBaseAdministratorRequest extends TeaModel {
    /**
     * <p>The DataWorks user ID of the administrator to be removed. This is not the identity of the caller.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000000000</p>
     */
    @NameInMap("AdministratorUserId")
    public String administratorUserId;

    /**
     * <p>The ID of the knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abc</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    public static RemoveKnowledgeBaseAdministratorRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveKnowledgeBaseAdministratorRequest self = new RemoveKnowledgeBaseAdministratorRequest();
        return TeaModel.build(map, self);
    }

    public RemoveKnowledgeBaseAdministratorRequest setAdministratorUserId(String administratorUserId) {
        this.administratorUserId = administratorUserId;
        return this;
    }
    public String getAdministratorUserId() {
        return this.administratorUserId;
    }

    public RemoveKnowledgeBaseAdministratorRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

}

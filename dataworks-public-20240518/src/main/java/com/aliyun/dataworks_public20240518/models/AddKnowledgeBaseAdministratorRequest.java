// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class AddKnowledgeBaseAdministratorRequest extends TeaModel {
    /**
     * <p>The DataWorks user ID of the administrator to be added. This is not the identity of the caller.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000000000</p>
     */
    @NameInMap("AdministratorUserId")
    public String administratorUserId;

    /**
     * <p>The knowledge base ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abc</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    public static AddKnowledgeBaseAdministratorRequest build(java.util.Map<String, ?> map) throws Exception {
        AddKnowledgeBaseAdministratorRequest self = new AddKnowledgeBaseAdministratorRequest();
        return TeaModel.build(map, self);
    }

    public AddKnowledgeBaseAdministratorRequest setAdministratorUserId(String administratorUserId) {
        this.administratorUserId = administratorUserId;
        return this;
    }
    public String getAdministratorUserId() {
        return this.administratorUserId;
    }

    public AddKnowledgeBaseAdministratorRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

}

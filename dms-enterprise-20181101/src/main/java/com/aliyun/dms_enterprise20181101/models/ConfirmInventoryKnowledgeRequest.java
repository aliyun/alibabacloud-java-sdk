// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ConfirmInventoryKnowledgeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2001</p>
     */
    @NameInMap("EntityId")
    public Long entityId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TABLE</p>
     */
    @NameInMap("KnowledgeType")
    public String knowledgeType;

    public static ConfirmInventoryKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmInventoryKnowledgeRequest self = new ConfirmInventoryKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmInventoryKnowledgeRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public ConfirmInventoryKnowledgeRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public ConfirmInventoryKnowledgeRequest setKnowledgeType(String knowledgeType) {
        this.knowledgeType = knowledgeType;
        return this;
    }
    public String getKnowledgeType() {
        return this.knowledgeType;
    }

}

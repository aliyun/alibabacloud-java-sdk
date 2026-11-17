// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseBuildTaskInstanceRequest extends TeaModel {
    /**
     * <p>The idempotency key for this creation request. We recommend providing it for automatic retries. Reuse the same value when retrying the same operation.</p>
     * 
     * <strong>example:</strong>
     * <p>run-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
     * <p>The source task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateKnowledgeBaseBuildTaskInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseBuildTaskInstanceRequest self = new CreateKnowledgeBaseBuildTaskInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseBuildTaskInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateKnowledgeBaseBuildTaskInstanceRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public CreateKnowledgeBaseBuildTaskInstanceRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}

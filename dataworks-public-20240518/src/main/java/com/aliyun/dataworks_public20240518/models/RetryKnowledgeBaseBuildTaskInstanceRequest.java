// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RetryKnowledgeBaseBuildTaskInstanceRequest extends TeaModel {
    /**
     * <p>The idempotency key for the retry operation. Keep the original value when you resend the same request, and use a new token when you initiate another retry.</p>
     * 
     * <strong>example:</strong>
     * <p>retry-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
     * <p>The ID of the instance to be retried.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20001</p>
     */
    @NameInMap("TaskInstanceId")
    public String taskInstanceId;

    public static RetryKnowledgeBaseBuildTaskInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryKnowledgeBaseBuildTaskInstanceRequest self = new RetryKnowledgeBaseBuildTaskInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RetryKnowledgeBaseBuildTaskInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RetryKnowledgeBaseBuildTaskInstanceRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public RetryKnowledgeBaseBuildTaskInstanceRequest setTaskInstanceId(String taskInstanceId) {
        this.taskInstanceId = taskInstanceId;
        return this;
    }
    public String getTaskInstanceId() {
        return this.taskInstanceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StopKnowledgeBaseBuildTaskInstanceRequest extends TeaModel {
    /**
     * <p>The knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abc</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The execution ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20001</p>
     */
    @NameInMap("TaskInstanceId")
    public String taskInstanceId;

    public static StopKnowledgeBaseBuildTaskInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopKnowledgeBaseBuildTaskInstanceRequest self = new StopKnowledgeBaseBuildTaskInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StopKnowledgeBaseBuildTaskInstanceRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public StopKnowledgeBaseBuildTaskInstanceRequest setTaskInstanceId(String taskInstanceId) {
        this.taskInstanceId = taskInstanceId;
        return this;
    }
    public String getTaskInstanceId() {
        return this.taskInstanceId;
    }

}

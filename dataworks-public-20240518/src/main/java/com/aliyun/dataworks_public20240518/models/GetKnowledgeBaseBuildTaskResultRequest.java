// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetKnowledgeBaseBuildTaskResultRequest extends TeaModel {
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
     * <p>The ID of the successfully executed instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20001</p>
     */
    @NameInMap("TaskInstanceId")
    public String taskInstanceId;

    public static GetKnowledgeBaseBuildTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeBaseBuildTaskResultRequest self = new GetKnowledgeBaseBuildTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeBaseBuildTaskResultRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public GetKnowledgeBaseBuildTaskResultRequest setTaskInstanceId(String taskInstanceId) {
        this.taskInstanceId = taskInstanceId;
        return this;
    }
    public String getTaskInstanceId() {
        return this.taskInstanceId;
    }

}

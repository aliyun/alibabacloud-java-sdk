// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ContextualRetrievalRequest extends TeaModel {
    /**
     * <p>The dataset used for retrieval.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The conversation history and tool calling history. The latest message is at the end (index n-1), and the oldest message is at the beginning (index 0). The messages must be in user-assistant pairs, with a total count of 2*n+1, and the length of the latest question cannot exceed 1,000 characters. The conversation history is limited to 100 messages.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Messages")
    public java.util.List<ContextualMessage> messages;

    /**
     * <p>The name of the project. For more information about how to obtain the project name, see <a href="https://www.alibabacloud.com/help/en/imm/getting-started/create-a-project-1">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>Specifies whether to enable only the recall process (embedding search). If this parameter is set to true, the returned data is not reranked, which allows you to customize the reranking process. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RecallOnly")
    public Boolean recallOnly;

    /**
     * <p>The list of smart cluster IDs, which are used to retrieve files within specific smart clusters.</p>
     */
    @NameInMap("SmartClusterIds")
    public java.util.List<String> smartClusterIds;

    public static ContextualRetrievalRequest build(java.util.Map<String, ?> map) throws Exception {
        ContextualRetrievalRequest self = new ContextualRetrievalRequest();
        return TeaModel.build(map, self);
    }

    public ContextualRetrievalRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public ContextualRetrievalRequest setMessages(java.util.List<ContextualMessage> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<ContextualMessage> getMessages() {
        return this.messages;
    }

    public ContextualRetrievalRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ContextualRetrievalRequest setRecallOnly(Boolean recallOnly) {
        this.recallOnly = recallOnly;
        return this;
    }
    public Boolean getRecallOnly() {
        return this.recallOnly;
    }

    public ContextualRetrievalRequest setSmartClusterIds(java.util.List<String> smartClusterIds) {
        this.smartClusterIds = smartClusterIds;
        return this;
    }
    public java.util.List<String> getSmartClusterIds() {
        return this.smartClusterIds;
    }

}

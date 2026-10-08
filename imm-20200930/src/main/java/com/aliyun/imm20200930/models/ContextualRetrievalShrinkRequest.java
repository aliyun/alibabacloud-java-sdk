// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ContextualRetrievalShrinkRequest extends TeaModel {
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
    public String messagesShrink;

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
    public String smartClusterIdsShrink;

    public static ContextualRetrievalShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ContextualRetrievalShrinkRequest self = new ContextualRetrievalShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ContextualRetrievalShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public ContextualRetrievalShrinkRequest setMessagesShrink(String messagesShrink) {
        this.messagesShrink = messagesShrink;
        return this;
    }
    public String getMessagesShrink() {
        return this.messagesShrink;
    }

    public ContextualRetrievalShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ContextualRetrievalShrinkRequest setRecallOnly(Boolean recallOnly) {
        this.recallOnly = recallOnly;
        return this;
    }
    public Boolean getRecallOnly() {
        return this.recallOnly;
    }

    public ContextualRetrievalShrinkRequest setSmartClusterIdsShrink(String smartClusterIdsShrink) {
        this.smartClusterIdsShrink = smartClusterIdsShrink;
        return this;
    }
    public String getSmartClusterIdsShrink() {
        return this.smartClusterIdsShrink;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ContextualRetrievalShrinkRequest extends TeaModel {
    /**
     * <p>The dataset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The conversation or tool invocation history. The latest message is at the end of the list (with an index number of n-1), whereas the earliest message is at the beginning of the list (with an index number of 0). Historical messages must be provided in user-assistant pairs. The maximum number of messages that you can specify is 2\*n+1. The current question cannot exceed 1,000 characters in length. The maximum number of historical messages allowed is 100.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Messages")
    public String messagesShrink;

    /**
     * <p>The name of the project. For more information, see <a href="https://help.aliyun.com/zh/imm/getting-started/create-a-project-1?spm=a2c4g.11186623.help-menu-search-62354.d_0">CreateProject</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>Indicates whether to enable recall-only (embedding-based search). If you set this parameter to true, returned results have not been re-ranked and can be ranked in custom order. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RecallOnly")
    public Boolean recallOnly;

    /**
     * <p>The IDs of clusters from which results are retrieved.</p>
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

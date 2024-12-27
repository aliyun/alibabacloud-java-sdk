// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ContextualRetrievalShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Messages")
    public String messagesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RecallOnly")
    public Boolean recallOnly;

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

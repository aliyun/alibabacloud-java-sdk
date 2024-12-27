// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ContextualRetrievalRequest extends TeaModel {
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
    public java.util.List<ContextualMessage> messages;

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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitCustomSourceTopicAnalysisShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>json</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <strong>example:</strong>
     * <p><a href="http://www.example.com/xxx.json">http://www.example.com/xxx.json</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxTopicSize")
    public Integer maxTopicSize;

    @NameInMap("News")
    public String newsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SubmitCustomSourceTopicAnalysisShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCustomSourceTopicAnalysisShrinkRequest self = new SubmitCustomSourceTopicAnalysisShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCustomSourceTopicAnalysisShrinkRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public SubmitCustomSourceTopicAnalysisShrinkRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public SubmitCustomSourceTopicAnalysisShrinkRequest setMaxTopicSize(Integer maxTopicSize) {
        this.maxTopicSize = maxTopicSize;
        return this;
    }
    public Integer getMaxTopicSize() {
        return this.maxTopicSize;
    }

    public SubmitCustomSourceTopicAnalysisShrinkRequest setNewsShrink(String newsShrink) {
        this.newsShrink = newsShrink;
        return this;
    }
    public String getNewsShrink() {
        return this.newsShrink;
    }

    public SubmitCustomSourceTopicAnalysisShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunGenerateQuestionsRequest extends TeaModel {
    /**
     * <p>Document ID</p>
     * 
     * <strong>example:</strong>
     * <p>oOgIwodFANW1u5MnqxysOh1rtld3xn</p>
     */
    @NameInMap("DocId")
    public String docId;

    /**
     * <p>Name of the custom model</p>
     * 
     * <strong>example:</strong>
     * <p>quanmiao-max、quanmiao-plus</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>Document content to extract questions from. If this field is not empty, use this text. If it is empty, use the document identified by DocId.</p>
     * 
     * <strong>example:</strong>
     * <p>关联内容</p>
     */
    @NameInMap("ReferenceContent")
    public String referenceContent;

    /**
     * <p>Session ID</p>
     * 
     * <strong>example:</strong>
     * <p>f486c4e2-b773-4d65-88f8-2ba540610456</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>Unique identifier of the Alibaba Cloud Model Studio workspace. To get this ID, see <a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-w335gauzlbba2vze</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunGenerateQuestionsRequest build(java.util.Map<String, ?> map) throws Exception {
        RunGenerateQuestionsRequest self = new RunGenerateQuestionsRequest();
        return TeaModel.build(map, self);
    }

    public RunGenerateQuestionsRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public RunGenerateQuestionsRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public RunGenerateQuestionsRequest setReferenceContent(String referenceContent) {
        this.referenceContent = referenceContent;
        return this;
    }
    public String getReferenceContent() {
        return this.referenceContent;
    }

    public RunGenerateQuestionsRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunGenerateQuestionsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

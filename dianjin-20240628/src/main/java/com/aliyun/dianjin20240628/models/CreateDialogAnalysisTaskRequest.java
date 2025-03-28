// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreateDialogAnalysisTaskRequest extends TeaModel {
    @NameInMap("analysisNodes")
    public java.util.List<String> analysisNodes;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("conversationList")
    public java.util.List<CreateDialogAnalysisTaskRequestConversationList> conversationList;

    /**
     * <strong>example:</strong>
     * <p>{
     * &quot;labels&quot;: &quot;XXX&quot;,
     * &quot;summaryConstraints&quot;: &quot;XXX&quot;,
     * &quot;sopInfo&quot;: &quot;XXX&quot;
     * }</p>
     */
    @NameInMap("metaData")
    public java.util.Map<String, ?> metaData;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>common</p>
     */
    @NameInMap("playCode")
    public String playCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0FC6636E-380A-5369-AE01-D1C15BB9B254</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateDialogAnalysisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDialogAnalysisTaskRequest self = new CreateDialogAnalysisTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDialogAnalysisTaskRequest setAnalysisNodes(java.util.List<String> analysisNodes) {
        this.analysisNodes = analysisNodes;
        return this;
    }
    public java.util.List<String> getAnalysisNodes() {
        return this.analysisNodes;
    }

    public CreateDialogAnalysisTaskRequest setConversationList(java.util.List<CreateDialogAnalysisTaskRequestConversationList> conversationList) {
        this.conversationList = conversationList;
        return this;
    }
    public java.util.List<CreateDialogAnalysisTaskRequestConversationList> getConversationList() {
        return this.conversationList;
    }

    public CreateDialogAnalysisTaskRequest setMetaData(java.util.Map<String, ?> metaData) {
        this.metaData = metaData;
        return this;
    }
    public java.util.Map<String, ?> getMetaData() {
        return this.metaData;
    }

    public CreateDialogAnalysisTaskRequest setPlayCode(String playCode) {
        this.playCode = playCode;
        return this;
    }
    public String getPlayCode() {
        return this.playCode;
    }

    public CreateDialogAnalysisTaskRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDialogAnalysisTaskRequestConversationListDialogueList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("role")
        public String role;

        public static CreateDialogAnalysisTaskRequestConversationListDialogueList build(java.util.Map<String, ?> map) throws Exception {
            CreateDialogAnalysisTaskRequestConversationListDialogueList self = new CreateDialogAnalysisTaskRequestConversationListDialogueList();
            return TeaModel.build(map, self);
        }

        public CreateDialogAnalysisTaskRequestConversationListDialogueList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateDialogAnalysisTaskRequestConversationListDialogueList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class CreateDialogAnalysisTaskRequestConversationList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("dialogueList")
        public java.util.List<CreateDialogAnalysisTaskRequestConversationListDialogueList> dialogueList;

        public static CreateDialogAnalysisTaskRequestConversationList build(java.util.Map<String, ?> map) throws Exception {
            CreateDialogAnalysisTaskRequestConversationList self = new CreateDialogAnalysisTaskRequestConversationList();
            return TeaModel.build(map, self);
        }

        public CreateDialogAnalysisTaskRequestConversationList setDialogueList(java.util.List<CreateDialogAnalysisTaskRequestConversationListDialogueList> dialogueList) {
            this.dialogueList = dialogueList;
            return this;
        }
        public java.util.List<CreateDialogAnalysisTaskRequestConversationListDialogueList> getDialogueList() {
            return this.dialogueList;
        }

    }

}

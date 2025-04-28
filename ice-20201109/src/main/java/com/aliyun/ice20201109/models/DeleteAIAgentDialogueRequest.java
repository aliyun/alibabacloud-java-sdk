// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteAIAgentDialogueRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f27f9b9be28642a88e18*******</p>
     */
    @NameInMap("DialogueId")
    public String dialogueId;

    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6d594e7f55624c47a48789******</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static DeleteAIAgentDialogueRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIAgentDialogueRequest self = new DeleteAIAgentDialogueRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAIAgentDialogueRequest setDialogueId(String dialogueId) {
        this.dialogueId = dialogueId;
        return this;
    }
    public String getDialogueId() {
        return this.dialogueId;
    }

    public DeleteAIAgentDialogueRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DeleteAIAgentDialogueRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}

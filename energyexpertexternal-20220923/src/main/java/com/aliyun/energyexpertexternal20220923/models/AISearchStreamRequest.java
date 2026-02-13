// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class AISearchStreamRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1a851c4a-1d65-11ef-99a7-ssfsfdd</p>
     */
    @NameInMap("folderId")
    public String folderId;

    @NameInMap("message")
    public java.util.List<AISearchMessageItem> message;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>“my net is slow, what can I do?”</p>
     */
    @NameInMap("question")
    public String question;

    @NameInMap("resourceTypeNeeded")
    public java.util.List<String> resourceTypeNeeded;

    public static AISearchStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        AISearchStreamRequest self = new AISearchStreamRequest();
        return TeaModel.build(map, self);
    }

    public AISearchStreamRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public AISearchStreamRequest setMessage(java.util.List<AISearchMessageItem> message) {
        this.message = message;
        return this;
    }
    public java.util.List<AISearchMessageItem> getMessage() {
        return this.message;
    }

    public AISearchStreamRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public AISearchStreamRequest setResourceTypeNeeded(java.util.List<String> resourceTypeNeeded) {
        this.resourceTypeNeeded = resourceTypeNeeded;
        return this;
    }
    public java.util.List<String> getResourceTypeNeeded() {
        return this.resourceTypeNeeded;
    }

}

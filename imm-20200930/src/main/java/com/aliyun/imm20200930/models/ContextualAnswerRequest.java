// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ContextualAnswerRequest extends TeaModel {
    @NameInMap("Files")
    public java.util.List<ContextualFile> files;

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

    public static ContextualAnswerRequest build(java.util.Map<String, ?> map) throws Exception {
        ContextualAnswerRequest self = new ContextualAnswerRequest();
        return TeaModel.build(map, self);
    }

    public ContextualAnswerRequest setFiles(java.util.List<ContextualFile> files) {
        this.files = files;
        return this;
    }
    public java.util.List<ContextualFile> getFiles() {
        return this.files;
    }

    public ContextualAnswerRequest setMessages(java.util.List<ContextualMessage> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<ContextualMessage> getMessages() {
        return this.messages;
    }

    public ContextualAnswerRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}

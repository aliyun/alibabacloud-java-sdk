// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ContextualAnswerRequest extends TeaModel {
    /**
     * <p>The content of the files involved in the current Q&amp;A. It is recommended to use the return value of the ContextualRetrieval interface as input.</p>
     */
    @NameInMap("Files")
    public java.util.List<ContextualFile> files;

    /**
     * <p>Yes, the history of conversations and tool invocations. The latest message is at the end (index n-1), and the oldest message is at the beginning (index 0).
     * It must be in the form of user-assistant pairs, with a total count of 2*n+1, and the length of the latest question should not exceed 1000 characters.
     * The length of the historical conversation is limited to 100.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Messages")
    public java.util.List<ContextualMessage> messages;

    /**
     * <p>Project name. For how to obtain it, see <a href="https://help.aliyun.com/zh/imm/getting-started/create-a-project-1?spm=a2c4g.11186623.help-menu-search-62354.d_0">Creating a Project</a>.</p>
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

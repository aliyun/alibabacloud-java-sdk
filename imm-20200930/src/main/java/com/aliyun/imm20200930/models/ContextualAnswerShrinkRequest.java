// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ContextualAnswerShrinkRequest extends TeaModel {
    /**
     * <p>The content of the files involved in the current Q&amp;A. It is recommended to use the return value of the ContextualRetrieval interface as input.</p>
     */
    @NameInMap("Files")
    public String filesShrink;

    /**
     * <p>Yes, the history of conversations and tool invocations. The latest message is at the end (index n-1), and the oldest message is at the beginning (index 0).
     * It must be in the form of user-assistant pairs, with a total count of 2*n+1, and the length of the latest question should not exceed 1000 characters.
     * The length of the historical conversation is limited to 100.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Messages")
    public String messagesShrink;

    /**
     * <p>Project name. For how to obtain it, see <a href="https://help.aliyun.com/zh/imm/getting-started/create-a-project-1?spm=a2c4g.11186623.help-menu-search-62354.d_0">Creating a Project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static ContextualAnswerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ContextualAnswerShrinkRequest self = new ContextualAnswerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ContextualAnswerShrinkRequest setFilesShrink(String filesShrink) {
        this.filesShrink = filesShrink;
        return this;
    }
    public String getFilesShrink() {
        return this.filesShrink;
    }

    public ContextualAnswerShrinkRequest setMessagesShrink(String messagesShrink) {
        this.messagesShrink = messagesShrink;
        return this;
    }
    public String getMessagesShrink() {
        return this.messagesShrink;
    }

    public ContextualAnswerShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}

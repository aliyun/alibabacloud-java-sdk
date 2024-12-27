// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ContextualAnswerShrinkRequest extends TeaModel {
    @NameInMap("Files")
    public String filesShrink;

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

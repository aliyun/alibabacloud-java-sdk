// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ContextualMessage extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>你好</p>
     */
    @NameInMap("Content")
    public String content;

    @NameInMap("Files")
    public java.util.List<ContextualFile> files;

    /**
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("Role")
    public String role;

    public static ContextualMessage build(java.util.Map<String, ?> map) throws Exception {
        ContextualMessage self = new ContextualMessage();
        return TeaModel.build(map, self);
    }

    public ContextualMessage setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ContextualMessage setFiles(java.util.List<ContextualFile> files) {
        this.files = files;
        return this;
    }
    public java.util.List<ContextualFile> getFiles() {
        return this.files;
    }

    public ContextualMessage setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}

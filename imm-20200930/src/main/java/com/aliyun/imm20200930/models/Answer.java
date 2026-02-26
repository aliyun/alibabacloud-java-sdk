// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Answer extends TeaModel {
    /**
     * <p>The answer.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The reference sources of the answer.</p>
     */
    @NameInMap("References")
    public java.util.List<ReferenceFile> references;

    public static Answer build(java.util.Map<String, ?> map) throws Exception {
        Answer self = new Answer();
        return TeaModel.build(map, self);
    }

    public Answer setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public Answer setReferences(java.util.List<ReferenceFile> references) {
        this.references = references;
        return this;
    }
    public java.util.List<ReferenceFile> getReferences() {
        return this.references;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteWorkitemAllCommentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("identifier")
    public String identifier;

    public static DeleteWorkitemAllCommentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkitemAllCommentRequest self = new DeleteWorkitemAllCommentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkitemAllCommentRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

}

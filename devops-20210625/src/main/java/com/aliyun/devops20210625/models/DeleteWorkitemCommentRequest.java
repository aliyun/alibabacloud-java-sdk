// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteWorkitemCommentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("commentId")
    public Long commentId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("identifier")
    public String identifier;

    public static DeleteWorkitemCommentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkitemCommentRequest self = new DeleteWorkitemCommentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkitemCommentRequest setCommentId(Long commentId) {
        this.commentId = commentId;
        return this;
    }
    public Long getCommentId() {
        return this.commentId;
    }

    public DeleteWorkitemCommentRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

}

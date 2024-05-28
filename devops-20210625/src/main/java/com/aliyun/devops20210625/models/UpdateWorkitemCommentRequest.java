// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateWorkitemCommentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("commentId")
    public Long commentId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("formatType")
    public String formatType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("workitemIdentifier")
    public String workitemIdentifier;

    public static UpdateWorkitemCommentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkitemCommentRequest self = new UpdateWorkitemCommentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkitemCommentRequest setCommentId(Long commentId) {
        this.commentId = commentId;
        return this;
    }
    public Long getCommentId() {
        return this.commentId;
    }

    public UpdateWorkitemCommentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateWorkitemCommentRequest setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public UpdateWorkitemCommentRequest setWorkitemIdentifier(String workitemIdentifier) {
        this.workitemIdentifier = workitemIdentifier;
        return this;
    }
    public String getWorkitemIdentifier() {
        return this.workitemIdentifier;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateWorkitemCommentRequest extends TeaModel {
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

    @NameInMap("parentId")
    public String parentId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("workitemIdentifier")
    public String workitemIdentifier;

    public static CreateWorkitemCommentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkitemCommentRequest self = new CreateWorkitemCommentRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkitemCommentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateWorkitemCommentRequest setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public CreateWorkitemCommentRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public CreateWorkitemCommentRequest setWorkitemIdentifier(String workitemIdentifier) {
        this.workitemIdentifier = workitemIdentifier;
        return this;
    }
    public String getWorkitemIdentifier() {
        return this.workitemIdentifier;
    }

}

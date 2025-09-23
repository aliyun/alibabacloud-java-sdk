// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class EditBiddingDocRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>html
     * markdown</p>
     */
    @NameInMap("ContentFormat")
    public String contentFormat;

    /**
     * <strong>example:</strong>
     * <p>outline
     * bidding</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <strong>example:</strong>
     * <p>0dbf1055f8a2475d99904c3b76a0ffba</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static EditBiddingDocRequest build(java.util.Map<String, ?> map) throws Exception {
        EditBiddingDocRequest self = new EditBiddingDocRequest();
        return TeaModel.build(map, self);
    }

    public EditBiddingDocRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public EditBiddingDocRequest setContentFormat(String contentFormat) {
        this.contentFormat = contentFormat;
        return this;
    }
    public String getContentFormat() {
        return this.contentFormat;
    }

    public EditBiddingDocRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public EditBiddingDocRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public EditBiddingDocRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

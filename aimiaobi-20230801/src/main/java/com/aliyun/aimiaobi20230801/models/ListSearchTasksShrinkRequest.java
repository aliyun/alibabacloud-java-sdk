// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListSearchTasksShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("DialogueTypes")
    public String dialogueTypesShrink;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListSearchTasksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSearchTasksShrinkRequest self = new ListSearchTasksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListSearchTasksShrinkRequest setDialogueTypesShrink(String dialogueTypesShrink) {
        this.dialogueTypesShrink = dialogueTypesShrink;
        return this;
    }
    public String getDialogueTypesShrink() {
        return this.dialogueTypesShrink;
    }

    public ListSearchTasksShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSearchTasksShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSearchTasksShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

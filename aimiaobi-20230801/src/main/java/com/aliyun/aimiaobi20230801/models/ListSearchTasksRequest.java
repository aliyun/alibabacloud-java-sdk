// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListSearchTasksRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("DialogueTypes")
    public java.util.List<Integer> dialogueTypes;

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

    public static ListSearchTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSearchTasksRequest self = new ListSearchTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListSearchTasksRequest setDialogueTypes(java.util.List<Integer> dialogueTypes) {
        this.dialogueTypes = dialogueTypes;
        return this;
    }
    public java.util.List<Integer> getDialogueTypes() {
        return this.dialogueTypes;
    }

    public ListSearchTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSearchTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSearchTasksRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

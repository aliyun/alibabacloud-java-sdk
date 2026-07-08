// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListAnalysisTagDetailByTaskIdShrinkRequest extends TeaModel {
    /**
     * <p>A list of categories for filtering.</p>
     */
    @NameInMap("Categories")
    public String categoriesShrink;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>token-xxxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of records to request.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>The unique ID of the task.</p>
     * <blockquote>
     * <p>This parameter is optional. The system automatically generates a task ID. If you specify the same TaskId for multiple tasks, the tasks are considered part of the same conversation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The unique ID of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get a Workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListAnalysisTagDetailByTaskIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAnalysisTagDetailByTaskIdShrinkRequest self = new ListAnalysisTagDetailByTaskIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAnalysisTagDetailByTaskIdShrinkRequest setCategoriesShrink(String categoriesShrink) {
        this.categoriesShrink = categoriesShrink;
        return this;
    }
    public String getCategoriesShrink() {
        return this.categoriesShrink;
    }

    public ListAnalysisTagDetailByTaskIdShrinkRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListAnalysisTagDetailByTaskIdShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAnalysisTagDetailByTaskIdShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAnalysisTagDetailByTaskIdShrinkRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListAnalysisTagDetailByTaskIdShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ListAnalysisTagDetailByTaskIdShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceTestTaskLogsRequest extends TeaModel {
    /**
     * <p>The number of items to return per page when paginating results. The maximum is 100, and the default is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAWns8w4MmhzeptXVRG0PUEU=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Sort Order. Possible values:</p>
     * <ul>
     * <li><p>Ascending: Ascending order</p>
     * </li>
     * <li><p>Descending (default value): Descending order</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ascending</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>stt-568c2c5a687a409b977e</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ListServiceTestTaskLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceTestTaskLogsRequest self = new ListServiceTestTaskLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceTestTaskLogsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceTestTaskLogsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceTestTaskLogsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListServiceTestTaskLogsRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}

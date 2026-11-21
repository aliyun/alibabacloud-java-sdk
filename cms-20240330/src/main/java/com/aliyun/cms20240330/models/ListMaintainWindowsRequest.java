// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListMaintainWindowsRequest extends TeaModel {
    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><strong>asc</strong>: Ascending order.</li>
     * <li><strong>desc</strong>: Descending order. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("direction")
    public String direction;

    /**
     * <p>Filters by enabled status. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Returns only enabled silence policies.</li>
     * <li><strong>false</strong>: Returns only paused silence policies.</li>
     * </ul>
     * <p>If you do not specify this parameter, the policies are not filtered by enabled status.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The ID of the silence policy. Exact matching is used. If you do not specify this parameter, the policies are not filtered by ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3ff3fbd0-8a0b-4b31-9b1c-8e3f0a2c5d71</p>
     */
    @NameInMap("maintainWindowId")
    public String maintainWindowId;

    /**
     * <p>Policy Name of the silence policy. Fuzzy matching is used, where a match occurs if Policy Name contains the specified value. If you do not specify this parameter, the policies are not filtered by name.</p>
     * 
     * <strong>example:</strong>
     * <p>silence-for-release</p>
     */
    @NameInMap("maintainWindowName")
    public String maintainWindowName;

    /**
     * <p>The maximum number of records to return for this request. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination cursor. You do not need to specify this parameter for the first query. For subsequent queries, you can specify the non-empty nextToken returned in the previous response. This value does not guarantee that the next page contains data.</p>
     * 
     * <strong>example:</strong>
     * <p>Y21zRXZlbnRCYXNlUGFnZT0x</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The field by which to sort. By default, the policies are sorted by creation time. Valid values:</p>
     * <ul>
     * <li><strong>createTime</strong>: Creation time.</li>
     * <li><strong>updateTime</strong>: Update time.</li>
     * <li><strong>enable</strong>: Enabled status.</li>
     * </ul>
     * <p>If you specify other values, the policies are sorted by creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>createTime</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <p>The name of the workspace. This parameter is required by the backend and is used to isolate silence policy resources across different business workspaces.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-xxxx-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static ListMaintainWindowsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMaintainWindowsRequest self = new ListMaintainWindowsRequest();
        return TeaModel.build(map, self);
    }

    public ListMaintainWindowsRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ListMaintainWindowsRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ListMaintainWindowsRequest setMaintainWindowId(String maintainWindowId) {
        this.maintainWindowId = maintainWindowId;
        return this;
    }
    public String getMaintainWindowId() {
        return this.maintainWindowId;
    }

    public ListMaintainWindowsRequest setMaintainWindowName(String maintainWindowName) {
        this.maintainWindowName = maintainWindowName;
        return this;
    }
    public String getMaintainWindowName() {
        return this.maintainWindowName;
    }

    public ListMaintainWindowsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMaintainWindowsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMaintainWindowsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListMaintainWindowsRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}

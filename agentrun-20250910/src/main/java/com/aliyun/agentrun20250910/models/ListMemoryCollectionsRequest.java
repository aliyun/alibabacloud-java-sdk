// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListMemoryCollectionsRequest extends TeaModel {
    /**
     * <p>Filters the results by memory collection name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-memory-1</p>
     */
    @NameInMap("memoryCollectionName")
    public String memoryCollectionName;

    /**
     * <p>The page number. Defaults to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return per page. Defaults to 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Filters the results by memory collection status.</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>Filters the results by memory collection type.</p>
     * 
     * <strong>example:</strong>
     * <p>mem0</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The ID of the workspace to filter by.</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    /**
     * <p>The IDs of the workspaces to filter by, provided as a comma-separated string.</p>
     */
    @NameInMap("workspaceIds")
    public String workspaceIds;

    public static ListMemoryCollectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMemoryCollectionsRequest self = new ListMemoryCollectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListMemoryCollectionsRequest setMemoryCollectionName(String memoryCollectionName) {
        this.memoryCollectionName = memoryCollectionName;
        return this;
    }
    public String getMemoryCollectionName() {
        return this.memoryCollectionName;
    }

    public ListMemoryCollectionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMemoryCollectionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMemoryCollectionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListMemoryCollectionsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListMemoryCollectionsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ListMemoryCollectionsRequest setWorkspaceIds(String workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

}

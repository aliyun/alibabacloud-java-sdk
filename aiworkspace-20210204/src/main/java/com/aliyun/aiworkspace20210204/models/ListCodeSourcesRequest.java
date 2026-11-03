// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListCodeSourcesRequest extends TeaModel {
    /**
     * <p>The display name of the code configuration. Fuzzy matching is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>MyDataSource</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The sorting order of the specified field for paging in a paged query. Valid values:</p>
     * <ul>
     * <li>ASC: ascending order.</li>
     * <li>DESC: descending order.
     * Default value: ASC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number of the code configuration list. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page set in the paging Settings for a paged query. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The field used for sorting. Valid values:</p>
     * <ul>
     * <li>GmtModifyTime: the modification time of the code source</li>
     * <li>DisplayName: the display name</li>
     * <li>CodeSourceId: the ID of the code source</li>
     * <li>GmtCreateTime: the creation time of the code source
     * Default value: GmtCreateTime.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtModifyTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The ID of the workspace. This parameter is required. For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListCodeSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCodeSourcesRequest self = new ListCodeSourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListCodeSourcesRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListCodeSourcesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListCodeSourcesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCodeSourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCodeSourcesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListCodeSourcesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

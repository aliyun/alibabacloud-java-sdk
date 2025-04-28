// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListCodeSourcesRequest extends TeaModel {
    /**
     * <p>The display name of the code source. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>MyDataSource</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The order in which the entries are sorted by the specific field on the returned page. Valid values:</p>
     * <ul>
     * <li>ASC (default)</li>
     * <li>DESC</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The field used for sorting. Valid values:</p>
     * <ul>
     * <li>GmtModifyTime: the time when the code source was modified.</li>
     * <li>DisplayName: the display name.</li>
     * <li>CodeSourceId: the code source ID.</li>
     * <li>GmtCreateTime: the time when the code source was created. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtModifyTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
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

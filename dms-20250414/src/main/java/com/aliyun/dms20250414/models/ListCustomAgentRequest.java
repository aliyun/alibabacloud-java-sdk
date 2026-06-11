// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListCustomAgentRequest extends TeaModel {
    /**
     * <p>The page number. Pages start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size. The default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether to query all published custom agents. The default value is false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("QueryAllReleased")
    public Boolean queryAllReleased;

    /**
     * <p>A keyword for a fuzzy search on the names and descriptions of custom agents.</p>
     * 
     * <strong>example:</strong>
     * <p>测试Agent</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The status of the custom agent.</p>
     * 
     * <strong>example:</strong>
     * <p>RELEASED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>56kv1pvl9uvt9**********bb</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListCustomAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomAgentRequest self = new ListCustomAgentRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomAgentRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomAgentRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomAgentRequest setQueryAllReleased(Boolean queryAllReleased) {
        this.queryAllReleased = queryAllReleased;
        return this;
    }
    public Boolean getQueryAllReleased() {
        return this.queryAllReleased;
    }

    public ListCustomAgentRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListCustomAgentRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListCustomAgentRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

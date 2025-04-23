// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListWorkspacesRequest extends TeaModel {
    /**
     * <p>The list of returned fields of workspace details. Used to limit the fields in the returned results. Separate multiple fields with commas (,). Currently, only Id is supported, which is the workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>Id</p>
     */
    @NameInMap("Fields")
    public String fields;

    /**
     * <p>The modules, separated by commas (,). Default value: PAI.</p>
     * 
     * <strong>example:</strong>
     * <p>PAI</p>
     */
    @NameInMap("ModuleList")
    public String moduleList;

    /**
     * <p>The query options. Valid values:</p>
     * <ul>
     * <li>GetWorkspaces (default): Obtains a list of Workspaces.</li>
     * <li>GetResourceLimits: Obtains a list of ResourceLimits.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GetWorkspaces</p>
     */
    @NameInMap("Option")
    public String option;

    /**
     * <p>The order of results (ascending or descending). Valid values:</p>
     * <ul>
     * <li>ASC: ascending order. This is the default value.</li>
     * <li>DESC: descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number of the workspace list. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The resource group ID. To obtain the ID of a resource group, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmwp7rky****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies how to sort the results. Default value: GmtCreateTime. Valid values:</p>
     * <ul>
     * <li>GmtCreateTime: Sort by the time when created.</li>
     * <li>GmtModifiedTime: Sort by the time when modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The workspace status. Valid values:</p>
     * <ul>
     * <li>ENABLED</li>
     * <li>INITIALIZING</li>
     * <li>FAILURE</li>
     * <li>DISABLED</li>
     * <li>FROZEN</li>
     * <li>UPDATING</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ENABLED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Specifies whether to display workspace details. Valid values:</p>
     * <ul>
     * <li>false (default)</li>
     * <li>true</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    /**
     * <p>The workspace IDs. Separate multiple IDs by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>123,234</p>
     */
    @NameInMap("WorkspaceIds")
    public String workspaceIds;

    /**
     * <p>The name of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static ListWorkspacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesRequest self = new ListWorkspacesRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public ListWorkspacesRequest setModuleList(String moduleList) {
        this.moduleList = moduleList;
        return this;
    }
    public String getModuleList() {
        return this.moduleList;
    }

    public ListWorkspacesRequest setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

    public ListWorkspacesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListWorkspacesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListWorkspacesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWorkspacesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListWorkspacesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListWorkspacesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListWorkspacesRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

    public ListWorkspacesRequest setWorkspaceIds(String workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

    public ListWorkspacesRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}

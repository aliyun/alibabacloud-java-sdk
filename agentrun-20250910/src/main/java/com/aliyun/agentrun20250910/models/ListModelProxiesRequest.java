// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListModelProxiesRequest extends TeaModel {
    /**
     * <p>The page number for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. The default is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Specifies the proxy mode.</p>
     * 
     * <strong>example:</strong>
     * <p>proxyMode</p>
     */
    @NameInMap("proxyMode")
    public String proxyMode;

    /**
     * <p>Filters the list by Model Proxy status.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATING</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    /**
     * <p>A comma-separated list of workspace IDs to query.</p>
     */
    @NameInMap("workspaceIds")
    public String workspaceIds;

    public static ListModelProxiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelProxiesRequest self = new ListModelProxiesRequest();
        return TeaModel.build(map, self);
    }

    public ListModelProxiesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelProxiesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelProxiesRequest setProxyMode(String proxyMode) {
        this.proxyMode = proxyMode;
        return this;
    }
    public String getProxyMode() {
        return this.proxyMode;
    }

    public ListModelProxiesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListModelProxiesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ListModelProxiesRequest setWorkspaceIds(String workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListKnowledgeBasesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>bailian</p>
     */
    @NameInMap("provider")
    public String provider;

    /**
     * <strong>example:</strong>
     * <p>1e546db8-bd93-5a52-9be1-5a1351cdac95</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    /**
     * <strong>example:</strong>
     * <p>1e546db8-bd93-5a52-9be1-5a1351cdac95,1e546db8-bd93-5a52-9be1-5a1351caass4</p>
     */
    @NameInMap("workspaceIds")
    public String workspaceIds;

    public static ListKnowledgeBasesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBasesRequest self = new ListKnowledgeBasesRequest();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBasesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListKnowledgeBasesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListKnowledgeBasesRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public ListKnowledgeBasesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ListKnowledgeBasesRequest setWorkspaceIds(String workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

}

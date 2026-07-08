// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListGeneralConfigsRequest extends TeaModel {
    /**
     * <p>The current page number. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique identifier of the Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get a workspaceId</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListGeneralConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGeneralConfigsRequest self = new ListGeneralConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListGeneralConfigsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGeneralConfigsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListGeneralConfigsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

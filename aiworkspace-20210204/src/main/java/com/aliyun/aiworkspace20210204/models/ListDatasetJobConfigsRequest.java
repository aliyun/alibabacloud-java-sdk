// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetJobConfigsRequest extends TeaModel {
    /**
     * <p>The configuration type.</p>
     * <ul>
     * <li>MultimodalIntelligentTag</li>
     * <li>MultimodalSemanticIndex</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MultimodalIntelligentTag</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>431514</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListDatasetJobConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetJobConfigsRequest self = new ListDatasetJobConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasetJobConfigsRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public ListDatasetJobConfigsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListDatasetJobConfigsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListDatasetJobConfigsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

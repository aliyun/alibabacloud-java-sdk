// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDirectoryTreeRequest extends TeaModel {
    /**
     * <p>Directory type.</p>
     * <ul>
     * <li>Ad-hoc Query: tempCode</li>
     * <li>Code Task: codeManage</li>
     * <li>Offline Pipeline: offlinePipeline</li>
     * <li>Pipeline Custom Component: offlinePipelineCustomPlugin</li>
     * <li>Sync Task: dataX</li>
     * <li>Real-time Meta Table: streamMeta</li>
     * <li>Real-time Custom Source: streamCustomDataSource</li>
     * <li>Real-time Compute Template: streamTemplate</li>
     * <li>Resource Management: resourceManage</li>
     * <li>Offline Function: udfResource</li>
     * <li>Real-time Function: streamFunction</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>codeManage</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>Tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>Project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7081229106458752</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetDirectoryTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDirectoryTreeRequest self = new GetDirectoryTreeRequest();
        return TeaModel.build(map, self);
    }

    public GetDirectoryTreeRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public GetDirectoryTreeRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetDirectoryTreeRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteDatasetRequest extends TeaModel {
    /**
     * <p>The dataset ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7280840713415040</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7262419688152064</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static DeleteDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetRequest self = new DeleteDatasetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteDatasetRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public DeleteDatasetRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}

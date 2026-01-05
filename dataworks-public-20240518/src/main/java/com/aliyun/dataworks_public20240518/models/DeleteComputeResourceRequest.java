// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteComputeResourceRequest extends TeaModel {
    /**
     * <p>The computing resource ID, the unique identifier of the data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static DeleteComputeResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteComputeResourceRequest self = new DeleteComputeResourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteComputeResourceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteComputeResourceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}

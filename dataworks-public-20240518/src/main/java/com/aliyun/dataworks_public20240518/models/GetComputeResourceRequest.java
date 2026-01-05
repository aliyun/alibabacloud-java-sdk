// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetComputeResourceRequest extends TeaModel {
    /**
     * <p>The computing resource ID, which is the unique identifier for the resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11792</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10003</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetComputeResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetComputeResourceRequest self = new GetComputeResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetComputeResourceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetComputeResourceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}

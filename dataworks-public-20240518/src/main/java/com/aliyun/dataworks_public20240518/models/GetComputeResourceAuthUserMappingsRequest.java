// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetComputeResourceAuthUserMappingsRequest extends TeaModel {
    /**
     * <p>The ID of the compute resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("ComputeResourceId")
    public Long computeResourceId;

    /**
     * <p>The DataWorks workspace to which the data source belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetComputeResourceAuthUserMappingsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetComputeResourceAuthUserMappingsRequest self = new GetComputeResourceAuthUserMappingsRequest();
        return TeaModel.build(map, self);
    }

    public GetComputeResourceAuthUserMappingsRequest setComputeResourceId(Long computeResourceId) {
        this.computeResourceId = computeResourceId;
        return this;
    }
    public Long getComputeResourceId() {
        return this.computeResourceId;
    }

    public GetComputeResourceAuthUserMappingsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}

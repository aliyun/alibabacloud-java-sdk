// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceAppGroupsRequest extends TeaModel {
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
     * <p>The data service project ID.</p>
     * <blockquote>
     * <p>Notice: This field is deprecated.</notice>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>102102</p>
     */
    @NameInMap("ProjectId")
    @Deprecated
    public Integer projectId;

    public static GetDataServiceAppGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceAppGroupsRequest self = new GetDataServiceAppGroupsRequest();
        return TeaModel.build(map, self);
    }

    public GetDataServiceAppGroupsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    @Deprecated
    public GetDataServiceAppGroupsRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

}

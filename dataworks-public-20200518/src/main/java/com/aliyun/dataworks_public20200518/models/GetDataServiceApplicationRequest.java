// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceApplicationRequest extends TeaModel {
    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ApplicationId")
    public Long applicationId;

    public static GetDataServiceApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApplicationRequest self = new GetDataServiceApplicationRequest();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApplicationRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public GetDataServiceApplicationRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetDataServiceApplicationRequest setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public Long getApplicationId() {
        return this.applicationId;
    }

}

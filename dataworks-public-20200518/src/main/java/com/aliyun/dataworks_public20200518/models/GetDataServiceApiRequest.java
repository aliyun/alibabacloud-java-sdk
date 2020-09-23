// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceApiRequest extends TeaModel {
    @NameInMap("TenantId")
    @Validation(required = true)
    public Long tenantId;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("ApiId")
    @Validation(required = true)
    public Long apiId;

    public static GetDataServiceApiRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiRequest self = new GetDataServiceApiRequest();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApiRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public GetDataServiceApiRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetDataServiceApiRequest setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }
    public Long getApiId() {
        return this.apiId;
    }

}

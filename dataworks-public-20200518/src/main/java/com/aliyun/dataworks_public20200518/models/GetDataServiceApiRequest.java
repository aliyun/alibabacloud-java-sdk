// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceApiRequest extends TeaModel {
    /**
     * <p>The ID of the DataService Studio API.</p>
     */
    @NameInMap("ApiId")
    public Long apiId;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    public static GetDataServiceApiRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiRequest self = new GetDataServiceApiRequest();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApiRequest setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }
    public Long getApiId() {
        return this.apiId;
    }

    public GetDataServiceApiRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetDataServiceApiRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}

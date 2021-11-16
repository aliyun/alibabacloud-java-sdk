// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class AbolishDataServiceApiRequest extends TeaModel {
    @NameInMap("ApiId")
    public Long apiId;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TenantId")
    public Long tenantId;

    public static AbolishDataServiceApiRequest build(java.util.Map<String, ?> map) throws Exception {
        AbolishDataServiceApiRequest self = new AbolishDataServiceApiRequest();
        return TeaModel.build(map, self);
    }

    public AbolishDataServiceApiRequest setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }
    public Long getApiId() {
        return this.apiId;
    }

    public AbolishDataServiceApiRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public AbolishDataServiceApiRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}

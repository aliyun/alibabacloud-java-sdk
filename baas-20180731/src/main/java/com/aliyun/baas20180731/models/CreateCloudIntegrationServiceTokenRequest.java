// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateCloudIntegrationServiceTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Service")
    public String service;

    public static CreateCloudIntegrationServiceTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudIntegrationServiceTokenRequest self = new CreateCloudIntegrationServiceTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudIntegrationServiceTokenRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public CreateCloudIntegrationServiceTokenRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

}

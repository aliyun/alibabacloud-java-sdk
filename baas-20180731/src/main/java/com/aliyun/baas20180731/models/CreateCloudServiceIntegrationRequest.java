// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateCloudServiceIntegrationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static CreateCloudServiceIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudServiceIntegrationRequest self = new CreateCloudServiceIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudServiceIntegrationRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}

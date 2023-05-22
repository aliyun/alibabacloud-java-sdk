// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>Queries the basic information, verification results, billing results, and deployment results of an application.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static GetApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationRequest self = new GetApplicationRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public GetApplicationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListCurrentUsageForResourceGroupRequest extends TeaModel {
    @NameInMap("ProjectEnv")
    public String projectEnv;

    @NameInMap("ResourceGroupIdentifier")
    public String resourceGroupIdentifier;

    public static ListCurrentUsageForResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCurrentUsageForResourceGroupRequest self = new ListCurrentUsageForResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListCurrentUsageForResourceGroupRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public ListCurrentUsageForResourceGroupRequest setResourceGroupIdentifier(String resourceGroupIdentifier) {
        this.resourceGroupIdentifier = resourceGroupIdentifier;
        return this;
    }
    public String getResourceGroupIdentifier() {
        return this.resourceGroupIdentifier;
    }

}

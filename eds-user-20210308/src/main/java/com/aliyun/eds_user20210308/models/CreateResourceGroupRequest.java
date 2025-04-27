// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CreateResourceGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsResourceGroupWithOfficeSite")
    public Long isResourceGroupWithOfficeSite;

    /**
     * <strong>example:</strong>
     * <p>AliyunConsole</p>
     */
    @NameInMap("Platform")
    public String platform;

    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    public static CreateResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceGroupRequest self = new CreateResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceGroupRequest setIsResourceGroupWithOfficeSite(Long isResourceGroupWithOfficeSite) {
        this.isResourceGroupWithOfficeSite = isResourceGroupWithOfficeSite;
        return this;
    }
    public Long getIsResourceGroupWithOfficeSite() {
        return this.isResourceGroupWithOfficeSite;
    }

    public CreateResourceGroupRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateResourceGroupRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

}

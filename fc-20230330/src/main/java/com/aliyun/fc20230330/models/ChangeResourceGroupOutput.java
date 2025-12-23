// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ChangeResourceGroupOutput extends TeaModel {
    @NameInMap("NewResourceGroupId")
    public String newResourceGroupId;

    @NameInMap("OldResourceGroupId")
    public String oldResourceGroupId;

    @NameInMap("ResourceId")
    public String resourceId;

    public static ChangeResourceGroupOutput build(java.util.Map<String, ?> map) throws Exception {
        ChangeResourceGroupOutput self = new ChangeResourceGroupOutput();
        return TeaModel.build(map, self);
    }

    public ChangeResourceGroupOutput setNewResourceGroupId(String newResourceGroupId) {
        this.newResourceGroupId = newResourceGroupId;
        return this;
    }
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
    }

    public ChangeResourceGroupOutput setOldResourceGroupId(String oldResourceGroupId) {
        this.oldResourceGroupId = oldResourceGroupId;
        return this;
    }
    public String getOldResourceGroupId() {
        return this.oldResourceGroupId;
    }

    public ChangeResourceGroupOutput setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}

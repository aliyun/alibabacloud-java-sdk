// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyUserBusinessBehaviorRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("statusKey")
    @Validation(required = true)
    public String statusKey;

    @NameInMap("statusValue")
    @Validation(required = true)
    public String statusValue;

    public static ModifyUserBusinessBehaviorRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserBusinessBehaviorRequest self = new ModifyUserBusinessBehaviorRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserBusinessBehaviorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyUserBusinessBehaviorRequest setStatusKey(String statusKey) {
        this.statusKey = statusKey;
        return this;
    }
    public String getStatusKey() {
        return this.statusKey;
    }

    public ModifyUserBusinessBehaviorRequest setStatusValue(String statusValue) {
        this.statusValue = statusValue;
        return this;
    }
    public String getStatusValue() {
        return this.statusValue;
    }

}

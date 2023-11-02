// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class UpdateAutomateResponseConfigStatusRequest extends TeaModel {
    @NameInMap("Ids")
    public String ids;

    @NameInMap("InUse")
    public Boolean inUse;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateAutomateResponseConfigStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutomateResponseConfigStatusRequest self = new UpdateAutomateResponseConfigStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAutomateResponseConfigStatusRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public UpdateAutomateResponseConfigStatusRequest setInUse(Boolean inUse) {
        this.inUse = inUse;
        return this;
    }
    public Boolean getInUse() {
        return this.inUse;
    }

    public UpdateAutomateResponseConfigStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

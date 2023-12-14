// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class UpdateAutomateResponseConfigStatusRequest extends TeaModel {
    /**
     * <p>The IDs of the automatic response rules. The value is a JSON array.</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>Specifies whether the rule is enabled. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("InUse")
    public Boolean inUse;

    /**
     * <p>The data management center of the threat analysis feature. Specify this parameter based on the region in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions inside China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class CreateManualBackupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>hgpostcn-cn-721344a2z001</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    public static CreateManualBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateManualBackupRequest self = new CreateManualBackupRequest();
        return TeaModel.build(map, self);
    }

    public CreateManualBackupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateManualBackupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

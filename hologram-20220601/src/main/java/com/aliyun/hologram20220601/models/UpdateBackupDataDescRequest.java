// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateBackupDataDescRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The backup description.</p>
     * 
     * <strong>example:</strong>
     * <p>back up test</p>
     */
    @NameInMap("desc")
    public String desc;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>hgpostcn-cn-721344a2z001</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    public static UpdateBackupDataDescRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBackupDataDescRequest self = new UpdateBackupDataDescRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBackupDataDescRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateBackupDataDescRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateBackupDataDescRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

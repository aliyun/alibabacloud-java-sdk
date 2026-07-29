// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetScheduledBackupConfigRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>hgprecn-cn-9lb3bjg1n003</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The backup type. By default, the operation returns periodical and manual backup configurations. To retrieve the remote backup configuration, set this parameter to \&quot;remote\&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>remote</p>
     */
    @NameInMap("scheduleType")
    public String scheduleType;

    public static GetScheduledBackupConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledBackupConfigRequest self = new GetScheduledBackupConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetScheduledBackupConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetScheduledBackupConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetScheduledBackupConfigRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

}

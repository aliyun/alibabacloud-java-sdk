// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20220220.models;

import com.aliyun.tea.*;

public class SetInstanceRecordConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("ExpirationDays")
    public Integer expirationDays;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>acs:oss:cn-shanghai:123:workbench-record-123-1/record</p>
     */
    @NameInMap("RecordStorageTarget")
    public String recordStorageTarget;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SetInstanceRecordConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceRecordConfigRequest self = new SetInstanceRecordConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetInstanceRecordConfigRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public SetInstanceRecordConfigRequest setExpirationDays(Integer expirationDays) {
        this.expirationDays = expirationDays;
        return this;
    }
    public Integer getExpirationDays() {
        return this.expirationDays;
    }

    public SetInstanceRecordConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetInstanceRecordConfigRequest setRecordStorageTarget(String recordStorageTarget) {
        this.recordStorageTarget = recordStorageTarget;
        return this;
    }
    public String getRecordStorageTarget() {
        return this.recordStorageTarget;
    }

    public SetInstanceRecordConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

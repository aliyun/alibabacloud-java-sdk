// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyBizBandWidthModeRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>> You can call the [DescribeInstanceIds](https://help.aliyun.com/document_detail/157459.html) operation to query the IDs of all instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The metering method of the burstable clean bandwidth feature. Valid values:</p>
     * <br>
     * <p>*   **month**: the metering method of monthly 95th percentile</p>
     * <p>*   **day**: the metering method of daily 95th percentile</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Mode")
    public String mode;

    public static ModifyBizBandWidthModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBizBandWidthModeRequest self = new ModifyBizBandWidthModeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBizBandWidthModeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyBizBandWidthModeRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyBizBandWidthModeRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-zvp2ay9b****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The metering method of the burstable clean bandwidth feature. Valid values:</p>
     * <ul>
     * <li><strong>month</strong>: the metering method of monthly 95th percentile</li>
     * <li><strong>day</strong>: the metering method of daily 95th percentile</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>month</p>
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

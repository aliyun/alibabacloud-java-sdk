// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RebootInstanceRequest extends TeaModel {
    /**
     * <p>Indicates whether to stop the instance forcibly before you reboot it. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ForceStop")
    public String forceStop;

    /**
     * <p>The ID of the instance that you want to reboot. You can specify only one instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-instanceid****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static RebootInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootInstanceRequest self = new RebootInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RebootInstanceRequest setForceStop(String forceStop) {
        this.forceStop = forceStop;
        return this;
    }
    public String getForceStop() {
        return this.forceStop;
    }

    public RebootInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

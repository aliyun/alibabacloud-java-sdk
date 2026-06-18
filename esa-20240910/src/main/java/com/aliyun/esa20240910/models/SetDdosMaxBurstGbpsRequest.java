// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetDdosMaxBurstGbpsRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/2852398.html">ListUserRatePlanInstances</a> operation to obtain the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-site-ads11w</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum burstable protection bandwidth for the DDoS instance in mainland China. The unit is Gbps.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("MaxBurstGbps")
    public String maxBurstGbps;

    public static SetDdosMaxBurstGbpsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDdosMaxBurstGbpsRequest self = new SetDdosMaxBurstGbpsRequest();
        return TeaModel.build(map, self);
    }

    public SetDdosMaxBurstGbpsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetDdosMaxBurstGbpsRequest setMaxBurstGbps(String maxBurstGbps) {
        this.maxBurstGbps = maxBurstGbps;
        return this;
    }
    public String getMaxBurstGbps() {
        return this.maxBurstGbps;
    }

}

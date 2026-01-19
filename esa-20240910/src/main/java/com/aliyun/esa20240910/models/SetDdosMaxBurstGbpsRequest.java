// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetDdosMaxBurstGbpsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-site-ads11w</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
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

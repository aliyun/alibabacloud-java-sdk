// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class PushTimesUsageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6dff6c70-3484-4a39-b725-164e3ad9b20d</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>1000001</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Times")
    public Long times;

    public static PushTimesUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        PushTimesUsageRequest self = new PushTimesUsageRequest();
        return TeaModel.build(map, self);
    }

    public PushTimesUsageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public PushTimesUsageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PushTimesUsageRequest setTimes(Long times) {
        this.times = times;
        return this;
    }
    public Long getTimes() {
        return this.times;
    }

}

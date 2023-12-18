// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RenewInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The renewal duration of the subscription instance.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   1</p>
     * <p>*   2</p>
     * <p>*   3</p>
     * <p>*   4</p>
     * <p>*   5</p>
     * <p>*   6</p>
     * <p>*   7</p>
     * <p>*   8</p>
     * <p>*   9</p>
     * <p>*   12</p>
     */
    @NameInMap("Period")
    public Long period;

    public static RenewInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewInstanceRequest self = new RenewInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RenewInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RenewInstanceRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

}

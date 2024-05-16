// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeFCTriggerRequest extends TeaModel {
    /**
     * <p>The trigger that corresponds to the Function Compute service.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TriggerARN")
    public String triggerARN;

    public static DescribeFCTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFCTriggerRequest self = new DescribeFCTriggerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFCTriggerRequest setTriggerARN(String triggerARN) {
        this.triggerARN = triggerARN;
        return this;
    }
    public String getTriggerARN() {
        return this.triggerARN;
    }

}

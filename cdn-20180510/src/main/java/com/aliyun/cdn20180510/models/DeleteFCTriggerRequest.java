// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteFCTriggerRequest extends TeaModel {
    /**
     * <p>The trigger that corresponds to the Function Compute service.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TriggerARN")
    public String triggerARN;

    public static DeleteFCTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFCTriggerRequest self = new DeleteFCTriggerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFCTriggerRequest setTriggerARN(String triggerARN) {
        this.triggerARN = triggerARN;
        return this;
    }
    public String getTriggerARN() {
        return this.triggerARN;
    }

}

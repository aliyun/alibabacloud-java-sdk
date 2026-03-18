// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class TriggerStackExecutionResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F2D40488-3F74-568B-87EC-1C04D098DF8B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>event-xxxx</p>
     */
    @NameInMap("triggerId")
    public String triggerId;

    public static TriggerStackExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerStackExecutionResponseBody self = new TriggerStackExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public TriggerStackExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TriggerStackExecutionResponseBody setTriggerId(String triggerId) {
        this.triggerId = triggerId;
        return this;
    }
    public String getTriggerId() {
        return this.triggerId;
    }

}

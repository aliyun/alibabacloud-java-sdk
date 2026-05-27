// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class TriggerMmsTimerResponseBody extends TeaModel {
    /**
     * <p>timer id</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("data")
    public Long data;

    /**
     * <strong>example:</strong>
     * <p>0be3e0b716671885050924814e3623</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static TriggerMmsTimerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerMmsTimerResponseBody self = new TriggerMmsTimerResponseBody();
        return TeaModel.build(map, self);
    }

    public TriggerMmsTimerResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public TriggerMmsTimerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

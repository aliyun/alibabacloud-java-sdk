// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetSchedulerInfoResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>pbs: scheduler setting successfully.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BBC2F93D-003A-49C4-850C-B826EECF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetSchedulerInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetSchedulerInfoResponseBody self = new SetSchedulerInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SetSchedulerInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetSchedulerInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

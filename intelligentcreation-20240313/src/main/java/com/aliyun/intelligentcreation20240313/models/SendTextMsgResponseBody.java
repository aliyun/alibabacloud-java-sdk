// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SendTextMsgResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>827BF714-19E7-51B5-A434-C21BFEE05983</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("status")
    public String status;

    public static SendTextMsgResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendTextMsgResponseBody self = new SendTextMsgResponseBody();
        return TeaModel.build(map, self);
    }

    public SendTextMsgResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendTextMsgResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class NotifyContractEventResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static NotifyContractEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NotifyContractEventResponseBody self = new NotifyContractEventResponseBody();
        return TeaModel.build(map, self);
    }

    public NotifyContractEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NotifyContractEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

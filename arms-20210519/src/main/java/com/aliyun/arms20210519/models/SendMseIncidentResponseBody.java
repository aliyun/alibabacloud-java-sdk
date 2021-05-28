// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class SendMseIncidentResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    public static SendMseIncidentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendMseIncidentResponseBody self = new SendMseIncidentResponseBody();
        return TeaModel.build(map, self);
    }

    public SendMseIncidentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SendMseIncidentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

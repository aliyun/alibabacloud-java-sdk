// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteFlowlogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DeleteFlowlogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowlogResponseBody self = new DeleteFlowlogResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFlowlogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFlowlogResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}

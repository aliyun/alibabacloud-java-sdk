// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyFlowLogAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static ModifyFlowLogAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowLogAttributeResponseBody self = new ModifyFlowLogAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFlowLogAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyFlowLogAttributeResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class RemoveReadOnlyAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RemoveReadOnlyAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveReadOnlyAccountResponseBody self = new RemoveReadOnlyAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveReadOnlyAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveReadOnlyAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

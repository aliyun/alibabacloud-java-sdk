// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class RollbackCurrentProjectNodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    @NameInMap("Success")
    public Boolean success;

    public static RollbackCurrentProjectNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackCurrentProjectNodeResponseBody self = new RollbackCurrentProjectNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackCurrentProjectNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RollbackCurrentProjectNodeResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public RollbackCurrentProjectNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

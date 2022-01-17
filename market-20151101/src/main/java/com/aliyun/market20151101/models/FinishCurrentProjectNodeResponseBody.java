// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class FinishCurrentProjectNodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    @NameInMap("Success")
    public Boolean success;

    public static FinishCurrentProjectNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FinishCurrentProjectNodeResponseBody self = new FinishCurrentProjectNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public FinishCurrentProjectNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FinishCurrentProjectNodeResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public FinishCurrentProjectNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

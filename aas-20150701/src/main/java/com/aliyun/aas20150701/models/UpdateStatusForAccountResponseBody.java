// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class UpdateStatusForAccountResponseBody extends TeaModel {
    @NameInMap("PK")
    public String PK;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static UpdateStatusForAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateStatusForAccountResponseBody self = new UpdateStatusForAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateStatusForAccountResponseBody setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

    public UpdateStatusForAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateStatusForAccountResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
